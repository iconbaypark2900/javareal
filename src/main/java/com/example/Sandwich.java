package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sandwich {
    private String Breadtype;
    private double totalPrice;
    private int Size;
    private boolean isToasted;
    private List<String> mTopping;
    private List<String> cTopping;
    private List<String> rTopping;
    private List<String> sTopping;

    //Array storing Meat Menu Options
    private final String [] Meat = {"steak", "ham", "salami","roast beef", "chicken"};
    //Array storing Cheese Menu Options
    private final String [] Cheese = {"american", "provolone", "chedder","swiss"};
    //Array storing Regular Menu Options
    private final String [] regToppings = {"Lettuce", "peppers", "onions","tomatoes", "jalepenos","cucumbers"
    ,"guacamole","pickles","mushrooms"};
    //Array storing Sauces Menu Options
    private final String [] Sauces = {"mayo", "mustard", "ketchup","ranch", "thousand islands","vinaigrette"};

    Scanner scan = new Scanner(System.in);

    public Sandwich(String Breadtype, int Size, Boolean isToasted){
     this.Breadtype = Breadtype;
     this.Size = Size;
     this.isToasted = isToasted;
     this.mTopping = new ArrayList<>();
     this.cTopping = new ArrayList<>();
     this.rTopping = new ArrayList<>();
     this.sTopping = new ArrayList<>();

     if(Size == 4){
         totalPrice += 5.50;
     }
     else if(Size == 8){
         totalPrice += 7.00;
     }
     else if(Size == 12) {
         totalPrice += 8.50;
     }
    }

    //Method to add Meat Topping
    public void addMTopping(String meatTop) {

        // This loop goes though the meat array search if there is a match
        for (String str : Meat) {
            if (meatTop.equalsIgnoreCase(str)) {
                this.mTopping.add(str);
                if (getSize() == 4) {
                    this.totalPrice += 1;
                } else if (getSize() == 8) {
                    this.totalPrice += 2;
                } else if (getSize() == 12) {
                    this.totalPrice += 3;
                }
            }
        }
    }


        //This method allows the User to add extra meat
        public void addExtraMeat(String extraTopping){
                for (String str : Meat) {
                    if (extraTopping.equalsIgnoreCase(str)) {
                        this.mTopping.add(str);
                        if(getSize() == 4) {
                            this.totalPrice += .50;
                        } else if (getSize() == 8) {
                            this.totalPrice += 1;
                        }
                        else if (getSize() == 12) {
                            this.totalPrice += 1.50;
                        }
                    }
                }
            }




    public void addCTopping(String cheese) {
        // This loop goes though the cheese array search if there is a match
        for (String str : Cheese) {
            if (cheese.equalsIgnoreCase(str)) {
                this.cTopping.add(str);
                if (getSize() == 4) {
                    this.totalPrice += .75;
                } else if (getSize() == 8) {
                    this.totalPrice += 1.50;
                } else if (getSize() == 12) {
                    this.totalPrice += 2.25;
                }
            }
        }
    }

    public void addExtraCheese(String extraTopping){
            for (String str : Cheese) {
                if (extraTopping.equalsIgnoreCase(str)) {
                    this.cTopping.add(str);
                    if(getSize() == 4) {
                        this.totalPrice += .30;
                    } else if (getSize() == 8) {
                        this.totalPrice += .60;
                    }
                    else if (getSize() == 12) {
                        this.totalPrice += .90;
                    }
                }
            }
        }

    public void addRegularTopping(String str){
        this.rTopping.add(str);
    }

    public void addSauces(String str){
        this.sTopping.add(str);
    }





    public String getBreadtype() {
        return Breadtype;
    }

    public void setBreadtype(String breadtype) {
        Breadtype = breadtype;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public List<String> getMeatToppingList(){
        return this.mTopping;
    }
    public List<String> getCheeseToppingList(){
        return this.cTopping;
    }
    public List<String> getRegToppingList(){
        return this.rTopping;
    }
    public List<String> getSauceToppingList(){
        return this.sTopping;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public String[] regToppings(){
        return regToppings;
    }
    public String[] sToppings(){
        return Sauces;
    }

}
