package com.login.service;

import java.util.List;

import com.login.model.User;

//CRUD

public interface UserService {
	// Methods
	// Create
	public boolean addUser(User user);
	
	// Read
	public List<User> getUsers();
	public User getUserById(int Id);
	
	// Update
	public boolean updateUser(User user);
	
	// Delete
	public boolean deleteUser(User user);
}
