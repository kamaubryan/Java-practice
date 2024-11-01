/*
*this is a shorter way of writing if else statements
*you just use "?" and ":" as your if else statements
 */


import java.time.LocalDate;
import java.util.Scanner;

public class Ternaryoperator {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the current day {1-31}");
        int currentdate = today.getDayOfMonth();
        int todaysDate = scanner.nextInt();
        int result;
        // instead of using the following if else statement
        if (todaysDate==currentdate){
            System.out.println("you're right this is today's date");
        }
        else {
            System.out.println("wrong date");
        }
        // you can use the following ternary operator
        result=todaysDate==currentdate ? 45:56;// will research on this
        scanner.close();
    }
}
