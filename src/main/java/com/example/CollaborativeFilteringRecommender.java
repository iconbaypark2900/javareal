package com.example;

import java.util.List;


public class CollaborativeFilteringRecommender {
    private DataGenerator dataGenerator;
    private double[][] userItemMatrix;

    public CollaborativeFilteringRecommender(DataGenerator dataGenerator) {
        this.dataGenerator = dataGenerator;
        trainModel();
    }

    public void trainModel() {
        int numUsers = dataGenerator.getNumUsers();
        int numItems = dataGenerator.getNumSandwiches();

        // Create a user-item matrix
        userItemMatrix = new double[numUsers][numItems];

        // Fill the user-item matrix with ratings from the user-item interactions
        List<UserItemInteraction> interactions = dataGenerator.getUserItemInteractions();
        for (UserItemInteraction interaction : interactions) {
            int userId = interaction.getUserId();
            int itemId = interaction.getItemId();
            double rating = interaction.getRating();

            userItemMatrix[userId][itemId] = rating;
        }

        // Additional training steps for collaborative filtering can be added here
    }

    public double predictRating(int userId, int itemId) {
        // Check if the user or item is out of bounds
        if (userId < 0 || userId >= userItemMatrix.length || itemId < 0 || itemId >= userItemMatrix[0].length) {
            return 0.0;
        }

        // Get the user-item rating from the user-item matrix
        double rating = userItemMatrix[userId][itemId];

        // Additional rating prediction logic for collaborative filtering can be added here

        return rating;
    }
}

