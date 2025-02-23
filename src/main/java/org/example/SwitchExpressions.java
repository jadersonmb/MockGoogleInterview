package org.example;

import java.util.Objects;
import java.util.Scanner;

public class SwitchExpressions {
    public static void main(String[] args) {

        System.out.println("Input of the week day");

        Scanner in = new Scanner(System.in);
        String day = in.nextLine();
        in.close();

        /*Inference of type and used switch expression
        * Remove of break
        * Multiply constants in only case
        * Result in a variable
        * Default is required */
        var result = switch (day.toUpperCase()) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Business day";
            case "SUNDAY", "SATURDAY" -> "Weekend";
            default -> "It is a not day of week";
        };

        System.out.println(result);

        /*Java 13
        * Reserved word yield then return result in a variable*/
        var resultWitYield = switch (day.toUpperCase()) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> {
                yield "Business day";
            }
            case "SUNDAY", "SATURDAY" -> {
                yield "Weekend";
            }
            default -> "It is a not day of week";
        };

        /*
        * Switch expression with Object and InstanceOf
        *
        Object animal = Integer.valueOf(10);

        String resultSwitch = switch (animal) {
          case Integer i -> "This object is integer";
          case String s -> "This object is string";
            default -> {
                System.out.println("Animal is not dog or cat");
            }
        }; */
    }
}
