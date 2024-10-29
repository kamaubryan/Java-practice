import java.text.DecimalFormat;

/*
* this involves the operations like adding, multiplying, minusing remainder
* */
public class ArithmeticOperators {
    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 10;
        int result = number2 + number1;// this is basically adding two numbers
        System.out.println("the result after adding is" + result);
        result = number2 - number1;// subtraction
        System.out.println("the result after subtraction is" + result);
        result = number2 * number1;// multiplication
        System.out.println("result after multiplication is" + result);
        double result2 = number1 / number2;// division
        System.out.println("result after division is " + result2);
        result = number2%number1;// remainder
        System.out.println("result after remainder is "+result);




    }
}
