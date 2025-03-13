package com.MainApp.Pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;


@Entity
@Table(name="userinfo")
public class User {

	@Id
	String userName;
	@Column
	String password;
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		
	
}
