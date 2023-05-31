package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Order {

    Scanner scan = new Scanner(System.in);
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

    public void addDrinks(Drink juice){
        this.drinks.add(juice);
    }

    public void addChips(Chip lays){
        this.chips.add(lays);
    }

    //This function displays the order details to the user
    public void printOrderInfo(){
       int mcount = 0;
       double total = 0;
        for(Sandwich crabypatty : this.sandwichList){
            mcount++;
            System.out.println("Sandwich# " + mcount + " Breadtype: " + crabypatty.getBreadtype());
            System.out.println("Sandwich# " + mcount + " Size: " + crabypatty.getSize());
            if(crabypatty.isToasted()){
                System.out.println("Sandwich# " + mcount + " is Toasted.");
            }
            // constraint to check if loop is empty
            if(crabypatty.getMeatToppingList() == null || crabypatty.getMeatToppingList().isEmpty()){
                System.out.println("No Meat toppings selected for Sandwich# " + mcount);
            }else {
                // Prints the meat topping list
                System.out.println("Meat toppings for Sandwich# " + mcount + " :" + crabypatty.getMeatToppingList());
            }
            // constraint to check if loop is empty
            if(crabypatty.getCheeseToppingList() == null || crabypatty.getCheeseToppingList().isEmpty()){
                System.out.println("No Cheese toppings selected for Sandwich# " + mcount);
            }else {
                // Prints the cheese topping list
                System.out.println("Cheese toppings for Sandwich# " + mcount + " :" + crabypatty.getCheeseToppingList());
            }// constraint to check if loop is empty
            if (crabypatty.getRegToppingList() == null || crabypatty.getRegToppingList().isEmpty()){
                System.out.println("No Regular toppings selected for Sandwich# " + mcount);
            }else {
                // Prints the Regular topping list
                System.out.println("Regular toppings for Sandwich# " + mcount + " :" + crabypatty.getRegToppingList());
            }// constraint to check if loop is empty
            if(crabypatty.getSauceToppingList() == null || crabypatty.getSauceToppingList().isEmpty()){
                System.out.println("No Sauce toppings selected for Sandwich# " + mcount);
            }else{
                // Prints the sauces topping list
                System.out.println("Sauce toppings for Sandwich# " + mcount + " :" + crabypatty.getSauceToppingList());
            }
            total += crabypatty.getTotalPrice();
        }

        for(Drink juice : drinks){
            if(drinks.isEmpty()){
                System.out.println("You didn't order a drink");
            }
            System.out.println("You ordered this drink " + juice.getFlavor());
           total += juice.getCost();
        }

        for(Chip Doritos : chips ){
            if(chips.isEmpty()){
                System.out.println("You didn't order a chip");
            }
            else{
                System.out.println("You ordered this chip " + Doritos.getName());
                total += Doritos.getCost();
            }
        }
        //This print statment displays the order total
        System.out.printf("The total price of your order is $%.2f %n",total);
       }

       //This function writes the order details to the file.
       public void saveorder() {

           try {

               Date today = new Date();                                                        //This line captures the current date
               SimpleDateFormat domingo = new SimpleDateFormat("YYYYMMdd-hhmmss");                //This line formats the current date
               String now = domingo.format(today);
               now = now + ".txt";

               // This line creates the text file
               BufferedWriter theFile = new BufferedWriter(new FileWriter(now));
               int mcount = 0;
               double total = 0;
               for(Sandwich crabypatty : this.sandwichList){
                   mcount++;
                   String word20 = String.format("Sandwich#%d Breadtype is %s.%n",mcount,crabypatty.getBreadtype());
                   theFile.write(word20);
                   String word21 = String.format("Sandwich#%d Size is %s.%n",mcount,crabypatty.getSize());
                   theFile.write(word21);
                   //This if statment checks if the sandwich is toasted.
                   if(crabypatty.isToasted()){
                       String word22 = String.format("Sandwich#%d is toasted %n",mcount);
                       theFile.write(word22);
                   }
                   // constraint to check if loop is empty
                   if(crabypatty.getMeatToppingList() == null){
                       String word = String.format("No Meat toppings selected for Sandwich#%d %n",mcount);
                       theFile.write(word);
                   }else {
                       //This function writes the meat topping to the file.
                       String word = String.format("Meat toppings selected for Sandwich#%d : %s %n",mcount,crabypatty.getMeatToppingList());
                       theFile.write(word);
                   }
                   // constraint to check if loop is empty
                   if(crabypatty.getCheeseToppingList() == null || crabypatty.getCheeseToppingList().isEmpty()){
                       String word1 = String.format("No Cheese toppings selected for Sandwich#%d %n",mcount);
                       theFile.write(word1);
                   }else {
                       //This function writes the cheese topping to the file.
                       String word1 = String.format("Cheese toppings selected for Sandwich#%d : %s %n",mcount,crabypatty.getCheeseToppingList());
                       theFile.write(word1);
                   }// constraint to check if loop is empty
                   if (crabypatty.getRegToppingList() == null){
                       String word2 = String.format("No Regular toppings selected for Sandwich#%d %n",mcount);
                       theFile.write(word2);
                   }else {
                       //This function writes the Regular topping to the file.
                       String word2 = String.format("Regular toppings selected for Sandwich#%d : %s %n",mcount,crabypatty.getRegToppingList());
                       theFile.write(word2);
                   }// constraint to check if loop is empty
                   if(crabypatty.getSauceToppingList() == null){
                       String word3 = String.format("No Sauce toppings selected for Sandwich#%d %n",mcount);
                       theFile.write(word3);
                   }else{
                       //This function writes the Sauces topping to the file.
                       String word3 = String.format("Sauce toppings selected for Sandwich#%d : %s %n",mcount,crabypatty.getSauceToppingList());
                       theFile.write(word3);
                   }
                   total += crabypatty.getTotalPrice();
               }

               for(Drink juice : drinks){
                   if(drinks.isEmpty()){
                       String word4 = "You didn't order a drink%n";
                       theFile.write(word4);
                   }else {
                       String word4 = String.format("You ordered this drink: %s%n",juice.getFlavor());
                       theFile.write(word4);
                   }
                   total += juice.getCost();
               }

               for(Chip Doritos : chips ){
                   if(chips.isEmpty()){
                       String word5 = "You didn't order a chip %n";
                       theFile.write(word5);
                   }
                   else{
                       String word5 = String.format("You ordered this chip: %s%n",Doritos.getName());
                       theFile.write(word5);
                       total += Doritos.getCost();
                   }
               }
               String maxCost = String.format("The total cost of the order is %.2f",total);
               theFile.write(maxCost);
                 theFile.close();
           }
           catch (IOException E){
               E.getMessage();
           }
       }

       //The function deletes the user Order.
       public void deleteorder(){
        this.drinks.removeAll(drinks);
        this.sandwichList.removeAll(sandwichList);
        this.chips.removeAll(chips);
    }


}




