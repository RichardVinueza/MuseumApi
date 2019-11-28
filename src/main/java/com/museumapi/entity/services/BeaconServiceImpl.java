package com.museumapi.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.museumapi.entity.dao.IBeaconDao;
import com.museumapi.entity.models.Beacons;

@Service
public class BeaconServiceImpl implements IBeaconService {
	
	@Autowired
	private IBeaconDao beaconDao;
	

	@Override
	public List<Beacons> getAllBeacons() {
		return (List<Beacons>) beaconDao.findAll();
	}

}
