package com.museumapi.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.museumapi.entity.models.Users;

public interface IUserDao extends CrudRepository<Users, Integer> {



}
