package Strings;

public class newKeywordinstring {
    public static void main(String[] args) {
        String name = new String("brian");// here we have created a constructor with a new keyword which the original value is brian
        System.out.println("hello " + name);// it'll print the name
        // we can also check a specific caharacter using the .charat() method
        System.out.println(name.charAt(4));// this will print the specific character in the name word
        // you can also concatinate using the concatinate method
        System.out.println("hello "+  name.concat("kamau"));//this has added the name kamau at the end of the name
        // instead of all that work you just can use the following
        String Car = "mercedes benz gle 63 AMG";
        System.out.println(Car);

        StringExample.main(args);

    }
}

class StringExample {
    public static void main(String[] args) {
        // normal way of creating a string

        String Greeting = "hello";
        System.out.println(Greeting);

        // using a new keyword to create a memory in the heap memory
        String acceptable = new String("Cool");
        System.out.println(acceptable);

    }}
