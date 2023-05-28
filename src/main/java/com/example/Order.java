package com.example;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Sandwich> sandwichList;
    private List<Drink> drinks;
    private List<Chip> chips;

    private int orderNum;
    public Order(int Num){
        orderNum = Num;
        sandwichList = new ArrayList<>();
        drinks = new ArrayList<>();
        chips = new ArrayList<>();
    }

    public void addSandWICH(Sandwich meal){
        this.sandwichList.add(meal);
    }



}
