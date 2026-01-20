package JavaOperators;

public class MathOperators {
    public static void main(String[] args) {
        // math operators are the basic activities done in mathematics

        int num1 = 5;
        int num2 = 9;

        // Addition
        int addition = num1+num2;
        System.out.println("addition : " + addition);

        // substraction
        int subtraction = num2 - num1;
        System.out.println("subtraction : " +subtraction);

        // division
        int division = num2/num1 ;
        System.out.println("division : " +division);
        // decided to type cast to a better value
        float division1 =(float) division;
        System.out.println("type casted division : " + division1);




        // Multiplication
        int multiplication = num1 * num2;
        System.out.println("multiplication : " +multiplication);

        // remainder / modulus
        int remainder = num2 % num1;
        System.out.println("remainder : " +remainder);



    }
}
