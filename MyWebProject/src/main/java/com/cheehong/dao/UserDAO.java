package com.cheehong.dao;

import java.util.List;

import com.cheehong.domain.User;

/**
 * @author Chee-Hong Hsia
 * UserDAO interface.
 *
 */
public interface UserDAO {

	public void createUser(User user);
	
	public User getUserBy(String BSN);

	public List<User> getAllUsers();

	public void delete(String userID);

}
