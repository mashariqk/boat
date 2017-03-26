package com.boat.your.dock.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	@RequestMapping(value="/")
	public String fetchHome(){
		return "home";
	}

	@RequestMapping(value = "/denied")
	public String kickEmOut(){
		return "accessDenied";
	}
}
