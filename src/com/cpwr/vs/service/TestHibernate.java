package com.cpwr.vs.service;

import com.cpwr.vs.entity.User;

public class TestHibernate{
	public static void main(String[] args){
		UserService us = new UserService();
		User u = new User();
		u.setName("name");
		u.setPassword("password");
		u.setEmployeeId(123);
		us.addUser(u);
	}
}
