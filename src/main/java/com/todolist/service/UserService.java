package com.todolist.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.entity.User;
import com.todolist.jpa.UserDataJpa;
import org.json.JSONArray;

import java.util.List;

@Service
public class UserService {

	@Autowired
	UserDataJpa userDataJpa;


	public void saveUser(User u) {
		userDataJpa.save(u);

	}

	public List<User> getUsers() {
		return userDataJpa.findAll();
	}
	
	public List<User> findUser(String name){
		return userDataJpa.findByName(name);
	}
}