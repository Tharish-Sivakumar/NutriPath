package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.FoodDictionaryDTO;
import com.example.demo.entity.FoodDictionary;

public interface FoodDictionaryService {

    List<FoodDictionary> searchFoods(String query);

    FoodDictionary addCustomFoodItem(FoodDictionaryDTO dto);

    void deleteFood(Long id);

}