package com.example;

import java.util.Scanner;

public class Didit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Order VIP = new Order(1);

        System.out.println("Welcome to BigDaddy's Diner");
        while(true) {
            System.out.println("PLEASE SELECT A OPTION");
            System.out.println("Press 1 for New Order");
            System.out.println("Press 2 to Exit");
            int ans = scan.nextInt();
            while(ans == 1){
                System.out.println("PLEASE SELECT A OPTION");
                System.out.println("Press 1 -> ADD SANDWICH");
                System.out.println("Press 2 -> ADD DRINK");
                System.out.println("Press 3 -> ADD CHIP");
                System.out.println("Press 4 -> TO CHECKOUT");
                int ans1 = scan.nextInt();
                //Constraint to prevent the user from entering a invalid number.
                while(ans1 <= 0 && ans1 >=4) {
                    System.out.println("Please enter a valid value.");
                    ans1 = scan.nextInt();
                }
                if(ans1 == 1){
                    System.out.println("BREAD TYPES - (WHEAT,WHITE,WRAP,RYE)");
                    System.out.println("Which breadtype would you like ?");
                    scan.nextLine();
                    String breadtype = scan.nextLine();
                    //Constraint to prevent the user from entering an INVALID Input
                    while(!(breadtype.equalsIgnoreCase("WHEAT") || breadtype.equalsIgnoreCase("WHITE")
                            || breadtype.equalsIgnoreCase("WRAP") || breadtype.equalsIgnoreCase("RYE"))){
                        System.out.println("PLEASE ENTER A VALID BREADTYPE!!");
                        breadtype = scan.nextLine();
                    }
                    System.out.println("SANDWICH SIZES - (4,8,12)");
                    System.out.println("What size would you like ?");
                    int size = scan.nextInt();
                    //Constraint to prevent the user from entering an INVALID Input
                    while(!(size == 4 || size == 8 || size == 12)) {
                        System.out.println("Please enter a valid value.");
                        size = scan.nextInt();
                    }
                    System.out.println("WOULD YOU LIKE YOUR SANDWICH TOASTED ?");
                    System.out.println("IF YES ENTER 1 IF NO ENTER 2");
                    int choice = scan.nextInt();
                    //Constraint to prevent the user from entering an INVALID Input
                    while(!(choice == 1 || choice == 2)) {
                        System.out.println("Please enter a valid value.");
                        size = scan.nextInt();
                    }
                    // Boolean Variable capturing whether the sandwich is toasted
                    boolean toast;
                    if(choice == 1){
                        toast = true;
                    }
                    else{
                        toast = false;
                    }
                    //Creating the Sandwich
                    Sandwich CRABBYPATTY = new Sandwich(breadtype,size,toast);
                    System.out.println("MEAT TOPPING OPTIONS - STEAK, HAM, SALAMI, ROAST BEEF, CHICKEN,");
                    System.out.println("ONLY ONE OPTION ALLOWED!!. PLEASE ENTER YOUR CHOICE");
                    scan.nextLine();
                    String mopt = scan.nextLine();
                    CRABBYPATTY.addMTopping(mopt);
                    System.out.println("Would you like to add extra meat");
                    System.out.println("Please enter 1 for Yes or 2 for No");
                    int num = scan.nextInt();
                    if (num == 1) {
                        System.out.println("What extra meat would you like to add");
                        scan.nextLine();
                        //This line adds the extra topping to sandwich
                        String extraTopping = scan.nextLine();
                        CRABBYPATTY.addExtraMeat(extraTopping);
                    }
                    System.out.println("CHEESE TOPPING OPTIONS - AMERICAN,PROVOLONE,CHEDDER,SWISS");
                    System.out.println("ONLY ONE OPTION ALLOWED!!. PLEASE ENTER YOUR CHOICE");
                    scan.nextLine();
                    String Copt = scan.nextLine();
                    CRABBYPATTY.addCTopping(Copt);
                    System.out.println("Would you like to add extra cheese");
                    System.out.println("Please enter 1 for Yes or 2 for No");
                    int num34 = scan.nextInt();
                    if (num34 == 1) {
                        System.out.println("What extra cheese would you like to add");
                        scan.nextLine();
                        //This line adds the extra topping to sandwich
                        String extraTopping = scan.nextLine();
                        CRABBYPATTY.addExtraCheese(extraTopping);
                    }
                    //This loops through the ArrayList for all Regular Toppings
                    for(String str : CRABBYPATTY.regToppings()){
                       System.out.println("Would you like to add " + str + " to your sandwich");
                       System.out.println("Type 1 for Yes or 2 for No");
                       int ans56 = scan.nextInt();
                       if (ans56 == 1){
                           CRABBYPATTY.addRegularTopping(str);
                       }
                   }

                    //This loops through the ArrayList for all Sauce Toppings
                    for(String str : CRABBYPATTY.sToppings()){
                        System.out.println("Would you like to add " + str + " to your sandwich");
                        System.out.println("Type 1 for Yes or 2 for No");
                        int ans66 = scan.nextInt();
                        if (ans66 == 1){
                            CRABBYPATTY.addSauces(str);
                        }
                    }
                    //Adding the Sandwich to the Order
                    VIP.addSandWICH(CRABBYPATTY);

                }
                else if(ans1 == 2){
                    System.out.println("DRINK SIZES - SMALL,MEDIUM,LARGE");
                    System.out.println("PLEASE ENTER THE SIZE YOU WOULD LIKE");
                    scan.nextLine();
                    String size = scan.nextLine();
                    //Constraint to prevent the user from entering an INVALID Input
                    while(!(size.equalsIgnoreCase("SMALL") || size.equalsIgnoreCase("MEDIUM") || size.equalsIgnoreCase("LARGE"))) {
                        System.out.println("Please enter a valid value.");
                        size = scan.nextLine();
                    }
                    System.out.println("PLEASE ENTER A DRINK FLAVOR");
                    String soda = scan.nextLine();
                    //Creating the Drink
                    Drink StreetVybez = new Drink(size,soda);
                    //Adding the Drink to the Order
                    VIP.addDrinks(StreetVybez);
                }
                else if(ans1 == 3){
                    scan.nextLine();
                    System.out.println("ENTER NAME OF CHIP YOU WOULD LIKE TO PURCHASE");
                    String chipName = scan.nextLine();
                    //Creating the Chip
                    Chip LAYS = new Chip(chipName);
                    //Adding the Drink to the Order
                    VIP.addChips(LAYS);
                }
                else if (ans1 == 4) {
                    VIP.printOrderInfo();
                    System.out.println("IF ORDER IS CORRECT TYPE 1. IF YOU WOULD LIKE TO CANCEL YOUR ORDER TYPE 2");
                    int ans2 = scan.nextInt();
                    if(ans2 == 1){
                        // This function saves your oder.
                        VIP.saveorder();
                        VIP.deleteorder();
                        break;
                    }
                    else{
                        // This function deletes your order.
                        VIP.deleteorder();
                        break;
                    }
                }

            }
            if(ans == 2){
                System.out.println("THANK YOU HAVE A WONDERFUL DAY");
               break;
            }
            else{
                //Constraint to ensure the user enter a valid option to start the program
                while(!(ans == 2 || ans == 1)) {
                    System.out.println("Please enter a valid value.");
                    ans = scan.nextInt();
                }
            }
        }


    }
}

