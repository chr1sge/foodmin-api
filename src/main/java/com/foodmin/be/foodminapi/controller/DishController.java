package com.foodmin.be.foodminapi.controller;

import com.foodmin.be.foodminapi.model.Dish;
import com.foodmin.be.foodminapi.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class DishController {

    @Autowired
    private DishRepository dishRepository;

    @GetMapping("/entries")
    public List<Dish> getEntries() {
        return dishRepository.findAll();
    }
}
