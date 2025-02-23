package org.example;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollector {
    public static void main(String[] args) {
        double result = Stream.of(10, 34, 64, 23, 23).collect(
                Collectors.teeing(Collectors.summingDouble(i -> i), Collectors.counting(), (sum, quantity) -> sum / quantity)
        );

        Employee first = new Employee(1, "Java", 200);
        Employee second = new Employee(2, "Python", 2000);
        Employee three = new Employee(3, "Angular", 300);
        var employeeList = List.of(first, second, three);

        var resultSalary = employeeList.stream().collect(
                Collectors.teeing(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Collectors.minBy(Comparator.comparing(Employee::getSalary)), (x, y) -> {
                    return "The max salary is " + Double.toString(x.orElseGet(Employee::new).getSalary());
                }));

        var salaryBiggerThen = employeeList.stream().collect(
                Collectors.teeing(Collectors.filtering(i -> i.getSalary() > 200.0, Collectors.toList()), Collectors.filtering(i -> i.getSalary() > 200.0, Collectors.counting()), Collections::singletonMap));

        var nameSalaryBiggerTwoHundred = new AtomicReference<String>();
        salaryBiggerThen.keySet().forEach( k -> k.forEach(i -> {
            if(Objects.isNull(nameSalaryBiggerTwoHundred.get())) {
                nameSalaryBiggerTwoHundred.set(i.getName());
            } else {
                nameSalaryBiggerTwoHundred.getAndAccumulate(i.getName(), (x , y) -> x + ", " + y);
            }
        }));

        System.out.println("Result of teeing " + result);
        System.out.println("Result of teeing comparing " + resultSalary);
        System.out.println("Result of teeing filter " + nameSalaryBiggerTwoHundred.get());
    }

    public static class Employee {
        private int id;
        private String name;
        private double salary;

        public Employee() {
        }

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }
}
