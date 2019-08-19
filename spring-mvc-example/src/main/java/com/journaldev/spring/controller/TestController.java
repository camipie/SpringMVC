package com.journaldev.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Locale locale, Model model) {
		String var="variable1233213";
		model.addAttribute("variable",var);
		return "test"; 
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String handlePost(@RequestParam String action){
		System.out.println("apretaste el boton save");
	    if( action.equals("save") ){
	       //handle save
	    }
	    else if( action.equals("renew") ){
	       //handle renew
	    }
		return action;

	} 
}
