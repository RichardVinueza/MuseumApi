package com.museumapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.museumapi.entity.models.Expositions;
import com.museumapi.entity.models.Views;
import com.museumapi.entity.services.IExpositionService;

@RestController
public class ExpositionController {
	
	@Autowired
	private IExpositionService expoService;
	
	@JsonView(Views.ClientUser.class)
	@GetMapping("/api/getExpositions")
	private List<Expositions> getExpositions(){
		return expoService.getAllExpositions();
	}

}
