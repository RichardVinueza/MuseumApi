package com.museumapi.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.museumapi.entity.dao.IUserDao;
import com.museumapi.entity.models.Users;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserDao userDao;

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<Users>) userDao.findAll();
	}

	@Override
	public Users getOneUser(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id).get();
	}


	@Override
	public void delete(int id) {
		userDao.deleteById(id);
		
	}

	@Override
	public void put(Users user, int id) {
		userDao.findById(id).ifPresent((x)->{
			user.setIdUser(id);
			userDao.save(user);
		});
		
	}

	@Override
	public void addUser(Users user) {
		System.out.println("tibu servicio" + user.getEmail());
		userDao.save(user);
		
	}







		
	

		
	


}
