package org.example;

import java.util.ArrayList;

public class NewInstanceOf {
    /*Pattern Matching for instanceof*/
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());

       for (var animal : animals) {
           if(animal instanceof Dog dog) {
               dog.barking();
           } else if(animal instanceof Cat cat) {
               cat.meowing();
           }
       }
    }

    public interface Animal {
        void walking();
    }
    public static class Dog implements Animal {

        @Override
        public void walking() {
            System.out.println("Dog is walking");
        }

        public void barking() {
            System.out.println("Dog is barking");
        }
    }

    public static class Cat implements Animal {

        @Override
        public void walking() {
            System.out.println("Cat is walking");
        }

        public void meowing() {
            System.out.println("Cat is meowing");
        }
    }
}
