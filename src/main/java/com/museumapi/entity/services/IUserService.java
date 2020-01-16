package com.museumapi.entity.services;

import java.util.List;

import com.museumapi.entity.models.Users;

public interface IUserService {

	List<Users> getAllUsers();

	void delete(int id);

	void put(Users user, int id);

	Users getOneUser(int id);

	void addUser(Users user);

	String showJReport(String formatReport);



}
