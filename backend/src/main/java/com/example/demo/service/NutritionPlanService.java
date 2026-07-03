package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.PlanDto;
import com.example.demo.entity.NutritionPlan;

public interface NutritionPlanService {

    NutritionPlan createAndActivatePlan(PlanDto dto);

    void deletePlan(Long id);

    List<PlanDto> getPlans();

}