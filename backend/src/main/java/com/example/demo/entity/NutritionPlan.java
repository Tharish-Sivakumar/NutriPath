package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "nutrition_plan")
public class NutritionPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_id", nullable = false)
    private Long clientId;

    @Column(name = "target_calories")
    private Double targetCalories;

    @Column(name = "target_protein")
    private Double targetProtein;

    @Column(name = "target_carbs")
    private Double targetCarbs;

    @Column(name = "target_fat")
    private Double targetFat;

    @Column(name = "plan_status")
    private String planStatus;

    public NutritionPlan() {
    }

    public NutritionPlan(Long id, Long clientId, Double targetCalories,
                         Double targetProtein, Double targetCarbs,
                         Double targetFat, String planStatus) {
        this.id = id;
        this.clientId = clientId;
        this.targetCalories = targetCalories;
        this.targetProtein = targetProtein;
        this.targetCarbs = targetCarbs;
        this.targetFat = targetFat;
        this.planStatus = planStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Double getTargetCalories() {
        return targetCalories;
    }

    public void setTargetCalories(Double targetCalories) {
        this.targetCalories = targetCalories;
    }

    public Double getTargetProtein() {
        return targetProtein;
    }

    public void setTargetProtein(Double targetProtein) {
        this.targetProtein = targetProtein;
    }

    public Double getTargetCarbs() {
        return targetCarbs;
    }

    public void setTargetCarbs(Double targetCarbs) {
        this.targetCarbs = targetCarbs;
    }

    public Double getTargetFat() {
        return targetFat;
    }

    public void setTargetFat(Double targetFat) {
        this.targetFat = targetFat;
    }

    public String getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
    }
}