package org.example;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collections {
    public static void main(String[] args) {
        /**
         * Problema:
         * Dado um List<String> contendo nomes repetidos, retorne uma lista sem duplicatas, ordenada alfabeticamente.
         *
         * Exemplo:
         * Entrada: ["Maria", "João", "Ana", "João", "Carlos", "Ana"]
         * Saída: ["Ana", "Carlos", "João", "Maria"]
         */
        List<String> str = Arrays.asList("Maria", "João", "Ana", "João", "Carlos", "Ana");
        List<String> newStr = new ArrayList<>();
        for (String s : str) {
            if(!newStr.contains(s)){
                newStr.add(s);
            }
        }
        System.out.println(newStr.stream().sorted().toList());


        /**
         * 2. Algoritmos e Estruturas de Dados
         * Problema:
         * Dado um array de inteiros, encontre o segundo maior número sem usar Arrays.sort().
         *
         * Exemplo:
         * Entrada: [5, 3, 9, 2, 8, 9]
         * Saída: 8
         */
        int[] number = {5, 3, 9, 2, 8, 9};
        int secondBigNumber = 0;
        int bigNumber = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i] >= bigNumber) {
                bigNumber = number[i];
            } else {
                secondBigNumber = number[i];
            }
        }
        for (int i = 0; number.length > i -1; i++) {
            int minIndex = i;
            for (int j = i + 1; number.length > j; j++) {
                if(number[j] < number[minIndex]) {
                    minIndex = j;
                }

                int temp = number[i];
                number[i] = number[minIndex];
                number[minIndex] = temp;
            }
        }
        System.out.println("Seconded biggest number is " + secondBigNumber + "\n");
        for (int num : number) {
            System.out.print(num + " " + "\n");
        }


        /**
         * Example Singleton
         */
        DatabaseConnectionSingleton singleton = DatabaseConnectionSingleton.getInstance();
        DatabaseConnectionSingleton singletonX = DatabaseConnectionSingleton.getInstance();
        DatabaseConnectionSingleton singletonY = DatabaseConnectionSingleton.getInstance();

        System.out.println("HasCode " + singleton.hashCode());
        System.out.println("HasCode " + singletonX.hashCode());
        System.out.println("HasCode " + singletonY.hashCode());


        /**
         * List unmodifiableList
         */

        List<String> list = Arrays.asList("Maria", "João", "Ana", "João", "Carlos", "Ana")
                .stream()
                .collect(Collectors.toUnmodifiableList());
        System.out.println(list);

        List<String> listTwo = Stream.of("Maria", "João", "Ana", "João", "Carlos", "Ana")
                .toList();
        System.out.println(listTwo);


    }
}
