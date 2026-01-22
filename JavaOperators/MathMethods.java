package JavaOperators;

public class MathMethods {
// this are java math methods allowing you to perform mathematical tasks on numbers
    public static void main(String[] args) {

        int number1 = 12;
        int number2 = -4;

        double number3 = 27.3;
        double number4 = 0.4;
        // math.abs >>> absolute value of a number is the number is equal to the number if the number is positive or negative

        System.out.println( Math.abs(number2));
        System.out.println(Math.abs(number1));

        // math.round >>> it involves rounding up the number to the nearest integer

        System.out.println(" the round of " + number3 + " is " + Math.round(number3));
        System.out.println( "the round of " + number4 + " is " + Math.round(number4));

        // math .ceil >>> the ceiling of a number is the smallest integer greater or equal to the number

        System.out.println(" the ceiling of " + number1 + " is " +Math.ceil(number1));
        System.out.println(" the ceiling of " + number4 + " is " +Math.ceil(number4));
        System.out.println(" the ceiling of " + number3 + " is " +Math.ceil(number3));

        // math.floor >>> the floor of a number is the smallest integer less than or equal to the number

        System.out.println(" the floor of " + number1 + " is " + Math.floor(number1));
        System.out.println(" the floor of " + number3 + " is " + Math.floor(number3));


        // math.min() >>> this returns the smallest number after comparison of the two arguments given
        System.out.println(" the min of " +number1 + " and " +number2 + " is " + Math.min(number1,number2));
        System.out.println(" the min of " +number3 + " and " +number4 + " is " + Math.min(number3,number4));

        // math.max >>> this returns the largest number after comparison of the 2 arguments given
        System.out.println(" the max of " +number3 + " and " +number4 + "i s " + Math.min(number3,number4));

        // math.power(arg1, arg2)  >>> returns arg1 raised to power of arg2
        System.out.println(" the power of 4.0, 2.0 is " +Math.pow(4.0, 2.0));
        System.out.println(" the power of 40, 2.4 is " +Math.pow(40, 2.4));
        System.out.println(" the power of 8, -1 is " +Math.pow(8, -1));

        //  math.sqrt(0) >>> this returns the squareroot of the number indicated

        int m ;
        for (m=2; m>=10; m++){
            System.out.println(Math.sqrt(m));
        }

        // math.random >>> returns a random number after every compillation

        System.out.println(" this is just a random number : " + Math.random());
        System.out.println(" this is just a random number : " + Math.random());

    }
}
