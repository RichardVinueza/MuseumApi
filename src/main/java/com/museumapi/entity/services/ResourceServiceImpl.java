package com.museumapi.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.museumapi.entity.dao.IResourceDao;
import com.museumapi.entity.models.Resources;

@Service
public class ResourceServiceImpl implements IResourceService{
	
	@Autowired
	private IResourceDao resourceDao;
	@Override
	public List<Resources> getAllResources() {
		return (List<Resources>) resourceDao.findAll();
	}
	
	


}
