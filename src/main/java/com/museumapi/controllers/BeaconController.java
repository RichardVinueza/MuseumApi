package com.museumapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.museumapi.entity.services.IBeaconService;
import com.fasterxml.jackson.annotation.JsonView;
import com.museumapi.entity.models.Beacons;
import com.museumapi.entity.models.Views;

@RestController
@CrossOrigin(origins="*")
public class BeaconController {
	
	@Autowired
	private IBeaconService beaconService;
	
	@JsonView(Views.User.class)
	@GetMapping("/api/getBeacons")
	private List<Beacons> getBeacons(){
		return beaconService.getAllBeacons();
	}
	
	

}
