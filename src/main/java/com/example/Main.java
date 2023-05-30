package com.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dataFile = "recommender.csv";

        // Create DataGenerator instance
        DataGenerator dataGenerator = new DataGenerator();

        // Create CollaborativeFilteringRecommender instance
        CollaborativeFilteringRecommender recommender = new CollaborativeFilteringRecommender(dataGenerator);

        // User questionnaire and feedback
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please answer the following questionnaire:");
        System.out.println("Enter your user ID:");
        int userId = 0;

        try {
            userId = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input for user ID. Please enter a valid integer.");
            return;
        }

        System.out.println("Select your preferred bread type:");
        String[] breadTypes = { "White", "Wheat", "Rye", "Wrap" };
        for (int i = 0; i < breadTypes.length; i++) {
            System.out.println((i + 1) + ". " + breadTypes[i]);
        }
        int selectedBreadIndex = 0;

        try {
            selectedBreadIndex = scanner.nextInt() - 1;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input for bread type. Please enter a valid integer.");
            return;
        }

        System.out.println("Enter your taste profile:");
        String tasteProfile = scanner.next();

        System.out.println("Enter an ingredient you don't like:");
        String dislikedIngredient = scanner.next();

        // Generate personalized recommendations
        CustomSandwich recommendedSandwich = generateRecommendation(userId, selectedBreadIndex, tasteProfile, dislikedIngredient, recommender, dataGenerator);

        // Display the recommended sandwich to the user
        if (recommendedSandwich != null) {
            System.out.println("Recommended Sandwich: " + recommendedSandwich.getName());
            System.out.println("Bread Type: " + recommendedSandwich.getBreadType());
            System.out.println("Ingredients: " + recommendedSandwich.getIngredients());
            System.out.println("Taste Profile: " + recommendedSandwich.getTasteProfile());
        } else {
            System.out.println("Sorry, no recommendation available.");
        }

    }

    private static CustomSandwich generateRecommendation(int userId, int selectedBreadIndex, String tasteProfile, String dislikedIngredient,
                                                         CollaborativeFilteringRecommender recommender, DataGenerator dataGenerator) {
        String[] breadTypes = { "White", "Wheat", "Rye", "Wrap" };

        List<CustomSandwich> validSandwiches = new ArrayList<>();

        for (int i = 0; i < dataGenerator.getNumSandwiches(); i++) {
            CustomSandwich sandwich = dataGenerator.getSandwich(i);

            boolean isValidSandwich = true;
            if (selectedBreadIndex >= 0 && !sandwich.getBreadType().equalsIgnoreCase(breadTypes[selectedBreadIndex])) {
                isValidSandwich = false;
            }
            if (!sandwich.getTasteProfile().equalsIgnoreCase(tasteProfile)) {
                isValidSandwich = false;
            }
            if (sandwich.getIngredients().contains(dislikedIngredient)) {
                isValidSandwich = false;
            }

            if (isValidSandwich) {
                validSandwiches.add(sandwich);
            }
        }

        if (validSandwiches.isEmpty()) {
            // Fallback to a default recommendation
            return dataGenerator.getSandwich(0);
        }

        CustomSandwich recommendedSandwich = null;
        double highestRating = Double.NEGATIVE_INFINITY;

        for (CustomSandwich sandwich : validSandwiches) {
            double predictedRating = recommender.predictRating(userId, sandwich.getId());
            sandwich.setPredictedRating(predictedRating);

            if (predictedRating > highestRating) {
                highestRating = predictedRating;
                recommendedSandwich = sandwich;
            }
        }

        return recommendedSandwich;
    }
}

