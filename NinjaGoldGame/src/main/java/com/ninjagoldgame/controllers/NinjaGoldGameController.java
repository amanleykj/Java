package com.ninjagoldgame.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaGoldGameController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		Integer myGold = 0;
		ArrayList<String> activities = null;
		
		if(session.getAttribute("myGold") == null) {
			session.setAttribute("myGold", 0);
		}
		else {	
			myGold = (Integer) session.getAttribute("myGold");
			session.setAttribute("myGold", myGold);
		}
		return "index.jsp";
	}
	
	@RequestMapping(value = "/findFarmGold", method = RequestMethod.POST)
	public String findFarmGold(HttpSession session, Model model) {
		Integer myGold = (Integer) session.getAttribute("myGold");
		Random rand = new Random();
		myGold += rand.nextInt((20 - 10) + 1) + 10;
		session.setAttribute("myGold", myGold);
		SimpleDateFormat fullDate = new SimpleDateFormat("EEEE, MMM d, YYYY");
		Date date = new Date();
		model.addAttribute("date", fullDate.format(date));
		session.setAttribute("date", date);
		
		return "redirect:/";
	}

}
