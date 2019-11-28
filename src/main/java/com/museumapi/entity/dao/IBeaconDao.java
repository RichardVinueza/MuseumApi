package com.museumapi.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.museumapi.entity.models.Beacons;

public interface IBeaconDao extends CrudRepository<Beacons, Integer>{

}
