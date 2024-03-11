package com.ghs.FoodOrderManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ghs.FoodOrderManagement.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long>{

	public Food findByName(String name);
}
