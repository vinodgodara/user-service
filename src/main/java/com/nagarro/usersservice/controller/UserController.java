package com.nagarro.usersservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.usersservice.model.User;
import com.nagarro.usersservice.model.services.UserService;

@RestController("/")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String home() {
		return "Welcome to User Service";
	}

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable Integer id) {
		return userService.getUserById(id);
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getAll();
	}
}
