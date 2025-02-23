package org.patters.creational.builder;

public class FastFoodMeal {

    private String bread;
    private String cheese;
    private String meat;
    private String gift;
    private String drink;

    public FastFoodMeal(String bread, String cheese, String meat, String gift, String drink) {
        this.bread = bread;
        this.cheese = cheese;
        this.meat = meat;
        this.gift = gift;
        this.drink = drink;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "FastFoodMeal{" +
                "bread='" + bread + '\'' +
                ", cheese='" + cheese + '\'' +
                ", meat='" + meat + '\'' +
                ", gift='" + gift + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
