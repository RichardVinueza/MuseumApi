package com.museumapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@JsonView(Views.User.class)
	@GetMapping("/api/getArtwork/{id}")
	private Artworks getArtwork(@PathVariable(value = "id")int id){
		return artworkService.getOneArtwork(id);
	}
	
	@PostMapping("api/postArtwork")
	private void addArtwork(Artworks artwork) {
		artworkService.addArtwork(artwork);
	}
	
	@DeleteMapping("api/deleteArtwork/{id}")
	private void deleteArtwork(@PathVariable(value = "id") int id) {
		artworkService.delete(id);
	}
	
	@PutMapping("/api/putArtwork/{id}")
	private void putArtwork(Artworks artwork, @PathVariable(value = "id")int id) {
		artworkService.put(artwork, id);
	}
		

}
