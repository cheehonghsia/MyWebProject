package com.cheehong.dao;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cheehong.base.InMemorySetup;

/**
 * @author Chee-Hong Hsia
 * Testing the UserDAO class.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class TestUserDAO extends InMemorySetup {

	@Test
	public void testCreateUser() {
		super.userDAO.create(super.user);
		Assert.assertEquals("john", super.user.getFirstname());
		Assert.assertEquals(1, super.user.getBankaccounts().size());
		Assert.assertTrue("User " + super.user + " is created", true);
		
	}
}
