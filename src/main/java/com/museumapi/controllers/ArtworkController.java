package com.museumapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.museumapi.entity.models.Artworks;
import com.museumapi.entity.models.Views;
import com.museumapi.entity.services.IArtworkService;

@RestController
public class ArtworkController  {
	
	@Autowired
	private IArtworkService artworkService;
	
	@JsonView(Views.User.class)
	@GetMapping("/api/getArtworks")
	private List<Artworks> getArtworks(){
		return artworkService.getAllArtworks();
	}

}
