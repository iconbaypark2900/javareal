package com.example;

import java.util.*;

public class SandwichRecommender {
    private Map<String, Map<String, Double>> userRatings;
    private List<String> sandwiches;

    public SandwichRecommender() {
        userRatings = new HashMap<>();
        sandwiches = Arrays.asList("Italian Sub", "Philly Cheese Steak", "Reuben", "Club Sandwich", "BLT");

    }

    public List<String> getSandwiches() {
        return sandwiches;
    }

    public boolean isNewUser(String user) {
        return !userRatings.containsKey(user);
    }

    public void addRating(String user, String sandwich, double rating) {
        if (!userRatings.containsKey(user)) {
            userRatings.put(user, new HashMap<>());
        }
        userRatings.get(user).put(sandwich, rating);
    }

    public double pearsonCorrelation(String user1, String user2) {
        Map<String, Double> ratings1 = userRatings.get(user1);
        Map<String, Double> ratings2 = userRatings.get(user2);

        double sumXY = 0;
        double sumX = 0;
        double sumY = 0;
        double sumX2 = 0;
        double sumY2 = 0;
        int n = 0;

        for (String key : ratings1.keySet()) {
            if (ratings2.containsKey(key)) {
                double x = ratings1.get(key);
                double y = ratings2.get(key);
                n++;
                sumXY += x * y;
                sumX += x;
                sumY += y;
                sumX2 += x * x;
                sumY2 += y * y;
            }
        }

        if (n == 0) {
            return 0;
        }

        double denominator = Math.sqrt(sumX2 - sumX * sumX / n) * Math.sqrt(sumY2 - sumY * sumY / n);

        if (denominator == 0) {
            return 0;
        } else {
            return (sumXY - sumX * sumY / n) / denominator;
        }
    }

    public List<String> getNeighbors(String user, int numNeighbors) {
        List<String> neighbors = new ArrayList<>();
        List<Map.Entry<String, Double>> scores = new ArrayList<>();

        for (String otherUser : userRatings.keySet()) {
            if (!otherUser.equals(user)) {
                double score = pearsonCorrelation(user, otherUser);
                scores.add(new AbstractMap.SimpleEntry<>(otherUser, score));
            }
        }

        Collections.sort(scores, (o1, o2) -> Double.compare(o2.getValue(), o1.getValue()));

        for (int i = 0; i < numNeighbors && i < scores.size(); i++) {
            neighbors.add(scores.get(i).getKey());
        }

        return neighbors;
    }

    public List<String> getRecommendations(String user, int numNeighbors, int numRecommendations) {
        List<String> neighbors = getNeighbors(user, numNeighbors);
        Map<String, Double> ratings = userRatings.get(user);

        Map<String, Double> recommendations = new HashMap<>();
        for (String neighbor : neighbors) {
            Map<String, Double> neighborRatings = userRatings.get(neighbor);
            double similarity = pearsonCorrelation(user, neighbor);
            for (Map.Entry<String, Double> entry : neighborRatings.entrySet()) {
                String sandwich = entry.getKey();
                double rating = entry.getValue();
                if (!ratings.containsKey(sandwich)) {
                    if (!recommendations.containsKey(sandwich)) {
                        recommendations.put(sandwich, rating * similarity);
                    } else {
                        double oldRating = recommendations.get(sandwich);
                        recommendations.put(sandwich, oldRating + rating * similarity);
                    }
                }
            }
        }



        List<Map.Entry<String, Double>> sortedRecommendations = new ArrayList<>(recommendations.entrySet());
        sortedRecommendations.sort((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()));

        List<String> result = new ArrayList<>();
        for (int i = 0; i < numRecommendations && i < sortedRecommendations.size(); i++) {
            result.add(sortedRecommendations.get(i).getKey());
        }

        return result;
    }

    public String recommendByIngredients(Map<String, CustomSandwich> menu, List<String> preferredIngredients) {
        int maxMatches = 0;
        String recommendedSandwich = null;

        System.out.println("Preferred ingredients: " + preferredIngredients); // print the list of preferred ingredients

        for (CustomSandwich sandwich : menu.values()) {
            int matches = 0;
            for (String ingredient : preferredIngredients) {
                if (sandwich.getIngredients().contains(ingredient)) {
                    matches++;
                    System.out.println("Match found! Sandwich: " + sandwich.getName() + ", Ingredient: " + ingredient); // print when a match is found
                }
            }
            if (matches > maxMatches) {
                maxMatches = matches;
                recommendedSandwich = sandwich.getName();
                System.out.println("New recommendation! Sandwich: " + sandwich.getName() + ", Matches: " + matches); // print when a new recommendation is made
            }
        }

        return recommendedSandwich;
    }
}
