package com.example;

import java.util.List;

public class CustomSandwich {
    private String name;
    private String breadType;
    private String tasteProfile;
    private List<String> ingredients;
    private double predictedRating;
    private int id;

    public CustomSandwich(String name, String breadType, String tasteProfile, List<String> ingredients) {
        this.name = name;
        this.breadType = breadType;
        this.tasteProfile = tasteProfile;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getTasteProfile() {
        return tasteProfile;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public double getPredictedRating() {
        return predictedRating;
    }

    public void setPredictedRating(double predictedRating) {
        this.predictedRating = predictedRating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

