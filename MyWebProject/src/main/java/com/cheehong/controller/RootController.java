package com.cheehong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RootController {
	
	@RequestMapping(value = { "/", "index.html" }, method = RequestMethod.GET)
    public String getHomePage() {
        return "home";
    }

}
