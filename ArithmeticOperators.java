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
        int num1 = 34;
        num1 += 4; // this is also adding self number
        System.out.println(num1);
        num1 -= 4; // this is self subtracting
        System.out.println(num1);
        num1 %=5;// this will make bring the remainder
        System.out.println(num1);
        // that applies to all operators
// you can also use incrementing
        num1++;// incrementing
        System.out.println(num1);
        num1--;// decrementing
        System.out.println(num1);
        // difference between post and pre incrementing
        int randomnumber = 8;
        ++randomnumber;//first increment then fetch the value
        randomnumber++;// this will first fetch the value of randomnumber and the increment




    }
}
