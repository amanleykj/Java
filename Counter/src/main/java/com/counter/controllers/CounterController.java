package com.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	
	@RequestMapping("/your_server")
	public String index(HttpSession session) {
		
		Integer number = 0;
		
		if(session.getAttribute("number") == null) {
			session.setAttribute("number", 0);
		}
		else {
			number = (Integer) session.getAttribute("number");
			number++;
			session.setAttribute("number", number);
		}
		return "index.jsp";
	}

	@RequestMapping("/your_server/counter")
	public String counter(HttpSession session) {
				
		return "counter.jsp";
	}
	
	@RequestMapping("/your_server_double")
	public String doubleCounter(HttpSession session) {
		
		Integer number = 0;
		
		if(session.getAttribute("number") == null) {
			session.setAttribute("number", 0);
		}
		else {
			number = (Integer) session.getAttribute("number");
			number += 2;
			session.setAttribute("number", number);
		}
		return "counter.jsp";
	}
	
	@RequestMapping("/shutdown")
	public String shutdown(HttpSession session) {
		session.setAttribute("number", 0);
		return "counter.jsp";
	}
	
}
