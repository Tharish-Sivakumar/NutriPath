package com.example.demo.dto;

public class FoodDto {

    private Long id;
    private String itemName;
    private Double baseServingG;
    private Double caloriesPerServing;
    private Double proteinPerServing;
    private Double carbsPerServing;
    private Double fatPerServing;

    public FoodDto() {
    }

    public FoodDto(Long id, String itemName, Double baseServingG,
                             Double caloriesPerServing,
                             Double proteinPerServing,
                             Double carbsPerServing,
                             Double fatPerServing) {
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