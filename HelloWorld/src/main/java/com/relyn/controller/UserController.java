package com.relyn.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import com.relyn.model.User;
import com.relyn.service.IUserService;


@Controller
@RequestMapping(value = "/user")
public class UserController {


	@Autowired  
	private IUserService userService;

	@RequestMapping(value = "/userInfo")
	@ResponseBody
	public User getUserInfo(HttpServletRequest request) {
		try {
			String userPhone = request.getParameter("userPhone");
			
			User user=userService.getUserById(userPhone);
			return user;
			
		} catch (Exception e) {

		}
		return null;
	}
	
	@RequestMapping(value = "/addUser")
	@ResponseBody
	public User addUser(HttpServletRequest request) {
		try {
			String userPhone = request.getParameter("userPhone");
			User user= new User();
			user.setUserPhone(userPhone);
			user.setUserName("测试");
			userService.insertUser(user);
			return user;
			
		} catch (Exception e) {

		}
		return null;
	}

	
}
