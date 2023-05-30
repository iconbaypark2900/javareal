package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    private List<UserItemInteraction> userItemInteractions;
    private List<CustomSandwich> sandwiches;
    private int numUsers;

    public DataGenerator() {
        userItemInteractions = new ArrayList<>();
        sandwiches = new ArrayList<>();
        numUsers = 0;

        String[] sandwichNames = { "Italian Sub", "Philly Cheese Steak", "Reuben", "Club Sandwich", "BLT" };
        String[][] sandwichIngredients = {
                { "Ham", "Salami", "Pepperoni", "Provolone", "Lettuce", "Tomatoes", "Onions", "Peppers", "Oil", "Vinegar" },
                { "Steak", "Provolone", "Onions", "Peppers", "Mushrooms" },
                { "Corned Beef", "Swiss", "Sauerkraut", "Thousand Islands", "Rye Bread" },
                { "Turkey", "Ham", "Bacon", "American Cheese", "Lettuce", "Tomatoes", "Mayo", "Toasted Bread" },
                { "Bacon", "Lettuce", "Tomatoes", "Mayo", "Toasted Bread" }
        };
        String[] sandwichBreadTypes = { "White", "Wheat", "Rye", "Wrap","Five Grain"};
        String[] sandwichTasteProfile = { "Medium", "Sweet", "Tangy", "Vegetarian", "Crispy" };

        for (int i = 0; i < sandwichNames.length; i++) {
            CustomSandwich sandwich = new CustomSandwich(sandwichNames[i], sandwichBreadTypes[i], sandwichTasteProfile[i], Arrays.asList(sandwichIngredients[i]));
            sandwich.setId(i);
            sandwiches.add(sandwich);
        }

        for (UserItemInteraction interaction : userItemInteractions) {
            int userId = interaction.getUserId();
            numUsers = Math.max(numUsers, userId + 1);
        }
    }

    public int getNumSandwiches() {
        return sandwiches.size();
    }

    public int getNumUsers() {
        return numUsers;
    }

    public CustomSandwich getSandwich(int index) {
        return sandwiches.get(index);
    }

    public void addUserItemInteraction(int userId, int itemId, double rating) {
        UserItemInteraction interaction = new UserItemInteraction(userId, itemId, rating);
        userItemInteractions.add(interaction);
    }

    public List<UserItemInteraction> getUserItemInteractions() {
        return userItemInteractions;
    }
}
