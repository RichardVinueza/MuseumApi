package com.museumapi.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.museumapi.entity.models.Expositions;

public interface IExpositionDao extends CrudRepository<Expositions, Integer> {

}
