package com.todolist.jpa;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import com.todolist.entity.User;

import java.util.List;

@Repository
public interface UserDataJpa extends CrudRepository<User, String>{

	
	
	public User save(User user);

	@Query("Select e from User e")
	public List<User> findAll();
	
	public List<User> findByName(String name);
}
