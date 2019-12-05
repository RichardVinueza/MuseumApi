package com.museumapi.entity.services;

import java.util.List;

import com.museumapi.entity.models.Expositions;

public interface IExpositionService {

	List<Expositions> getAllExpositions();

	Expositions getOneExposition(int id);

	void addExposition(Expositions expo);

	void delete(int id);




}
