package com.example;

import java.util.ArrayList;
import java.util.List;

public class CustomSandwich {
    private String name;
    private List<String> ingredients;
    private double price;

    public CustomSandwich(String name, List<String> ingredients, double price) {
        this.name = name;
        this.ingredients = new ArrayList<>(ingredients);
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public boolean hasIngredient(String ingredient) {
        return ingredients.contains(ingredient);
    }

    // You can add or remove ingredients from the sandwich
    public void addIngredient(String ingredient) {
        if (!ingredients.contains(ingredient)) {
            ingredients.add(ingredient);
        }
    }

    public void removeIngredient(String ingredient) {
        ingredients.remove(ingredient);
    }

    public double getPrice() {
        return price;
    }
}

