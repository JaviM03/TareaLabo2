package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Credenciales;

@Controller
public class MainController {
	/*Username: javier
	 * Contraseña: 1234*/
	private String nombre = "javier";
	private String pass = "1234";

	 @GetMapping("/login")
	    public String enviarForm(Credenciales user, Credenciales password) {

	        return "login";
	    }

	    @PostMapping("/validacion")
	    public String procesarForm(Credenciales user, Credenciales password) {

	    	if (user.getUser().equals(nombre) && user.getPassword().equals(pass)) {
	        return "mostrarMensajeV";
	    	} else {
	    		return "mostrarMensajeF";
	    	}
	    }

}
