package com.ghs.FoodOrderManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghs.FoodOrderManagement.entity.Food;
import com.ghs.FoodOrderManagement.repo.FoodRepository;

@Service
public class FoodService {

	@Autowired
	private FoodRepository foodRepository;

	public Food addFoodItem(Food food) {
		Food request = foodRepository.findByName(food.getName());
		if(request != null) {
			return null;
		}else {
			return foodRepository.save(food);
		}
	}

	public List<Food> getAllFoodItems() {
		return foodRepository.findAll();
	}

	public Food getFoodItemById(Long id) {
		return foodRepository.findById(id).orElse(null);
	}

	public Food updateFoodItem(Food food) {
		Food existingFood = foodRepository.findById(food.getFoodId()).orElse(null);

		if (existingFood != null) {
			return foodRepository.save(food);
		}
		return null;
	}

	public Food deleteFood(Long id) {
		Food food = foodRepository.findById(id).orElse(null);
		if (food == null) {
			return null;
		} else {
			foodRepository.deleteById(id);
			return food;
		}
	}
}
