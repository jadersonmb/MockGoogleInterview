package org.patters.creational.prototype.builder;

import org.patters.creational.prototype.shallowCopy.Address;

public class Client {

    public static void main(String[] args) {

        Person personFirst = new Person("John", "Doe", 30, new Address("123 Main St", "New York", 1));
        Person personSecond = personFirst.cloneBuilder().withAddress(new Address("3 Main St", "New York", 10)).build();
        Person personThird = personSecond.cloneBuilder().withName("Jane").build();

        System.out.println(personFirst);
        System.out.println(personSecond);
        System.out.println(personThird);
    }
}
