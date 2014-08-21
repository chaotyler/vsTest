package com.cpwr.vs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User{

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "password")
	private String password;

	@Column(name = "employeeId")
	private int employeeId;

	public long getId(){
		return id;
	}

	public void setId(long id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public int getEmployeeId(){
		return employeeId;
	}

	public void setEmployeeId(int employeeId){
		this.employeeId = employeeId;
	}

}
