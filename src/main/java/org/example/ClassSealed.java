package org.example;

import java.util.ArrayList;

sealed class Animals permits Dog, Cat {}

final class Dog extends Animals {
    public void barking() {
        System.out.println("Dog is barking");
    }
}
final class Cat extends Animals {
    public void meowing() {
        System.out.println("Cat is meowing");
    }
}

/* Sealed Class
*  It is not permit because frog is not permits of class Animals
final class frog extends Animals {
    public void croaking() {
        System.out.println("Frog is croaking");
    }
}*/

public class ClassSealed {
    public static void main(String[] args) {
        var animals = new ArrayList<Animals>();
        animals.add(new Dog());
        animals.add(new Cat());

        for (var item : animals) {
            if (item instanceof Dog dog) {
                dog.barking();
            } else if (item instanceof Cat cat) {
                cat.meowing();
            }
        }
    }
}
