package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class SortedList {
    public static void main(String[] args) {

        /*Sort Int*/
        List<Integer> sortList =  new ArrayList<>();
        sortList.add(2);
        sortList.add(1);
        sortList.add(4);
        sortList.add(3);
        sortList.add(10);
        sortList.add(10);
        sortList.add(9);
        sortList.add(9);
        sortList.add(8);
        sortList.add(7);

        sortList.sort(Comparator.comparingInt(a -> a));
        sortList.forEach(System.out::println);

        System.out.println("===============");
        /*Print bigger number*/
        Integer biggerNumber = 0;
        for (Integer i : sortList) {
            if(i > biggerNumber) {
                biggerNumber = i;
            }
        }
        System.out.println("Bigger number is " + biggerNumber);

        System.out.println("===============");
        var map = new HashMap<Integer, Integer>();
        for(Integer i : sortList) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        map.forEach((key, value) -> {
            if(value > 1) System.out.println("Repeated number is " + key + " frequency " + value);
        });

        System.out.println("===============");
        /*Sort String*/
        List<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("apple");
        strings.add("orange");

        strings.sort((a, b) -> a.compareTo(b));
        strings.sort(String::compareTo);

        for (String str : strings) {
            System.out.println("List of ordered is " + str);
        }

    }
}
