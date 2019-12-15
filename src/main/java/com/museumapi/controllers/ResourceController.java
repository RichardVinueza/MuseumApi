package com.museumapi.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.museumapi.entity.models.Resources;
import com.museumapi.entity.models.Views;
import com.museumapi.entity.services.IResourceService;

@RestController
@CrossOrigin(origins="*")
public class ResourceController {
	
	@Autowired
	private IResourceService resourceService;
	
	@JsonView(Views.User.class)
	@GetMapping("/api/getResources")
	private List<Resources> getResources(){
		return resourceService.getAllResources();
	}
	
	@JsonView(Views.User.class)
	@GetMapping("api/getResource/{id}")
	private Resources getResource(@PathVariable(value = "id") int id) {
		return resourceService.getOneResource(id);
		
	}
	
	@PostMapping("/api/postResource")
	private void addResource(Resources resource) {
		resourceService.addResource(resource);
	}
}
