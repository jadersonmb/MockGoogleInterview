package org.patters.creational.builder;

public class Client {

    /*
    * Fluent API example with builder
    * */
    public static void main(String[] args) {

        FastFoodMeal fastFoodMeal = new FasFoodMealBuilder()
                .andBread("Bread")
                .andCheese("Cheese")
                .andMeat("Meat")
                .andGift("Gift")
                .andDrink("Drink")
                .build();

        FastFoodMeal fastFoodMealWithoutCheese = new FasFoodMealBuilder()
                .andBread("Bread")
                .andMeat("Meat")
                .andGift("Gift")
                .andDrink("Drink")
                .build();

        System.out.println("Fast food meal: " + fastFoodMeal.toString());
        System.out.println("Fast food meal without cheese: " + fastFoodMealWithoutCheese.toString());
    }
}
