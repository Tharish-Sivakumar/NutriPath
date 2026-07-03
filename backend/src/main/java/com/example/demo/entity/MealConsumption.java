package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "meal_consumption")
public class MealConsumption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tracker_id", nullable = false)
    private Long trackerId;

    @Column(name = "food_id", nullable = false)
    private Long foodId;

    @Column(name = "consumed_serving_g")
    private Double consumedServingG;

    @Column(name = "meal_type")
    private String mealType;

    @Column(name = "logged_at")
    private LocalDateTime loggedAt;

    public MealConsumption() {
    }

    public MealConsumption(Long id, Long trackerId, Long foodId,
                           Double consumedServingG, String mealType,
                           LocalDateTime loggedAt) {
        this.id = id;
        this.trackerId = trackerId;
        this.foodId = foodId;
        this.consumedServingG = consumedServingG;
        this.mealType = mealType;
        this.loggedAt = loggedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Long trackerId) {
        this.trackerId = trackerId;
    }

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public Double getConsumedServingG() {
        return consumedServingG;
    }

    public void setConsumedServingG(Double consumedServingG) {
        this.consumedServingG = consumedServingG;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public LocalDateTime getLoggedAt() {
        return loggedAt;
    }

    public void setLoggedAt(LocalDateTime loggedAt) {
        this.loggedAt = loggedAt;
    }
}