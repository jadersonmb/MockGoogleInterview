package org.patters.creational.prototype.builder;

import org.patters.creational.prototype.shallowCopy.Address;

public class Person implements Cloneable {

    private final String name;
    private final String nickname;
    private final int age;
    private final Address address;

    public Person(String name, String nickname, int age, Address address) {
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.address = address;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return new Person(name, nickname, age, address.clone());
    }

    public static class BuildPerson {

        private String name;
        private String nickname;
        private int age;
        private Address address;

        public BuildPerson(String name, String nickname, int age, Address address) {
            this.name = name;
            this.nickname = nickname;
            this.age = age;
            this.address = address;
        }

        public BuildPerson withName(String name) {
            this.name = name;
            return this;
        }

        public BuildPerson withNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public BuildPerson withAge(int age) {
            this.age = age;
            return this;
        }

        public BuildPerson withAddress(Address address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(name, nickname, age, address);
        }
    }

    public BuildPerson cloneBuilder() {
        return new BuildPerson(name, nickname, age, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
