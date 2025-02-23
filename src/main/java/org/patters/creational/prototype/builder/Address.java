package org.patters.creational.prototype.builder;

public class Address implements Cloneable {

    private final String city;
    private final String street;
    private final int number;

    public Address(String city, String street, int number) {
        super();
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }

    public static class Builder {
        private String city;
        private String street;
        private int number;

        public Builder(String city, String street, int number) {
            this.city = city;
            this.street = street;
            this.number = number;
        }

        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public Builder withStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder withNumber(int number) {
            this.number = number;
            return this;
        }

        public Address build() {
            return new Address(city, street, number);
        }
    }

    public Builder cloneBuilder() {
        return new Builder(city, street, number);
    }
}
