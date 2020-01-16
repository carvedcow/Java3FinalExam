package com.login.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.login.model.User;

@Repository
public class UserDaoHibernateImp implements UserDao{
	
	// Values
	@Autowired
	private SessionFactory sessionFactory;
	
	// Methods
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public boolean insertUser(User user) {
		getSession().save(user);
		return true;
	}

	@Override
	public List<User> getUsers() {
		//User is not the table name => it is the class name(@Entity)
			return getSession().createQuery("from User", User.class).list();
	}

	@Override
	public User getUserById(int Id) {
		return (User)getSession().get(User.class, Id);
	}

	@Override
	public boolean updateUser(User user) {
		getSession().update(user);
		return true;
	}

	@Override
	public boolean deleteUser(User user) {
		getSession().delete(user);
		return true;
	}

}
