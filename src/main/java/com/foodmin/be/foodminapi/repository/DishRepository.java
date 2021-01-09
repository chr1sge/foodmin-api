package com.foodmin.be.foodminapi.repository;

import com.foodmin.be.foodminapi.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {
    Dish findDishById(Long dishId);
}
