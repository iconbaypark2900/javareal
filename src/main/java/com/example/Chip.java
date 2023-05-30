package com.example;

public class Chip {

    private String name;
    private boolean isChip;
    private double cost;

    public Chip(String name) {
        this.name = name;
        this.isChip = isChip;
        this.cost = 1.50;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChip() {
        return isChip;
    }

    public void setChip(boolean chip) {
        isChip = chip;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
