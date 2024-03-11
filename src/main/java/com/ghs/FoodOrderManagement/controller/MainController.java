package com.ghs.FoodOrderManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.ghs.FoodOrderManagement.entity.Food;
import com.ghs.FoodOrderManagement.repo.FoodRepository;

@Controller
public class MainController {
	
	@Autowired
	private FoodRepository foodRepository;
	
	@RequestMapping(path = "/catalog")
	public String catalog(Model m) {
		List<Food> list = foodRepository.findAll();
		m.addAttribute("foodItems", list);
		return "catalog";
	}
	
	
	
}
