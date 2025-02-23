package org.example;

public class StringsJava {
    public static void main(String[] args) {

        /*Inference of type*/
        var str = " ";
        var strRepeat = "JAVA";

        System.out.println(str.isBlank());
        System.out.println(strRepeat.repeat(3));

        /*Add spaces*/
        String txt = "Olá Mundo !";
        System.out.println(txt.indent(4));

        /*Reverse string*/
        System.out.println(txt.transform(p -> new StringBuilder(p)
                .reverse().toString())
                .toString());
    }
}
