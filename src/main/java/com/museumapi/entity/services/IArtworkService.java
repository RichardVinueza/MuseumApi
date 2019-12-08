package com.museumapi.entity.services;

import java.util.List;

import com.museumapi.entity.models.Artworks;

public interface IArtworkService {

	List<Artworks> getAllArtworks();

	Artworks getOneArtwork(int id);

	void addArtwork(Artworks artwork);

	void delete(int id);

	void put(Artworks artwork, int id);

}
