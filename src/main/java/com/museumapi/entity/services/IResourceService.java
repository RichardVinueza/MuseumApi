package com.museumapi.entity.services;

import java.util.List;

import com.museumapi.entity.models.Resources;

public interface IResourceService {

	List<Resources> getAllResources();

	Resources getOneResource(int id);

	void addResource(Resources resource);

}
