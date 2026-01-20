package JavaOperators;

public class UnaryOperators {


    public static void main(String[] args) {

        int number = 10;

        // increement
        int postincrement = number++; // post increment
        System.out.println(" post increment : " + postincrement);

        int preincrement = ++number; // preincrement
        System.out.println(" pre increment : " + preincrement);

        // decreement
        int postdecrement = number--; // postdecrement
        System.out.println("post decrement : "+ postdecrement);

        int predecrement = --number; // predecrement
        System.out.println("predecrement : " + predecrement);
    }
}
