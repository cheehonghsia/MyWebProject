package com.cheehong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cheehong.domain.User;

@Controller
public class RootController {
	
	@RequestMapping(value = { "/", "index.html", "index.jsp" }, method = RequestMethod.GET)
    public String getHomePage(ModelMap model) {
		model.addAttribute("createUserForm", new User());
        return "createUser";
    }

}
