package org.patters.creational.prototype.deepCopy;

public class Client {
    public static void main(String[] args) {

        Person personDeepCopy = new Person("John", "Doe", new Address("123 Main St", "New York", 1));
        System.out.println(personDeepCopy);

        Person clone = personDeepCopy.clone();
        clone.setName("Jane");
        clone.getAddress().setCity("London");

        System.out.println(personDeepCopy);
        System.out.println(clone);
    }
}
