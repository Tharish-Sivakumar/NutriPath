package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.NutritionPlanDTO;
import com.example.demo.entity.NutritionPlan;

public interface NutritionPlanService {

    NutritionPlan createPlan(NutritionPlanDTO planDTO);

    NutritionPlan getPlanById(Long id);

    List<NutritionPlan> getAllPlans();

    NutritionPlan updatePlan(Long id, NutritionPlanDTO planDTO);

    void deletePlan(Long id);

    List<NutritionPlan> getPlansByClientId(Long clientId);

}