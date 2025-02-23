package org.patters.creational.builder;

public class FasFoodMealBuilder {

    private String bread;
    private String cheese;
    private String meat;
    private String gift;
    private String drink;

    public FasFoodMealBuilder() {}

    public FasFoodMealBuilder andBread(String bread) {
        this.bread = bread;
        return this;
    }

    public FasFoodMealBuilder andCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public FasFoodMealBuilder andMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public FasFoodMealBuilder andGift(String gift) {
        this.gift = gift;
        return this;
    }

    public FasFoodMealBuilder andDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public FastFoodMeal build() {
        return new FastFoodMeal(bread, cheese, meat, gift, drink);
    }

}
