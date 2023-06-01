package com.example;

import java.util.*;

public class SandwichOrderingSystem {
    private Map<String, CustomSandwich> menu;
    private SandwichRecommender recommender;

    public SandwichOrderingSystem() {
        this.menu = new HashMap<>();
        this.recommender = new SandwichRecommender();

        // Add sandwiches to menu
        this.menu.put("Italian Sub", new CustomSandwich("Italian Sub", Arrays.asList("Ham", "Salami", "Pepperoni", "Provolone", "Lettuce", "Tomatoes", "Onions", "Peppers", "Oil", "Vinegar")));
        this.menu.put("Philly Cheese Steak", new CustomSandwich("Philly Cheese Steak", Arrays.asList("Steak", "Provolone", "Onions", "Peppers", "Mushrooms")));
        this.menu.put("Reuben", new CustomSandwich("Reuben", Arrays.asList("Corned Beef", "Swiss", "Sauerkraut", "Thousand Islands", "Rye Bread")));
        this.menu.put("Club Sandwich", new CustomSandwich("Club Sandwich", Arrays.asList("Turkey", "Ham", "Bacon", "American Cheese", "Lettuce", "Tomatoes", "Mayo", "Toasted Bread")));
        this.menu.put("BLT", new CustomSandwich("BLT", Arrays.asList("Bacon", "Lettuce", "Tomatoes", "Mayo", "Toasted Bread")));
    }

    public void placeOrder(String customerName) {
        Scanner scanner = new Scanner(System.in);
        List<String> preferredIngredients = new ArrayList<>();

        System.out.println("Welcome, " + customerName + "! Please enter your preferred ingredients (type 'done' when finished): ");

        while (true) {
            String ingredient = scanner.nextLine();
            if (ingredient.equalsIgnoreCase("done")) {
                break;
            }
            preferredIngredients.add(ingredient);
        }

        String recommendedSandwich = recommender.recommendByIngredients(menu, preferredIngredients);
        System.out.println("Based on your preferred ingredients, we recommend the: " + recommendedSandwich);
    }
}
