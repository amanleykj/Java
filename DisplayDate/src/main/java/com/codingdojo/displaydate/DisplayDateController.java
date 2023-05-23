package com.codingdojo.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.TimeZone;

@Controller
@RequestMapping
public class DisplayDateController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		
//	String date = java.text.DateFormat("EEE, MMM d, YYYY");
// ended off here; just trying to get the date format accomplished; once done, you'll have
// better idea of how to get the time portion working; also, still need CSS and JS components for assignment.
		model.addAttribute("date", date);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		
		TimeZone time = new TimeZone();
		
		model.addAttribute("time", time);
		return "time.jsp";
	}
	
	

}
