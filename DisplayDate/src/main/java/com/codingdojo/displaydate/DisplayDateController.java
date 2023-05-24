package com.codingdojo.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DisplayDateController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		
		SimpleDateFormat fullDate = new SimpleDateFormat("EEEE, MMM d, YYYY");	
		Date date = new Date();
		model.addAttribute("date", fullDate.format(date));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		
		SimpleDateFormat fullTime = new SimpleDateFormat("h:mm a");
		Date date = new Date();
		model.addAttribute("time", fullTime.format(date));
		return "time.jsp";
	}
	
	

}
