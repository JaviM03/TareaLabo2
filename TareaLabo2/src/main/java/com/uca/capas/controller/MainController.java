package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Credenciales;

@Controller
public class MainController {

	 @GetMapping("/login")
	    public String enviarForm(Credenciales user, Credenciales password) {

	        return "login";
	    }

	    @PostMapping("/login")
	    public String procesarForm(Credenciales user, Credenciales password) {

	    	if ("javier".equals(user) && "1234".equals(password)) {
	        return "mostrarMensajeV";
	    	} else {
	    		return "mostrarMensajeF";
	    	}
	    }

}
