package org.patters.creational.builder.imutaveis;

public class PersonSimple {

    private final String name;
    private final int age;
    private final String city;

    public PersonSimple(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }



    public static class Build {
        private String name;
        private int age;
        private String city;

        public Build name(String name) {
            this.name = name;
            return this;
        }

        public Build age(int age) {
            this.age = age;
            return this;
        }

        public Build city(String city) {
            this.city = city;
            return this;
        }

        public PersonSimple build() {
            return new PersonSimple(name, age, city);
        }
    }
}
