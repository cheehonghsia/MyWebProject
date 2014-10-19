package com.cheehong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cheehong.dao.UserDAO;
import com.cheehong.domain.User;

/**
 * @author Chee-Hong Hsia
 * Concrete class of the UserService Interface.
 *
 */
@Component
public class UserServiceImpl implements UserService {
	
	@Autowired UserDAO userDAO;

	public void create(User user) {
		this.userDAO.createUser(user);
	}

	public void modify(long userID) {
		// TODO Auto-generated method stub

	}

	public void delete(long userID) {
		// TODO Auto-generated method stub

	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser(long userID) {
		// TODO Auto-generated method stub
		return null;
	}

}
