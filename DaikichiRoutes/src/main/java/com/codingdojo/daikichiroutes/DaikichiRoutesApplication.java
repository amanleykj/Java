package com.codingdojo.daikichiroutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}
	
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
