package com.codingdojo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
			@RequestMapping("")
			public String index() {
				return "Welcome!";
			}
			@RequestMapping("/today")
			public String today() {
				return "Fortune will smile upon you on this day.";
			}
			@RequestMapping("/tomorrow")
			public String tomorrow() {
				return "Tomorrow never dies.";
			}

}
