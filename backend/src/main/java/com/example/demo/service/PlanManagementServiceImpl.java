package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PlanDto;
import com.example.demo.entity.NutritionPlan;
import com.example.demo.repository.NutritionPlanRepository;

@Service
public class PlanManagementServiceImpl implements PlanManagementService {

    @Autowired
    private NutritionPlanRepository nutritionPlanRepository;

    @Override
    public NutritionPlan createPlan(PlanDto planDTO) {
        NutritionPlan plan = new NutritionPlan();

        plan.setClientId(planDTO.getClientId());
        plan.setTargetCalories(planDTO.getTargetCalories());
        plan.setTargetProtein(planDTO.getTargetProtein());
        plan.setTargetCarbs(planDTO.getTargetCarbs());
        plan.setTargetFat(planDTO.getTargetFat());
        plan.setPlanStatus(planDTO.getPlanStatus());

        return nutritionPlanRepository.save(plan);
    }

    @Override
    public NutritionPlan getPlanById(Long id) {
        return nutritionPlanRepository.findById(id).orElse(null);
    }

    @Override
    public List<NutritionPlan> getAllPlans() {
        return nutritionPlanRepository.findAll();
    }

    @Override
    public NutritionPlan updatePlan(Long id, PlanDto planDTO) {
        NutritionPlan plan = nutritionPlanRepository.findById(id).orElse(null);

        if (plan != null) {
            plan.setClientId(planDTO.getClientId());
            plan.setTargetCalories(planDTO.getTargetCalories());
            plan.setTargetProtein(planDTO.getTargetProtein());
            plan.setTargetCarbs(planDTO.getTargetCarbs());
            plan.setTargetFat(planDTO.getTargetFat());
            plan.setPlanStatus(planDTO.getPlanStatus());

            return nutritionPlanRepository.save(plan);
        }

        return null;
    }

    @Override
    public void deletePlan(Long id) {
        nutritionPlanRepository.deleteById(id);
    }

    @Override
    public List<NutritionPlan> getPlansByClientId(Long clientId) {
        return nutritionPlanRepository.findByClientId(clientId);
    }
}