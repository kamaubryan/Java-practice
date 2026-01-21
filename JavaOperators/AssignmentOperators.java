package JavaOperators;

public class AssignmentOperators {

    public static void main(String[] args) {

        // Assignment operators . it assigns a value from the right hand side to the variable on the variable on the left
        // you have to first declare the value on the right hand

        int number = 10;

        number+=5;
        System.out.println("after += : " + number); // output = 15;

        number *= 2;
        System.out.println("After *= : " + number); // output 30;

        number/= 2;
        System.out.println(" After /= : " + number); // output 15;

        number -= 5;
        System.out.println("After -= : " +number);

        number%=4;
        System.out.println("after % = : " + number); // output 2;

    }
}
