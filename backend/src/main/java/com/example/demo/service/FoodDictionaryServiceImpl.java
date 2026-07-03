package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.FoodDto;
import com.example.demo.entity.FoodDictionary;
import com.example.demo.repository.FoodDictionaryRepository;

@Service
public class FoodDictionaryServiceImpl implements FoodDictionaryService {

    @Autowired
    private FoodDictionaryRepository foodDictionaryRepository;

    @Override
    public FoodDictionary createFood(FoodDto foodDTO) {

        FoodDictionary food = new FoodDictionary();

        food.setItemName(foodDTO.getItemName());
        food.setBaseServingG(foodDTO.getBaseServingG());
        food.setCaloriesPerServing(foodDTO.getCaloriesPerServing());
        food.setProteinPerServing(foodDTO.getProteinPerServing());
        food.setCarbsPerServing(foodDTO.getCarbsPerServing());
        food.setFatPerServing(foodDTO.getFatPerServing());

        return foodDictionaryRepository.save(food);
    }

    @Override
    public FoodDictionary getFoodById(Long id) {
        return foodDictionaryRepository.findById(id).orElse(null);
    }

    @Override
    public List<FoodDictionary> getAllFoods() {
        return foodDictionaryRepository.findAll();
    }

    @Override
    public FoodDictionary updateFood(Long id, FoodDto foodDTO) {

        FoodDictionary food = foodDictionaryRepository.findById(id).orElse(null);

        if (food != null) {

            food.setItemName(foodDTO.getItemName());
            food.setBaseServingG(foodDTO.getBaseServingG());
            food.setCaloriesPerServing(foodDTO.getCaloriesPerServing());
            food.setProteinPerServing(foodDTO.getProteinPerServing());
            food.setCarbsPerServing(foodDTO.getCarbsPerServing());
            food.setFatPerServing(foodDTO.getFatPerServing());

            return foodDictionaryRepository.save(food);
        }

        return null;
    }

    @Override
    public void deleteFood(Long id) {
        foodDictionaryRepository.deleteById(id);
    }

    @Override
    public List<FoodDictionary> searchFoodByName(String foodName) {
        return foodDictionaryRepository.findByItemNameContainingIgnoreCase(foodName);
    }
}