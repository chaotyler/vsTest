package com.cpwr.vs.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import com.cpwr.vs.entity.User;

public class UserDao{

	private SessionFactory sessionFactory;
	
	public void addUser(User user) throws HibernateException{
		sessionFactory.openSession().save(user);
	}

	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
}