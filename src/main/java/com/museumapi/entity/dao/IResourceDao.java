package com.museumapi.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.museumapi.entity.models.Resources;

public interface IResourceDao extends CrudRepository<Resources, Integer>{

}
