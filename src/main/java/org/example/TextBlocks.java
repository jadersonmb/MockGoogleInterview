package org.example;

public class TextBlocks {

    public static void main(String[] args) {
        String txt = "Hello World \n" + "This module\n" + "Java 17";
        System.out.println(txt);

        /*With text block*/
        String txtWithBlock = """
                        Hello World
                        This module
                        Java 17""";
        System.out.println(txtWithBlock);

        /*Scape \ and line break
        * \ -> Ignore line break
        * \s -> Space*/
        String txtWithBlock2 = """
                        Hello \s\s World \
                        This module \
                        Java 17 
                        """;
        System.out.println(txtWithBlock2);

    }
}
