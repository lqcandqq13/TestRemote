package com.relyn.service;

import com.relyn.model.User;

public interface IUserService {
	  public User getUserById(String userPhone); 
	  
	  public void insertUser(User user); 
}
