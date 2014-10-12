package com.cheehong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.cheehong.domain.User;

@Controller
public class UserController {
	
	/**
	 * This method initiates the CreateUser page.
	 * @param model
	 * @return createUser.jsp
	 */
	@RequestMapping(value = { "/", "index.html", "index.jsp" }, method = RequestMethod.GET)
    public String initiateCreateUserPage(ModelMap model) {
		model.addAttribute("createUserForm", new User());
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
	public String createUser(@ModelAttribute("createUserForm") User user, BindingResult result, SessionStatus status) {
		return "userOverview";
	}

}
