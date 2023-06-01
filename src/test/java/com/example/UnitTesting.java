package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTesting {

    private Sandwich sandwich;
    private Chip chip;
    private Drink drink;
    private Order order;

    @Test
    public void checkEntireMealPrice1(){
        sandwich = new Sandwich("wheat", 4, false);
        chip = new Chip("doritos");
        drink = new Drink("small", "coke");
        sandwich.addMTopping("chicken");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(10, sum);
    }

    @Test
    public void checkEntireMealPrice2(){
        sandwich = new Sandwich("wheat", 4, false);
        chip = new Chip("doritos");
        drink = new Drink("medium", "coke");
        sandwich.addMTopping("chicken");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(10.5, sum);
    }

    @Test
    public void checkEntireMealPrice3(){
        sandwich = new Sandwich("wheat", 4, false);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        sandwich.addMTopping("chicken");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(11, sum);
    }

    @Test
    public void checkEntireMealPrice4(){
        sandwich = new Sandwich("wheat", 8, false);
        chip = new Chip("doritos");
        drink = new Drink("small", "coke");
        sandwich.addMTopping("chicken");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(12.5, sum);
    }

    @Test
    public void checkEntireMealPrice5(){
        sandwich = new Sandwich("wheat", 8, false);
        chip = new Chip("doritos");
        drink = new Drink("medium", "coke");
        sandwich.addMTopping("chicken");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(13, sum);
    }

    @Test
    public void checkEntireMealPrice6(){
        sandwich = new Sandwich("wheat", 8, false);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        sandwich.addMTopping("chicken");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(13.5, sum);
    }

    @Test
    public void checkEntireMealPrice7(){
        sandwich = new Sandwich("wheat", 12, false);
        chip = new Chip("doritos");
        drink = new Drink("small", "coke");
        sandwich.addMTopping("chicken");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(15, sum);
    }

    @Test
    public void checkEntireMealPrice8(){
        sandwich = new Sandwich("wheat", 12, false);
        chip = new Chip("doritos");
        drink = new Drink("medium", "coke");
        sandwich.addMTopping("chicken");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(15.5, sum);
    }

    @Test
    public void checkEntireMealPrice9(){
        sandwich = new Sandwich("wheat", 12, false);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        sandwich.addMTopping("chicken");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(16, sum);
    }

    @Test
    public void checkEntireMealPrice10(){
        sandwich = new Sandwich("wheat", 4, false);
        chip = new Chip("doritos");
        drink = new Drink("small", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(10.75, sum);
    }

    @Test
    public void checkEntireMealPrice11(){
        sandwich = new Sandwich("wheat", 4, false);
        chip = new Chip("doritos");
        drink = new Drink("medium", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(11.25, sum);
    }

    @Test
    public void checkEntireMealPrice12(){
        sandwich = new Sandwich("wheat", 4, false);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(11.75, sum);
    }

    @Test
    public void checkEntireMealPrice13(){
        sandwich = new Sandwich("wheat", 8, false);
        chip = new Chip("doritos");
        drink = new Drink("small", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(14, sum);
    }

    @Test
    public void checkEntireMealPrice14(){
        sandwich = new Sandwich("wheat", 8, false);
        chip = new Chip("doritos");
        drink = new Drink("medium", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(14.5, sum);
    }

    @Test
    public void checkEntireMealPrice15(){
        sandwich = new Sandwich("wheat", 8, false);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(15, sum);
    }

    @Test
    public void checkEntireMealPrice16(){
        sandwich = new Sandwich("wheat", 12, false);
        chip = new Chip("doritos");
        drink = new Drink("small", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(17.25, sum);
    }

    @Test
    public void checkEntireMealPrice17(){
        sandwich = new Sandwich("wheat", 12, false);
        chip = new Chip("doritos");
        drink = new Drink("medium", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(17.75, sum);
    }

    @Test
    public void checkEntireMealPrice18(){
        sandwich = new Sandwich("wheat", 12, false);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(18.25, sum);
    }

    @Test
    public void checkEntireMealPrice19(){
        sandwich = new Sandwich("wheat", 4, false);
        chip = new Chip("doritos");
        drink = new Drink("small", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(11.25, sum);
    }

    @Test
    public void checkEntireMealPrice20(){
        sandwich = new Sandwich("wheat", 4, false);
        chip = new Chip("doritos");
        drink = new Drink("small", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(11.25, sum);
    }

    @Test
    public void checkEntireMealPrice21(){
        sandwich = new Sandwich("wheat", 4, false);
        chip = new Chip("doritos");
        drink = new Drink("medium", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(11.75, sum);
    }

    @Test
    public void checkEntireMealPrice22(){
        sandwich = new Sandwich("wheat", 4, false);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(12.25, sum);
    }

    @Test
    public void checkEntireMealPrice23(){
        sandwich = new Sandwich("wheat", 8, false);
        chip = new Chip("doritos");
        drink = new Drink("small", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(15, sum);
    }

    @Test
    public void checkEntireMealPrice24(){
        sandwich = new Sandwich("wheat", 8, false);
        chip = new Chip("doritos");
        drink = new Drink("medium", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(15.5, sum);
    }

    @Test
    public void checkEntireMealPrice25(){
        sandwich = new Sandwich("wheat", 8, false);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(16, sum);
    }

    @Test
    public void checkEntireMealPrice26(){
        sandwich = new Sandwich("wheat", 12, false);
        chip = new Chip("doritos");
        drink = new Drink("small", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(18.75, sum);
    }

    @Test
    public void checkEntireMealPrice27(){
        sandwich = new Sandwich("wheat", 12, false);
        chip = new Chip("doritos");
        drink = new Drink("medium", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(19.25, sum);
    }

    @Test
    public void checkEntireMealPrice28(){
        sandwich = new Sandwich("wheat", 12, false);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(19.75, sum);
    }

    @Test
    public void checkEntireMealPrice29(){
        sandwich = new Sandwich("wheat", 4, false);
        chip = new Chip("doritos");
        drink = new Drink("small", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        sandwich.addExtraCheese("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(11.55, sum);
    }

    @Test
    public void checkEntireMealPrice30(){
        sandwich = new Sandwich("wheat", 4, false);
        chip = new Chip("doritos");
        drink = new Drink("medium", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        sandwich.addExtraCheese("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(12.05, sum);
    }

    @Test
    public void checkEntireMealPrice31(){
        sandwich = new Sandwich("wheat", 4, false);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        sandwich.addExtraCheese("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(12.55, sum);
    }

    @Test
    public void checkEntireMealPrice32(){
        sandwich = new Sandwich("wheat", 8, false);
        chip = new Chip("doritos");
        drink = new Drink("small", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        sandwich.addExtraCheese("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(15.60, sum);
    }

    @Test
    public void checkEntireMealPrice33(){
        sandwich = new Sandwich("wheat", 8, false);
        chip = new Chip("doritos");
        drink = new Drink("medium", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        sandwich.addExtraCheese("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(16.10, sum);
    }

    @Test
    public void checkEntireMealPrice34(){
        sandwich = new Sandwich("wheat", 8, false);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        sandwich.addExtraCheese("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(16.60, sum);
    }

    @Test
    public void checkEntireMealPrice35(){
        sandwich = new Sandwich("wheat", 12, false);
        chip = new Chip("doritos");
        drink = new Drink("small", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        sandwich.addExtraCheese("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(19.65, sum);
    }

    @Test
    public void checkEntireMealPrice36(){
        sandwich = new Sandwich("wheat", 12, false);
        chip = new Chip("doritos");
        drink = new Drink("medium", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        sandwich.addExtraCheese("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(20.15, sum);
    }

    @Test
    public void checkEntireMealPrice37(){
        sandwich = new Sandwich("wheat", 12, false);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        sandwich.addMTopping("chicken");
        sandwich.addExtraMeat("chicken");
        sandwich.addCTopping("swiss");
        sandwich.addExtraCheese("swiss");
        double sum = sandwich.getTotalPrice() + chip.getCost() + drink.getCost();
        assertEquals(20.65, sum);
    }

    @Test
    public void checkSandwich1(){
        sandwich = new Sandwich("wheat", 8, false);
        assertEquals("wheat", sandwich.getBreadtype());
        assertEquals(8, sandwich.getSize());
        assertFalse(sandwich.isToasted());
    }

    @Test
    public void checkSandwich2(){
        sandwich = new Sandwich("white", 4, true);
        assertEquals("white", sandwich.getBreadtype());
        assertEquals(4, sandwich.getSize());
        assertTrue(sandwich.isToasted());
    }

    @Test
    public void checkSandwich3(){
        sandwich = new Sandwich("wheat", 12, true);
        assertEquals("wheat", sandwich.getBreadtype());
        assertEquals(12, sandwich.getSize());
        assertTrue(sandwich.isToasted());
    }

    @Test
    public void checkChipDrinkMeal1(){
        drink = new Drink("small", "coke");
        chip = new Chip("doritos");
        double sum = drink.getCost() + chip.getCost();
        assertEquals(3.5, sum);
        assertEquals("small", drink.getSize());
    }

    @Test
    public void checkChipDrinkMeal2(){
        drink = new Drink("medium", "coke");
        chip = new Chip("doritos");
        double sum = drink.getCost() + chip.getCost();
        assertEquals(4, sum);
        assertEquals("medium", drink.getSize());
    }

    @Test
    public void checkChipDrinkMeal3(){
        drink = new Drink("large", "coke");
        chip = new Chip("doritos");
        double sum = drink.getCost() + chip.getCost();
        assertEquals(4.5, sum);
        assertEquals("large", drink.getSize());
    }

    @Test
    public void getPlainSandwichTotalPrice1(){
        sandwich = new Sandwich("wheat", 4, true);
        assertEquals(5.50, sandwich.getTotalPrice());
    }

    @Test
    public void getPlainSandwichTotalPrice2(){
        sandwich = new Sandwich("wheat", 8, true);
        assertEquals(7, sandwich.getTotalPrice());
    }

    @Test
    public void getPlainSandwichTotalPrice3(){
        sandwich = new Sandwich("wheat", 12, true);
        assertEquals(8.50, sandwich.getTotalPrice());
    }

    @Test
    public void checkPlainChipsMeal1(){
        sandwich = new Sandwich("wheat", 12, true);
        chip = new Chip("doritos");
        double sum = sandwich.getTotalPrice() + chip.getCost();
        assertEquals(10, sum);
    }

    @Test
    public void checkPlainChipsMeal2(){
        sandwich = new Sandwich("wheat", 8, true);
        chip = new Chip("doritos");
        double sum = sandwich.getTotalPrice() + chip.getCost();
        assertEquals(8.50, sum);
    }

    @Test
    public void checkPlainChipsMeal3(){
        sandwich = new Sandwich("wheat", 4, true);
        chip = new Chip("doritos");
        double sum = sandwich.getTotalPrice() + chip.getCost();
        assertEquals(7, sum);
    }

    @Test
    public void checkPlainSodaMeal1(){
        sandwich = new Sandwich("wheat", 4, true);
        drink = new Drink("small", "coke");
        double sum = sandwich.getTotalPrice() + drink.getCost();
        assertEquals(7.50, sum);
        assertEquals("small", drink.getSize());
    }

    @Test
    public void checkPlainSodaMeal2(){
        sandwich = new Sandwich("wheat", 4, true);
        drink = new Drink("medium", "coke");
        double sum = sandwich.getTotalPrice() + drink.getCost();
        assertEquals(8, sum);
        assertEquals("medium", drink.getSize());
    }

    @Test
    public void checkPlainSodaMeal3(){
        sandwich = new Sandwich("wheat", 4, true);
        drink = new Drink("large", "coke");
        double sum = sandwich.getTotalPrice() + drink.getCost();
        assertEquals(8.50, sum);
        assertEquals("large", drink.getSize());
    }

    @Test
    public void checkPlainSodaMeal4(){
        sandwich = new Sandwich("wheat", 8, true);
        drink = new Drink("small", "coke");
        double sum = sandwich.getTotalPrice() + drink.getCost();
        assertEquals(9, sum);
        assertEquals("small", drink.getSize());
    }

    @Test
    public void checkPlainSodaMeal5(){
        sandwich = new Sandwich("wheat", 8, true);
        drink = new Drink("medium", "coke");
        double sum = sandwich.getTotalPrice() + drink.getCost();
        assertEquals(9.50, sum);
        assertEquals("medium", drink.getSize());
    }

    @Test
    public void checkPlainSodaMeal6(){
        sandwich = new Sandwich("wheat", 8, true);
        drink = new Drink("large", "coke");
        double sum = sandwich.getTotalPrice() + drink.getCost();
        assertEquals(10, sum);
        assertEquals("large", drink.getSize());
    }

    @Test
    public void checkPlainSodaMeal7(){
        sandwich = new Sandwich("wheat", 12, true);
        drink = new Drink("small", "coke");
        double sum = sandwich.getTotalPrice() + drink.getCost();
        assertEquals(10.50, sum);
        assertEquals("small", drink.getSize());
    }

    @Test
    public void checkPlainSodaMeal8(){
        sandwich = new Sandwich("wheat", 12, true);
        drink = new Drink("medium", "coke");
        double sum = sandwich.getTotalPrice() + drink.getCost();
        assertEquals(11, sum);
        assertEquals("medium", drink.getSize());
    }

    @Test
    public void checkPlainSodaMeal9(){
        sandwich = new Sandwich("wheat", 12, true);
        drink = new Drink("large", "coke");
        double sum = sandwich.getTotalPrice() + drink.getCost();
        assertEquals(11.50, sum);
        assertEquals("large", drink.getSize());
    }

    @Test
    public void checkPlainCompleteMeal1(){
        sandwich = new Sandwich("wheat", 4, true);
        drink = new Drink("small", "coke");
        chip = new Chip("doritos");
        double sum = sandwich.getTotalPrice() + drink.getCost() + chip.getCost();
        assertEquals(9, sum);
        assertEquals("small", drink.getSize());
    }

    @Test
    public void checkPlainCompleteMeal2(){
        sandwich = new Sandwich("wheat", 4, true);
        drink = new Drink("medium", "coke");
        chip = new Chip("doritos");
        double sum = sandwich.getTotalPrice() + drink.getCost() + chip.getCost();
        assertEquals(9.5, sum);
        assertEquals("medium", drink.getSize());
    }

    @Test
    public void checkPlainCompleteMeal3(){
        sandwich = new Sandwich("wheat", 4, true);
        drink = new Drink("large", "coke");
        chip = new Chip("doritos");
        double sum = sandwich.getTotalPrice() + drink.getCost() + chip.getCost();
        assertEquals(10, sum);
        assertEquals("large", drink.getSize());
    }

    @Test
    public void checkPlainCompleteMeal4(){
        sandwich = new Sandwich("wheat", 8, true);
        drink = new Drink("small", "coke");
        chip = new Chip("doritos");
        double sum = sandwich.getTotalPrice() + drink.getCost() + chip.getCost();
        assertEquals(10.5, sum);
        assertEquals("small", drink.getSize());
    }

    @Test
    public void checkPlainCompleteMeal5(){
        sandwich = new Sandwich("wheat", 8, true);
        drink = new Drink("medium", "coke");
        chip = new Chip("doritos");
        double sum = sandwich.getTotalPrice() + drink.getCost() + chip.getCost();
        assertEquals(11, sum);
        assertEquals("medium", drink.getSize());
    }

    @Test
    public void checkPlainCompleteMeal6(){
        sandwich = new Sandwich("wheat", 8, true);
        drink = new Drink("large", "coke");
        chip = new Chip("doritos");
        double sum = sandwich.getTotalPrice() + drink.getCost() + chip.getCost();
        assertEquals(11.5, sum);
        assertEquals("large", drink.getSize());
    }

    @Test
    public void checkPlainCompleteMeal7(){
        sandwich = new Sandwich("wheat", 12, true);
        drink = new Drink("small", "coke");
        chip = new Chip("doritos");
        double sum = sandwich.getTotalPrice() + drink.getCost() + chip.getCost();
        assertEquals(12, sum);
        assertEquals("small", drink.getSize());
    }

    @Test
    public void checkPlainCompleteMeal8(){
        sandwich = new Sandwich("wheat", 12, true);
        drink = new Drink("medium", "coke");
        chip = new Chip("doritos");
        double sum = sandwich.getTotalPrice() + drink.getCost() + chip.getCost();
        assertEquals(12.5, sum);
        assertEquals("medium", drink.getSize());
    }

    @Test
    public void checkPlainCompleteMeal9(){
        sandwich = new Sandwich("wheat", 12, true);
        drink = new Drink("large", "coke");
        chip = new Chip("doritos");
        double sum = sandwich.getTotalPrice() + drink.getCost() + chip.getCost();
        assertEquals(13, sum);
        assertEquals("large", drink.getSize());
    }

    @Test
    public void showOrder1(){
        order = new Order(1);
        chip = new Chip("doritos");
        drink = new Drink("small", "coke");
        order.addDrinks(drink);
        order.addChips(chip);
        order.printOrderInfo();
    }

    @Test
    public void showOrder2(){
        order = new Order(1);
        chip = new Chip("doritos");
        drink = new Drink("medium", "coke");
        order.addDrinks(drink);
        order.addChips(chip);
        order.printOrderInfo();
    }

    @Test
    public void showOrder3(){
        order = new Order(1);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        order.addDrinks(drink);
        order.addChips(chip);
        order.printOrderInfo();
    }

    @Test
    public void deleteOrder(){
        order = new Order(1);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        order.addDrinks(drink);
        order.addChips(chip);
        order.deleteorder();
        order.printOrderInfo();
    }

    @Test
    public void saveOrder(){
        order = new Order(1);
        chip = new Chip("doritos");
        drink = new Drink("large", "coke");
        order.addDrinks(drink);
        order.addChips(chip);
        order.saveorder();
        order.printOrderInfo();
    }

}
