package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "food_dictionary")
public class FoodDictionary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_name", nullable = false)
    private String itemName;

    @Column(name = "base_serving_g")
    private Double baseServingG;

    @Column(name = "calories_per_serving")
    private Double caloriesPerServing;

    @Column(name = "protein_per_serving")
    private Double proteinPerServing;

    @Column(name = "carbs_per_serving")
    private Double carbsPerServing;

    @Column(name = "fat_per_serving")
    private Double fatPerServing;

    public FoodDictionary() {
    }

    public FoodDictionary(Long id, String itemName, Double baseServingG,
                          Double caloriesPerServing, Double proteinPerServing,
                          Double carbsPerServing, Double fatPerServing) {
        this.id = id;
        this.itemName = itemName;
        this.baseServingG = baseServingG;
        this.caloriesPerServing = caloriesPerServing;
        this.proteinPerServing = proteinPerServing;
        this.carbsPerServing = carbsPerServing;
        this.fatPerServing = fatPerServing;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getBaseServingG() {
        return baseServingG;
    }

    public void setBaseServingG(Double baseServingG) {
        this.baseServingG = baseServingG;
    }

    public Double getCaloriesPerServing() {
        return caloriesPerServing;
    }

    public void setCaloriesPerServing(Double caloriesPerServing) {
        this.caloriesPerServing = caloriesPerServing;
    }

    public Double getProteinPerServing() {
        return proteinPerServing;
    }

    public void setProteinPerServing(Double proteinPerServing) {
        this.proteinPerServing = proteinPerServing;
    }

    public Double getCarbsPerServing() {
        return carbsPerServing;
    }

    public void setCarbsPerServing(Double carbsPerServing) {
        this.carbsPerServing = carbsPerServing;
    }

    public Double getFatPerServing() {
        return fatPerServing;
    }

    public void setFatPerServing(Double fatPerServing) {
        this.fatPerServing = fatPerServing;
    }
}