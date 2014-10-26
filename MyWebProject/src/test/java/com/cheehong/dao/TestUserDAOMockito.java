package com.cheehong.dao;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.cheehong.domain.User;

public class TestUserDAOMockito {
	
	private static UserDAO mockedUserDAO;
	private static User userA, userB; 

	@BeforeClass
	public static void setUp() {
		
		mockedUserDAO = mock(UserDAOImpl.class);
		userA = new User("12345", "Cheehong", "Hsia", "Eerste Oosterparklaan", "Utrecht");
		userB = new User("55555", "Pavel", "Tzekov", "Kamelenspoor", "Maarssen");
	
		when(mockedUserDAO.getAllUsers()).thenReturn(Arrays.asList(userA, userB));
		Mockito.doThrow(new RuntimeException()).when(mockedUserDAO).createUser(userA);
		
		
	}

	@Test
	public void testGetAllUsers() {
		Assert.assertEquals(2, mockedUserDAO.getAllUsers().size());
	}
	
	@Test(expected=RuntimeException.class)
	public void testCreateUserWithException() {
		mockedUserDAO.createUser(userA);
	}
}
