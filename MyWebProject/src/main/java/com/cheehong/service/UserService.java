package com.cheehong.service;

import java.util.List;

import com.cheehong.domain.User;

/**
 * @author Chee-Hong Hsia
 *	UserService interface.
 */
public interface UserService {

	/**
	 * Method for creating a User.
	 */
	public void create(User user);

	/**
	 * Method for modifying a specific user.
	 */
	public void modify(long userID);

	/**
	 * Method for deleting a specific user.
	 */
	public void delete(long userID);

	/**
	 * Method for retrieving all users.
	 * @return a list of users.
	 */
	public List<User> getAllUsers();

	/**
	 * Method for retrieving a specific user.
	 * @param userID
	 * @return a user.
	 */
	public User getUser(long userID);

}
