package com.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.login.dao.UserDao;
import com.login.model.User;

@Service
@Transactional
public class UserServiceImp implements UserService{

	// Values
	@Autowired
	private UserDao userDao;
	
	// Methods
	@Override
	public boolean addUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public List<User> getUsers() {
		return userDao.getUsers();
	}

	@Override
	public User getUserById(int Id) {
		return userDao.getUserById(Id);
	}

	@Override
	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public boolean deleteUser(User user) {
		return userDao.deleteUser(user);
	}

}
