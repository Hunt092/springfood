package com.ghs.FoodOrderManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String catalog() {
		System.out.println("This is catalog page");
		return "catalog";
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("This is home page");
		return "home";
	}
}
