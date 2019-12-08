package com.museumapi.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.museumapi.entity.dao.IArtworkDao;
import com.museumapi.entity.models.Artworks;

@Service
public class ArtworkServiceImpl implements IArtworkService {
	
	@Autowired
	private IArtworkDao artworkDao;
	
	@Override
	public List<Artworks> getAllArtworks() {
		return (List<Artworks>) artworkDao.findAll();
	}

	@Override
	public Artworks getOneArtwork(int id) {
		return artworkDao.findById(id).get();
	}

	@Override
	public void addArtwork(Artworks artwork) {
		artworkDao.save(artwork);	
	}

	@Override
	public void delete(int id) {
		artworkDao.deleteById(id);
	}

	@Override
	public void put(Artworks artwork, int id) {
		artworkDao.findById(id).ifPresent((x)->{
			artwork.setIdArtwork(id);
		});
		artworkDao.save(artwork);
	}
	
	
	
}
