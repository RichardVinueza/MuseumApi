package com.museumapi.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.museumapi.entity.dao.IExpositionDao;
import com.museumapi.entity.models.Expositions;

@Service
public class ExpositionServiceImpl implements IExpositionService {
	
	@Autowired
	private IExpositionDao expoDao;
	
	@Override
	public List<Expositions> getAllExpositions() {
		return (List<Expositions>) expoDao.findAll();
	}

	@Override
	public Expositions getOneExposition(int id) {
		return expoDao.findById(id).get();
	}

	@Override
	public void addExposition(Expositions expo) {
		expoDao.save(expo);
	}

	@Override
	public void delete(int id) {
		expoDao.deleteById(id);	
	}




	

}
