package com.journaldev.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.model.User;

@Controller
public class HomeController {


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home"; //retorna la vista home en html
	}

	@RequestMapping(value = "/referencias", method = {RequestMethod.GET, RequestMethod.PUT})
	public String referencias(Model model) {
		return "referencias"; //retorna la vista referencias
	}
	
	@RequestMapping(value = "/home", method = {RequestMethod.GET, RequestMethod.PUT})
	public String home(Model model){ 	
		return "home"; //retorna la vista home desde otra página que no sea home
	}
	
}
