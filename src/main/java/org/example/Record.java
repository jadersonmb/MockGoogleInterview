package org.example;

/*It is not extends any class
* it is not abstract
* It is not variable
* All attributes are final
*
* It is implement any interface
* It is possible to implement method statics
* */
public class Record {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println("Name: " + person.name() + "\nAge: " + person.age());
        person.walking();
    }
}

interface Exercise {
    void walking();
}
record Person (String name, int age) implements Exercise {
    @Override
    public void walking() {
        System.out.println("Person is walking");
    }
}
