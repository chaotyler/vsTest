package com.cpwr.vs.action;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.cpwr.vs.entity.User;
import com.cpwr.vs.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private User user;

	@Resource
	private UserService userService;

	public String addUser(){
		System.out.println("name: " + user.getName());
		System.out.println("password: " + user.getPassword());
		if(user.getName().length() > 0 && user.getPassword().length() > 0){
			userService.addUser(user);
			return SUCCESS;
		}else{
			System.out.println("User name and password can't be empty");
			return ERROR;
		}
	}

	public String login(){
		System.out.println("name: " + user.getName());
		System.out.println("password: " + user.getPassword());
		if(user.getName().equals("root") && user.getPassword().equals("root")){
			return SUCCESS;
		}else{
			System.out.println("Login error");
			return ERROR;
		}
	}

	public UserService getUserService(){
		return userService;
	}

	public void setUserService(UserService userService){
		this.userService = userService;
	}

	public User getUser(){
		return user;
	}

	public void setUser(User user){
		this.user = user;
	}
}
