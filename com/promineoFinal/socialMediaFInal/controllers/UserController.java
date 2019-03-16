package com.promineoFinal.socialMediaFInal.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestController;


@RestController
public class UserController {
	
	List<User> users new ArrayList<User>();
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariables int id) {
		return users.get(id);
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getUsers(){
		return users;
	}
	
	
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public int createUser(@RequestBody User user) {
		return users.size() - 1;
	}
	
	@RequestMappingz(value = "/users", method = RequestMethod.DELETE)
	public User deleteUser(@PathVariable int id) {
		return users.remove(id);
		
	}
}
