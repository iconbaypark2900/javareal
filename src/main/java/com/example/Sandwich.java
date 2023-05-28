package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sandwich {
    private String Breadtype;
    private double totalPrice;
    private int Size;
    private boolean isToasted;
    private List<String> topping;
    private final String [] Meat = {"steak", "ham", "salami","roast beef", "chicken"};
    private final String [] Cheese = {"american", "provolone", "chedder","swiss"};
    private final String [] regToppings = {"Lettuce", "peppers", "onions","tomatoes", "jalepenos","cucumbers"
    ,"guacamole","pickles","mushrooms"};
    private final String [] Sauces = {"mayo", "mustard", "ketchup","ranch", "thousand islands","vinaigrette"};

    Scanner scan = new Scanner(System.in);

    public Sandwich(String Breadtype, int Size, Boolean isToasted){
     this.Breadtype = Breadtype;
     this.Size = Size;
     this.isToasted = isToasted;
     this.topping = new ArrayList<>();

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
    public void addMTopping(String meatTop){

        // This loop goes though the meat array search if there is a match
        for (String str : Meat) {
                if (meatTop.equalsIgnoreCase(str)) {
                    this.topping.add(str);
                    if(getSize() == 4) {
                        this.totalPrice += 1;
                    } else if (getSize() == 8) {
                        this.totalPrice += 2;
                    }
                    else if (getSize() == 12) {
                        this.totalPrice += 3;
                    }
                }
                }

            System.out.println("Would you like to add extra meat");
            System.out.println("Please enter 1 for Yes or 2 for No");
            int num = scan.nextInt();
            if (num == 1) {
                System.out.println("What extra meat would you like to add");
                scan.nextLine();
                //This line adds the extra topping to sandwich
                String extraTopping = scan.nextLine();
                for (String str : Meat) {
                    if (extraTopping.equalsIgnoreCase(str)) {
                        this.topping.add(str);
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

    }


    public void addCTopping(String cheese){
        // This loop goes though the cheese array search if there is a match
        for (String str : Cheese) {
            if (cheese.equalsIgnoreCase(str)) {
                this.topping.add(str);
                if(getSize() == 4) {
                    this.totalPrice += .75;
                } else if (getSize() == 8) {
                    this.totalPrice += 1.50;
                }
                else if (getSize() == 12) {
                    this.totalPrice += 2.25;
                }
            }
        }

        System.out.println("Would you like to add extra cheese");
        System.out.println("Please enter 1 for Yes or 2 for No");
        int num = scan.nextInt();
        if (num == 1) {
            System.out.println("What extra cheese would you like to add");
            scan.nextLine();
            //This line adds the extra topping to sandwich
            String extraTopping = scan.nextLine();
            for (String str : Cheese) {
                if (extraTopping.equalsIgnoreCase(str)) {
                    this.topping.add(str);
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

    }

    public void addTopping(){
        for(String str : regToppings){
            System.out.println("Would you like to add " + str + " to your sandwich");
            System.out.println("Type 1 for Yes or 2 for No");
            int ans = scan.nextInt();
            if (ans == 1){
                this.topping.add(str);
            }
        }
    }

    public void addSauces(){
        for(String str : Sauces){
            System.out.println("Would you like to add " + str + " to your sandwich");
            System.out.println("Type 1 for Yes or 2 for No");
            int ans = scan.nextInt();
            if (ans == 1){
                this.topping.add(str);
            }
        }
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

    public List<String> getToppingList(){
        return this.topping;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
