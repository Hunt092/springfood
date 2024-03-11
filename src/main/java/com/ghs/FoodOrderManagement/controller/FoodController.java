package com.ghs.FoodOrderManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ghs.FoodOrderManagement.entity.Food;
import com.ghs.FoodOrderManagement.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {

	@Autowired
	private FoodService foodService;
	
	@GetMapping("/items")
	public List<Food> getAllFoodItems(){
		return foodService.getAllFoodItems();
	}
	
	@GetMapping("/items/{id}")
	public ResponseEntity<?> getUserById(@PathVariable Long id) {
		Food food = foodService.getFoodItemById(id);
		if(food == null) {
			return new ResponseEntity<String>("Food item with id " + id + " not found !", HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<Food>(food, HttpStatus.FOUND);
		}
	}
	
	@PostMapping("/addItem")
	public ResponseEntity<?> addUser(@RequestBody Food food) {
		Food request = foodService.addFoodItem(food);
		if(request == null) {
			return new ResponseEntity<String>("Food with same name already exists!", HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<Food>(request, HttpStatus.OK);
		}
	}
	
	@PutMapping("/modifyItem")
	public ResponseEntity<?> updateFoodItem(@RequestBody Food food) {
		Food request = foodService.updateFoodItem(food);
		if(request == null) {
			return new ResponseEntity<String>("No food item with id "+food.getFoodId()+" found !", HttpStatus.NOT_FOUND);
		}else {			
			return new ResponseEntity<Food>(food, HttpStatus.ACCEPTED);
		}
	}
	
	@DeleteMapping("/deleteItem/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Long id) {
		Food request =  foodService.deleteFood(id);
		if(request == null) {
			return new ResponseEntity<String>("Food item not found !", HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<Food>(request, HttpStatus.OK);
		}
	}
	
}
