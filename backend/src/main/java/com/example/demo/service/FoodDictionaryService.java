package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.FoodDictionaryDTO;
import com.example.demo.entity.FoodDictionary;

public interface FoodDictionaryService {

    FoodDictionary createFood(FoodDictionaryDTO foodDTO);

    FoodDictionary getFoodById(Long id);

    List<FoodDictionary> getAllFoods();

    FoodDictionary updateFood(Long id, FoodDictionaryDTO foodDTO);

    void deleteFood(Long id);

    List<FoodDictionary> searchFoodByName(String itemName);
}