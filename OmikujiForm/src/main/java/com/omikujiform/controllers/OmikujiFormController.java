package com.omikujiform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiFormController {
	
	@RequestMapping("/omikuji")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(
			@RequestParam(value = "number") Integer number,
			@RequestParam(value = "city") String city,
			@RequestParam(value = "person") String person,
			@RequestParam(value = "endeavorHobby") String endeavorHobby,
			@RequestParam(value = "livingThing") String livingThing,
			@RequestParam(value = "somethingNice") String somethingNice,
			HttpSession session
			)
	{
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("endeavorHobby", endeavorHobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("somethingNice", somethingNice);
		
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/omikuji/show")
	public String show() {
		return "welcome.jsp";
	}

}
