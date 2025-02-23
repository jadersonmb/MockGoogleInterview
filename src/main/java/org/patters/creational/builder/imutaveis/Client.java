package org.patters.creational.builder.imutaveis;

public class Client {

    public static void main(String[] args) {

        PersonSimple personSimple = new PersonSimple.Build().name("John").age(30).city("New York").build();
        PersonSimple personSimpleNoneCity = new PersonSimple.Build().name("John").age(30).build();
        PersonSimple personWithCity = new PersonSimple.Build().city("New York").build();

        PersonSimple normal = new PersonSimple("John", 30, "New York");

        System.out.println(normal);
        System.out.println(personSimple);
        System.out.println("None city: " + personSimpleNoneCity);
        System.out.println("With city: " + personWithCity);
    }
}
