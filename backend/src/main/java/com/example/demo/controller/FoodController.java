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
    private FoodCatalogService foodDictionaryService;

    @PostMapping
    public FoodDictionary createFood(@RequestBody FoodDto foodDTO) {
        return foodDictionaryService.createFood(foodDTO);
    }

    @GetMapping("/{id}")
    public FoodDictionary getFoodById(@PathVariable Long id) {
        return foodDictionaryService.getFoodById(id);
    }

    @GetMapping
    public List<FoodDictionary> getAllFoods() {
        return foodDictionaryService.getAllFoods();
    }

    @PutMapping("/{id}")
    public FoodDictionary updateFood(@PathVariable Long id,
                                     @RequestBody FoodDto foodDTO) {
        return foodDictionaryService.updateFood(id, foodDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable Long id) {
        foodDictionaryService.deleteFood(id);
    }

    @GetMapping("/search")
    public List<FoodDictionary> searchFoodByName(@RequestParam String itemName) {
        return foodDictionaryService.searchFoodByName(itemName);
    }
}