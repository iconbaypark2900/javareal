package com.example;

public class Drink {

    private String Size;
    private String flavor;
    private double Cost;

    public Drink(String size, String flavor) {

        if(size.equalsIgnoreCase("small")){
            this.Cost = 2.00;
        } else if(size.equalsIgnoreCase("medium")){
            this.Cost = 2.50;
        } else if (size.equalsIgnoreCase("Large")) {
            this.Cost = 3.00;
        }

        this.Size = size;
        this.flavor = flavor;
    }
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }
}
