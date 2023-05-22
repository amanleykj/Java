package com.codingdojo.daikichipathvariables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class DaikichiPathVariablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiPathVariablesApplication.class, args);
	}
	
	@RequestMapping("/lotto/{decider}")
	public String index(@PathVariable("decider") int decider) {
		if(decider % 2 == 0 ) {
			return "You will take a grand journey in the near future, but be wary of tempting offers from no-good charlatans";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend your energies on family and friends ";
		}
	}
	
	@RequestMapping("/travel/{decider}")
	public String travel(@PathVariable("decider") String decider) {
		return "Congratulations! You will soon travel to " + decider;
 	}

}
