package com.example.demo.dto;

public class ClientProfileDTO {

    private Long id;
    private Long accountId;
    private String name;
    private Integer age;
    private Double weight;
    private Double height;
    private String goal;

    public ClientProfileDTO() {
    }

    public ClientProfileDTO(Long id, Long accountId, String name, Integer age,
                            Double weight, Double height, String goal) {
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.goal = goal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}