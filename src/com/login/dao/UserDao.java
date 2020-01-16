package com.login.dao;

import java.util.List;

import com.login.model.User;

//CRUD

public interface UserDao {
	// Methods
	// Create
	public boolean insertUser(User user);
	
	// Read
	public List<User> getUsers();
	
	public User getUserById(int Id);
	
	// Update
	public boolean updateUser(User user);
	
	// Delete
	public boolean deleteUser(User user);
}
