
package com.journaldev.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyecto.spring.model.BdDConTXT;

@Controller
public class TestController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Locale locale, Model model) {
		BdDConTXT b=new	BdDConTXT();
		//b.agregarComntario("hola loco");		
		String var="aca deberia estar el contenido del archivo:"+b.leerComentarios();
		model.addAttribute("variable",var);
		return "test"; 
	}
}