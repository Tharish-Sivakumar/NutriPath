package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MealConsumptionDTO;
import com.example.demo.entity.DailyTracker;
import com.example.demo.repository.DailyTrackerRepository;

@Service
public class DailyTrackerServiceImpl implements DailyTrackerService {

    @Autowired
    private DailyTrackerRepository dailyTrackerRepository;

    @Override
    public DailyTracker getOrCreateCurrentTracker(String email) {
        DailyTracker tracker = new DailyTracker();
        tracker.setDate(LocalDate.now());
        return dailyTrackerRepository.save(tracker);
    }

    @Override
    public DailyTracker logMealConsumption(String email, MealConsumptionDTO dto) {
        return getOrCreateCurrentTracker(email);
    }

    @Override
    public void deleteMeal(Long id) {
        dailyTrackerRepository.deleteById(id);
    }

    @Override
    public List<DailyTracker> getAllTrackers() {
        return dailyTrackerRepository.findAll();
    }
}