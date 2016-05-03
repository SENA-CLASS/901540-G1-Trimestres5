/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplojee82.controller;

import edu.co.sena.ejemplojee82.Cargo;
import edu.co.sena.ejemplojee82.controller.util.ErrorBean;
import edu.co.sena.ejemplojee82.controller.util.ValidationUtil;
import edu.co.sena.ejemplojee82.service.facade.CargoFacade;
import javax.inject.Inject;
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
    private javax.mvc.Models model;
    @Inject
    private CargoFacade facade;
    @Inject
    private javax.mvc.binding.BindingResult validationResult;
    @Inject
    private ErrorBean error;

    @GET
    @Path("new")
    @javax.mvc.annotation.Controller
    public String emptyCargo() {
        return "/view/cargo/create.jsp";
    }

    @POST
    @Path("new")
    @javax.mvc.annotation.Controller
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
    @javax.mvc.annotation.Controller
    public String editCargo(@PathParam("id") String id) {
        model.put("CARGO", facade.find(id));
        return "/view/cargo/update.jsp";
    }

    @POST
    @Path("update")
    @javax.mvc.annotation.Controller
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
    @javax.mvc.annotation.Controller
    public String removeCargo(@PathParam("id") String id) {
        facade.remove(facade.find(id));
        return "redirect:cargo/list";
    }

    @GET
    @Path("{id}")
    @javax.mvc.annotation.Controller
    public String findCargo(@PathParam("id") String id) {
        model.put("CARGO", facade.find(id));
        return "/view/cargo/view.jsp";
    }

    @GET
    @Path("list")
    @javax.mvc.annotation.Controller
    public String findAllCargo() {
        model.put("CARGO_LIST", facade.findAll());
        return "/view/cargo/list.jsp";
    }
    
}
