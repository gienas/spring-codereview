package pl.ene.springbootrestjpa.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.ene.springbootrestjpa.domain.Customer;
import pl.ene.springbootrestjpa.repository.UserRepository;

@RestController
public class UserController {

	private UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		// TODO Auto-generated constructor stub
		this.userRepository = userRepository;
	}
	
	@RequestMapping("/user/{name}")
	Customer getUser(@PathVariable(name = "name") String name) {
		//TODO implementation
		return null;
	}

	@RequestMapping("/users")
	public List<Customer> users() {
		List<Customer> result = new ArrayList<>();
		userRepository.findAll().forEach(result::add);
		return result;
	}

}
