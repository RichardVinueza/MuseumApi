package com.museumapi.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.museumapi.entity.models.Resources;
import com.museumapi.entity.models.Views;
import com.museumapi.entity.services.IResourceService;

@RestController
public class ResourceController {
	
	@Autowired
	private IResourceService resourceService;
	
	@JsonView(Views.User.class)
	@GetMapping("/api/getResources")
	private List<Resources> getResources(){
		return resourceService.getAllResources();
	}
}
