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

}
