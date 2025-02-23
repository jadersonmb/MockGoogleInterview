package org.patters.creational.prototype.shallowCopy;

public class Client {
    public static void main(String[] args) {

        Person personShallowCopy = new Person("John", "Doe", new Address("123 Main St", "New York", 1));
        System.out.println(personShallowCopy);

        Person clone = personShallowCopy.clone();
        clone.setName("Jane");
        clone.getAddress().setCity("London");

        System.out.println(personShallowCopy);
        System.out.println(clone);
    }
}
