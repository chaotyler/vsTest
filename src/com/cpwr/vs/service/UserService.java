package com.cpwr.vs.service;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.cpwr.vs.dao.UserDao;
import com.cpwr.vs.entity.User;

public class UserService{

	@Resource
	private UserDao userDao;

	public void addUser(User user){
		userDao.addUser(user);
	}

	public UserDao getUserDao(){
		return userDao;
	}

	public void setUserDao(UserDao userDao){
		this.userDao = userDao;
	}
}
