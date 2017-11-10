package com.relyn.model;

public class User {
	public String userName = "";
	public String userPhone = "";
	
	public int id = 0;
	
	public long count = 0;
	
	public long getCount() {
		return count;
	}


	public void setCount(long count) {
		this.count = count;
	}


	public int getId() {
		return id;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
}
