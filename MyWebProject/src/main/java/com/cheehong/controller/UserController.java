package com.cheehong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.cheehong.domain.User;

@Controller
public class UserController {

	@RequestMapping(method = RequestMethod.POST)
	public String processSubmit(@ModelAttribute("createUserForm") User user, BindingResult result, SessionStatus status) {
		
		
		return "userOverview";
	}

}
