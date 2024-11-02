import java.time.LocalDate;
import java.util.Scanner;

public class Ternaryoperator {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the current day {1-31}:");
        int currentdate = today.getDayOfMonth();
        int todaysDate = scanner.nextInt();
        int result;

        // Original if-else statement
        if (todaysDate == currentdate) {
            System.out.println("You're right, this is today's date.");
        } else {
            System.out.println("Wrong date.");
        }

        // Ternary operator
        result = todaysDate == currentdate ? 45 : 56;
        System.out.println("Ternary result: " + result);

        scanner.close();
    }
}
