package com.cheehong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.cheehong.domain.User;
import com.cheehong.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * This method initiates the CreateUser page.
	 * @param model
	 * @return createUser.jsp
	 */
	@RequestMapping(method = RequestMethod.GET)
    public String initiateCreateUserPage(ModelMap model) {
		model.addAttribute("user", new User());
        return "createUser";
    }

	/**
	 * This method is responsible for the submit functionality of the CreateUser page.
	 * @param user
	 * @param result
	 * @param status
	 * @return userOverview.jsp
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String retrieveOverviewUsers(@ModelAttribute("user") User user, BindingResult result, SessionStatus status) {
		
		//calling the UserService facade class that calls the UserDAO class for handling user creation.
		this.userService.create(user);
		
		return "redirect:userOverview";
	}
	
	/**
	 * After the POST call from createUser.jsp this class triggers the DB and return all users in the Database.
	 * @param model
	 * @return userOverview
	 */
	@RequestMapping(value="/userOverview", method = RequestMethod.GET)
	public String retrieveAllUsers(ModelMap model) {
		
		List<User> users = this.userService.getAllUsers();
		model.addAttribute("users", users);
		return "userOverview";
	}
}
