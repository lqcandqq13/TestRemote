package com.relyn.dao;

import com.relyn.model.User;

public interface UserDao {
	
	public User getUserByUserPhone(String userPhone);
	
	public void updateUser(User user);
	
	public void insertUser(User user);
	
}
