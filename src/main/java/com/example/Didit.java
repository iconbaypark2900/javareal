package com.example;

public class Didit {
    public static void main(String[] args) {


        //System.out.println("git testing 5/25");

        Sandwich SubWay = new Sandwich("Wheat",8,true);
        Drink Sprite = new Drink("Large","Cola");
        Chip Lays = new Chip("Lays",true);

       SubWay.addTopping();

        System.out.println(SubWay.getToppingList());
    }
}

