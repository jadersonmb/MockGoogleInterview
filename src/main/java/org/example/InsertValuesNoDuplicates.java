package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/*
* Insert a value (no duplicates)
* Removing values
* GetRandom a value that is already inserted (with equal probability)*/
public class InsertValuesNoDuplicates {

    private static final Set<String> valuesNoDuplicated = new HashSet<>();

    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            insertValue(String.valueOf(i));
        }

        insertValue("1");
        removeValue("1");
        insertValue("3");
        getRandom("");
    }

    public static void insertValue(String insertValue) {
        valuesNoDuplicated.add(insertValue);
    }

    public static void removeValue(String key){
        valuesNoDuplicated.remove(key);
    }

    public static void getRandom(String value){
        AtomicReference<String> s = new AtomicReference<>();
        valuesNoDuplicated.forEach(v -> {
            if (v.equals(value)) {
                s.set(v);
            }
        });
        if (s.get() == null) {
            valuesNoDuplicated.stream().findAny().orElseThrow(() -> new RuntimeException("Error not find number"));
        } else {
            s.get();
        }
    }
}