package com.example;

public class Sandwich {
    private BreadChoice bread;
    private Size size;
    private boolean isToasted;

    public Sandwich(BreadChoice bread, Size size) {
        this.bread = bread;
        this.size = size;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }
}
