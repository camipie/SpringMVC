
package com.journaldev.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyecto.spring.model.BdDConTXT;

@Controller
public class ReferenciasController {
	
	/*@RequestMapping(value = "/referencias")
    public ModelAndView hola() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("titulo", "Tutoriales Spring MVC :: HelloController");
        mv.addObject("mensaje", "saludo desde el metodo: <br /> "
                + "<code>public ModelAndView hola() {...}</code>");
        
        mv.setViewName("hello");
        return mv;
    }*/

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String referencias(Locale locale, Model model) {
		BdDConTXT b=new	BdDConTXT();
		//b.agregarComntario("hola loco");	
		String var="aca deberia estar el contenido del archivo:"+b.leerContenido();
		model.addAttribute("variable",var);
		return "test"; 
	}
}