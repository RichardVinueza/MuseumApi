package com.museumapi.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.museumapi.entity.models.Artworks;

public interface IArtworkDao extends CrudRepository<Artworks, Integer>{

}
