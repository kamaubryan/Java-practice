package Strings;

import java.util.StringTokenizer;

public class StringMutabilityandImmutability {

    public static void main(String[] args) {
        // mutable string object

        StringBuffer FullName = new StringBuffer("Kamau Brian "); // this is thread safe and also mutable
        System.out.println(FullName);

        StringBuilder FullNames= new StringBuilder();
       FullNames.append("Hello");
        System.out.println(FullNames);

        // on the mutable objects you can add or modify the .

        FullName.append("kiriro");
        System.out.println(FullName);


        // immutable string

        String Hardwork = "sacrifice";
        System.out.println(Hardwork);
        Hardwork.concat("patience");// you can not change a value an immutable String object
        System.out.println(Hardwork); // output will still be Sacrifice

        // we can also make it mutable by assigning it to a new string Object

        Hardwork = Hardwork.concat("Patience");
        System.out.println(Hardwork);


        // String tokenizer is whereby we Break  our string into tokens
        StringTokenizer Greeting = new StringTokenizer("Hello there");
        System.out.println(" Greeting has the following tokens : "+ Greeting.countTokens());

        // to print you can use the hasmoretoken() and the nexttoken();
        while (Greeting.hasMoreTokens()){
        System.out.println(Greeting.nextToken())
        ;
        };


    }
}
