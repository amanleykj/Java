package com.loginandregistration.controllers;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.loginandregistration.models.LoginUser;
import com.loginandregistration.models.User;
import com.loginandregistration.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String mainPage(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("loginuser", new LoginUser());
		return "login.jsp";
	}
	
	@GetMapping("/home")
	public String home(Model model, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("user", userService.getOneUser((Long)session.getAttribute("userId")));
		return "home.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("user") User user, BindingResult result, Model model, HttpSession session) {
		userService.register(user, result);
		if(result.hasErrors())  {
			model.addAttribute("loginuser", new LoginUser());
			return "login.jsp";
		}
		session.setAttribute("userId", user.getId());
		System.out.println("session variable: " + session.getAttribute("userId"));
		return "redirect:/home";
	}
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("loginuser") LoginUser user, BindingResult result, Model model, HttpSession session) {
		if(result.hasErrors())  {
			model.addAttribute("user", new User());
			return "login.jsp";
		}
		User user1 = userService.login(user, result);
		session.setAttribute("userId", user1.getId());
		System.out.println("session variable: " + session.getAttribute("userId"));
		return "redirect:/home";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("userId", null);
		return "redirect:/";
	}

}

