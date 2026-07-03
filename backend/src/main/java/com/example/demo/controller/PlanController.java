package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.PlanDto;
import com.example.demo.entity.NutritionPlan;
import com.example.demo.service.NutritionPlanService;

@RestController
@RequestMapping("/api/plans")
public class PlanController {

    @Autowired
    private NutritionPlanService nutritionPlanService;

    @PostMapping
    public NutritionPlan createPlan(@RequestBody PlanDto planDTO) {
        return nutritionPlanService.createPlan(planDTO);
    }

    @GetMapping("/{id}")
    public NutritionPlan getPlanById(@PathVariable Long id) {
        return nutritionPlanService.getPlanById(id);
    }

    @GetMapping
    public List<NutritionPlan> getAllPlans() {
        return nutritionPlanService.getAllPlans();
    }

    @PutMapping("/{id}")
    public NutritionPlan updatePlan(@PathVariable Long id,
                                    @RequestBody PlanDto planDTO) {
        return nutritionPlanService.updatePlan(id, planDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePlan(@PathVariable Long id) {
        nutritionPlanService.deletePlan(id);
    }

    @GetMapping("/client/{clientId}")
    public List<NutritionPlan> getPlansByClientId(@PathVariable Long clientId) {
        return nutritionPlanService.getPlansByClientId(clientId);
    }
}