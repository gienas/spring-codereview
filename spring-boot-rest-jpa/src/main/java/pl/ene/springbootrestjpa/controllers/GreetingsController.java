package pl.ene.springbootrestjpa.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.ene.springbootrestjpa.domain.Greeting;

@RestController
public class GreetingsController {

	@RequestMapping("/greeting")
	public Greeting greeting( @RequestParam(defaultValue="world") String name) {
	 	return new Greeting(1L, "Hello " + name);
	}	
	
}


