package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.NutritionPlan;

public interface NutritionPlanRepository extends JpaRepository<NutritionPlan, Long> {

    List<NutritionPlan> findByClientId(Long clientId);

}