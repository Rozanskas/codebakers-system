package com.codebakers.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebakers.system.daoInterface.CourseDAO;
import com.codebakers.system.daoInterface.UserRepository;
import com.codebakers.system.model.User;
import com.codebakers.system.serviceInterface.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userDao;

	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}

	@Override
	public int enableUserById(int id) {
		return userDao.enableUserById(id);
	}

	@Override
	public int disableUSerById(int id) {
		return userDao.disableuserbyId(id);
		
	}
	
	

}
