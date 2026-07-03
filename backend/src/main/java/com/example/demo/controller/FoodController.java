package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.FoodDto;
import com.example.demo.entity.FoodDictionary;
import com.example.demo.service.FoodCatalogService;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    @Autowired
    private FoodCatalogService foodCatalogService;

    @PostMapping
    public FoodDictionary createFood(@RequestBody FoodDto foodDTO) {
        return foodCatalogService.createFood(foodDTO);
    }

    @GetMapping("/{id}")
    public FoodDictionary getFoodById(@PathVariable Long id) {
        return foodCatalogService.getFoodById(id);
    }

    @GetMapping
    public List<FoodDictionary> getAllFoods() {
        return foodCatalogService.getAllFoods();
    }

    @PutMapping("/{id}")
    public FoodDictionary updateFood(@PathVariable Long id,
                                     @RequestBody FoodDto foodDTO) {
        return foodCatalogService.updateFood(id, foodDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable Long id) {
        foodCatalogService.deleteFood(id);
    }

    @GetMapping("/search")
    public List<FoodDictionary> searchFoodByName(@RequestParam String itemName) {
        return foodCatalogService.searchFoodByName(itemName);
    }
}