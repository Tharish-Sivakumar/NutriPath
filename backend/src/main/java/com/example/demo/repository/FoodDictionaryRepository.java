package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FoodDictionary;

public interface FoodDictionaryRepository extends JpaRepository<FoodDictionary, Long> {

    List<FoodDictionary> findByItemNameContainingIgnoreCase(String itemName);

}