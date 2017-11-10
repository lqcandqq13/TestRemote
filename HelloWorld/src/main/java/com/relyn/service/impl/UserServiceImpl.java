package com.relyn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relyn.dao.UserDao;
import com.relyn.model.User;
import com.relyn.service.IUserService;
@Service("UserServiceImpl") 
public class UserServiceImpl implements IUserService {

	@Autowired    
	private UserDao userDao;

	@Override
	public synchronized User getUserById(String userPhone) {
		User user=userDao.getUserByUserPhone(userPhone);
		user.count--;
		userDao.updateUser(user);
		return user;
	}

	@Override
	public void insertUser(User user) {
		userDao.insertUser(user);
		
	}

}
