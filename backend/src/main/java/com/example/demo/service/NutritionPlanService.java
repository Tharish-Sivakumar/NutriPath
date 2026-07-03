package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.PlanDto;
import com.example.demo.entity.NutritionPlan;

public interface NutritionPlanService {

    NutritionPlan createPlan(PlanDto planDTO);

    NutritionPlan getPlanById(Long id);

    List<NutritionPlan> getAllPlans();

    NutritionPlan updatePlan(Long id, PlanDto planDTO);

    void deletePlan(Long id);

    List<NutritionPlan> getPlansByClientId(Long clientId);

}