package org.example;

import java.util.List;
import java.util.function.Function;

public class VarInferenceType {
    public static void main(String[] args) {

        /*Inference of type*/
        Function<String, String> concatInference = (var s) -> s + ". ";
        /*Received one argument of entry and other outside*/
        Function<List<String>, String> concatWithoutInference  = (List<String> s) -> String.join("\\n", s);

        System.out.println(concatWithoutInference.apply(List.of("Java", "Python", "Angular")));
    }
}
