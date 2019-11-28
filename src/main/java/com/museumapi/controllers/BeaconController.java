package com.museumapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.museumapi.entity.services.IBeaconService;
import com.museumapi.entity.models.Beacons;

@RestController
public class BeaconController {
	
	@Autowired
	private IBeaconService beaconService;
	
	@GetMapping("/api/getBeacons")
	private List<Beacons> getBeacons(){
		return beaconService.getAllBeacons();
	}
	
	

}
