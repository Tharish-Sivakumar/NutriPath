package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.MealConsumptionDto;
import com.example.demo.entity.DailyTracker;

public interface DailyTrackerService {

    DailyTracker getOrCreateCurrentTracker(String email);

    DailyTracker logMealConsumption(String email, MealConsumptionDto dto);

    void deleteMeal(Long id);

    List<DailyTracker> getAllTrackers();
}