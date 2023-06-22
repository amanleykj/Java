package com.dojosandninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojosandninjas.models.Dojo;
import com.dojosandninjas.models.Ninja;
import com.dojosandninjas.services.DojoService;
import com.dojosandninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	
	@Autowired
	NinjaService ninjaService;
	@Autowired
	DojoService dojoService;
	
	@GetMapping("/")
	public String home(@ModelAttribute("dojos") Dojo dojo, Model model) {
		List<Dojo> dojos = dojoService.getAllDojos();
		model.addAttribute("dojos", dojos);
		return "root.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String dojo(Model model) {
		model.addAttribute("dojo", new Dojo());
		return "createDojo.jsp";
	}
	
	@PostMapping("/registerDojo")
	public String registerDojo(
			@Valid @ModelAttribute("dojo") Dojo dojo,
			BindingResult result,
			Model model
			)
	{
		if(result.hasErrors()) {
			dojoService.register(dojo, result);
			model.addAttribute("dojo", new Dojo());
			return "createDojo.jsp";
		}
		dojoService.register(dojo, result);
		return "redirect:/";
	}
	
	@GetMapping("/ninjas/new")
	public String ninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> allDojos = dojoService.getAllDojos();
		model.addAttribute("allDojos", allDojos);
		model.addAttribute("ninja", new Ninja());
		return "createNinja.jsp";
	}
	
	@PostMapping("/registerNinja")
	public String registerNinja(
			@Valid @ModelAttribute("ninja") Ninja ninja,
			BindingResult result,
			Model model
			)
		{
		ninjaService.register(ninja, result);
		if(result.hasErrors()) {
			List<Dojo> allDojos = dojoService.getAllDojos();
			model.addAttribute("allDojos", allDojos);
			return "createNinja.jsp";
		}
		return "redirect:/dojos/" + ninja.getDojo().getId();
	}
	
	@GetMapping("/dojos/{id}")
	public String dojo(@Valid @PathVariable("id") Long id, @ModelAttribute("dojo") Dojo dojo, Model model) {
		model.addAttribute("dojo", dojoService.getOneDojo(id));
		return "dojoPage.jsp";
	}

}
