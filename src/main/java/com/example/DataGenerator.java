package com.example;

import smile.math.MathEx;
import smile.math.Random;

import java.util.HashMap;
import java.util.Map;

public class DataGenerator {
    private static final String[] breads = {"white", "wheat", "rye", "wrap"};
    private static final String[] sizes = {"4\"", "8\"", "12\""};
    private static final String[] meats = {"ham", "turkey", "beef"};

    private static final double[] breadProbabilities = {0.4,0.3,0.2,0.1};
    private static final double[] sizeProbabilities = {0.1,0.7,0.2};
    private static final double[] meatProbablities = {0.5, 0.3, 0.2};

    public static Map<String, String> generate() {
        Map<String, String> makeBelieveData = new HashMap<>();

        makeBelieveData.put("bread",breads[distribution(breadProbabilities)]);
        makeBelieveData.put("size", sizes[distribution(sizeProbabilities)]);
        makeBelieveData.put("meats", meats[distribution(meatProbablities)]);

        return makeBelieveData;
    }

    private static int distribution(double[] probabilities) {
        double r = MathEx.random();
        double totalProbability = 0.0;
        for(int i = 0; i < probabilities.length; i++) {
            totalProbability += probabilities[i];
            if (r <= totalProbability) {
                return i;
            }
        }
        return probabilities.length - 1;
    }
}
