/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplojee8.controller;

import edu.co.sena.ejemplojee8.controller.util.ErrorBean;
import edu.co.sena.ejemplojee8.controller.util.ValidationUtil;
import edu.co.sena.ejemplojee8.service.facade.CargoFacade;
import entities.Cargo;
import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author hernando
 */
@Path("cargo")
public class CargoController {

    @Inject
    private Models model;
    @Inject
    private CargoFacade facade;
    @Inject
    private BindingResult validationResult;
    @Inject
    private ErrorBean error;

    @GET
    @Path("new")
    @Controller
    public String emptyCargo() {
        return "/view/cargo/create.jsp";
    }

    @POST
    @Path("new")
    @Controller
    @ValidateOnExecution(type = ExecutableType.NONE)
    public String createCargo(@Valid
            @BeanParam Cargo entity) {
        if (validationResult.isFailed()) {
            return ValidationUtil.getResponse(validationResult, error);
        }
        facade.create(entity);
        return "redirect:cargo/list";
    }

    @GET
    @Path("update/{id}")
    @Controller
    public String editCargo(@PathParam("id") String id) {
        model.put("CARGO", facade.find(id));
        return "/view/cargo/update.jsp";
    }

    @POST
    @Path("update")
    @Controller
    @ValidateOnExecution(type = ExecutableType.NONE)
    public String updateCargo(@Valid
            @BeanParam Cargo entity) {
        if (validationResult.isFailed()) {
            return ValidationUtil.getResponse(validationResult, error);
        }
        facade.edit(entity);
        return "redirect:cargo/list";
    }

    @GET
    @Path("remove/{id}")
    @Controller
    public String removeCargo(@PathParam("id") String id) {
        facade.remove(facade.find(id));
        return "redirect:cargo/list";
    }

    @GET
    @Path("{id}")
    @Controller
    public String findCargo(@PathParam("id") String id) {
        model.put("CARGO", facade.find(id));
        return "/view/cargo/view.jsp";
    }

    @GET
    @Path("list")
    @Controller
    public String findAllCargo() {
        model.put("CARGO_LIST", facade.findAll());
        return "/view/cargo/list.jsp";
    }
    
}
