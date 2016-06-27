/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo4.presentacion.managerbeans;

import javax.inject.Named;
import javax.enterprise.context.ConversationScoped;
import java.io.Serializable;

/**
 *
 * @author hernando
 */
@Named(value = "conversationController")
@ConversationScoped
public class ConversationController implements Serializable {

    /**
     * Creates a new instance of ConversationController
     */
    public ConversationController() {
    }
    
}
