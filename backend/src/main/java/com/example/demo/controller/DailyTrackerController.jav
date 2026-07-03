package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.MealConsumptionDTO;
import com.example.demo.entity.DailyTracker;
import com.example.demo.service.DailyTrackerService;

@RestController
@RequestMapping("/api/tracker")
public class DailyTrackerController {

    @Autowired
    private DailyTrackerService dailyTrackerService;

    @GetMapping("/current")
    public DailyTracker getCurrentTracker(@RequestParam String email) {
        return dailyTrackerService.getOrCreateCurrentTracker(email);
    }

    @PostMapping("/meal")
    public DailyTracker logMeal(@RequestParam String email,
                                @RequestBody MealConsumptionDTO dto) {
        return dailyTrackerService.logMealConsumption(email, dto);
    }

    @DeleteMapping("/meal/{id}")
    public void deleteMeal(@PathVariable Long id) {
        dailyTrackerService.deleteMeal(id);
    }

    @GetMapping
    public List<DailyTracker> getAllTrackers() {
        return dailyTrackerService.getAllTrackers();
    }
}