package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SandwichOrderingSystem {
    private Map<String, CustomSandwich> menu;
    private SandwichRecommender recommender;

    public SandwichOrderingSystem() {
        this.menu = new HashMap<>();
        this.recommender = new SandwichRecommender();

        // Add sandwiches to menu
        this.menu.put("Italian Sub", new CustomSandwich("Italian Sub", Arrays.asList("Ham", "Salami", "Pepperoni", "Provolone", "Lettuce", "Tomatoes", "Onions", "Peppers", "Oil", "Vinegar"), 12.99));
        this.menu.put("Philly Cheese Steak", new CustomSandwich("Philly Cheese Steak", Arrays.asList("Steak", "Provolone", "Onions", "Peppers", "Mushrooms"), 14.99));
        this.menu.put("Reuben", new CustomSandwich("Reuben", Arrays.asList("Corned Beef", "Swiss", "Sauerkraut", "Thousand Islands", "Rye Bread"), 15.99));
        this.menu.put("Club Sandwich", new CustomSandwich("Club Sandwich", Arrays.asList("Turkey", "Ham", "Bacon", "American Cheese", "Lettuce", "Tomatoes", "Mayo", "Toasted Bread"), 13.99));
        this.menu.put("BLT", new CustomSandwich("BLT", Arrays.asList("Bacon", "Lettuce", "Tomatoes", "Mayo", "Toasted Bread"), 14.99));
        this.menu.put("The Jahi", new CustomSandwich("The Jahi", Arrays.asList("Lettuce", "Guacamole", "Mushrooms", "Onions", "Tomatoes", "Vinegar"),100.99));
        this.menu.put("Ant Man", new CustomSandwich("Ant Man", Arrays.asList("Steak", "Chicken", "Ham", "Provolone", "Thousand Islands"),100.99));
    }

    public void placeOrder() {
        Scanner scanner = new Scanner(System.in);
        List<String> preferredIngredients = new ArrayList<>();

        System.out.println("Welcome! Please enter your name: ");
        String customerName = scanner.nextLine();
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

        double price = menu.get(recommendedSandwich).getPrice();

        try {
            FileWriter fileWriter = new FileWriter("Recommender.csv", true); // Append to the existing file
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Customer Name | Recommended Sandwich | Price \n");
            bufferedWriter.write(customerName + " | " + recommendedSandwich + " | $" + price + "\n");
            bufferedWriter.close();
            System.out.println("Your order has been saved to 'Recommender.csv'.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }
}
