package com.museumapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.museumapi.entity.models.Users;
import com.museumapi.entity.models.Views;
import com.museumapi.entity.services.IUserService;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private IUserService userService;
	
	@JsonView(Views.User.class)
	@GetMapping("/api/getUsers")
	private List<Users> getUsers(){
		return userService.getAllUsers();		
	}
	
	@JsonView(Views.User.class)
	@GetMapping("/api/getUser/{id}")
	private Users getOne(@PathVariable(value = "id") int id) {
		return userService.getOneUser(id);		
	}
	
	@PostMapping("api/postUser")
	private void addUser(Users user) {
		userService.addUser(user);
	}
	
	@DeleteMapping("api/deleteUser/{id}")
	private void deleteUser(@PathVariable(value = "id")int id) {
		userService.delete(id);
		
	}
	
	@PutMapping("api/putUser/{id}")
	private void putUser(Users user, @PathVariable(value = "id")int id) {
		userService.put(user, id);
	}
		
}
