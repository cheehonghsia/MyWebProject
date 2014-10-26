package com.cheehong.dao;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cheehong.base.InMemorySetup;
import com.cheehong.domain.User;

/**
 * @author Chee-Hong Hsia
 * Testing the UserDAO class.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class TestUserDAO extends InMemorySetup {
	private User user;
	
	@Before
	public void createUserObject(){
		this.user = new User("12345", "Cheehong", "Hsia", "Eerste Oosterparklaan", "Utrecht");
	}

	@Test
	public void testCreateUser() {
		super.userDAO.createUser(this.user);
		Assert.assertTrue(true);
	}
	
	@Test
	public void testGetUserBy() {
		super.userDAO.createUser(this.user);
		User retrievedUser = super.userDAO.getUserBy("9999999");
		Assert.assertNotNull(retrievedUser);
	}
}
