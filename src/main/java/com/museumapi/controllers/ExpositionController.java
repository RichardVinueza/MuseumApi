package com.museumapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.museumapi.entity.models.Expositions;
import com.museumapi.entity.models.Views;
import com.museumapi.entity.services.IExpositionService;

@RestController
public class ExpositionController {
	
	@Autowired
	private IExpositionService expoService;
	
	@JsonView(Views.User.class)
	@GetMapping("/api/getExpositions")
	private List<Expositions> getExpositions(){
		return expoService.getAllExpositions();
	}
	
	@JsonView(Views.User.class)
	@GetMapping("/api/getExposition/{id}")
	private Expositions getExposition(@PathVariable(value = "id")int id ) {
		return expoService.getOneExposition(id);
	}
	
	@PostMapping("/api/postExposition")
	private void addExposition(Expositions expo) {
		 expoService.addExposition(expo);
	}
	
	@DeleteMapping("/api/deleteExposition/{id}")
	private void deleteExposition(@PathVariable(value = "id")int id) {
		 expoService.delete(id);
		
	}

}
