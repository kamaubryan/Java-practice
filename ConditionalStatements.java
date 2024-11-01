import java.time.Year;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;


/*they work like logical operators hence but a little bit
*if else
* if else if
* switch statements
*
* */
public class ConditionalStatements {
}
class Ifelse{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter your age");
int age = scanner.nextInt();
int voting_Age= 18;
// here we can use if else inorder to authorise an individual to vote
if (age>=voting_Age){
    System.out.println("you are eligible to vote ");
}
else  {
    System.out.println("you're not eligible to vote");
}
        Scanner Voting = new Scanner(System.in);
        System.out.println("Do you have a Registration Card");
        String Answer = Voting.nextLine();
        if (Answer.equalsIgnoreCase("yes")){
            System.out.println("you can vote");
        }
        else {
            System.out.println("No you cant vote");
        }
        // we can use the logical operators with the conditional if else
        int x =23;
        if (x>=20&&x<=25){// here we have given a condition whereby both conditions has to be true in order to execute the first statement
            System.out.println("this aint true");
        }
        else {
            System.out.println("its fucking true");
        }
    }
}
class IfElseIf{
    public static void main(String[] args) {
        // here we have to prompt the user to enter three numbers where we check which number is greatest among the three
        Scanner Number1= new Scanner(System.in);
        System.out.println("enter your first number");

        int first = Number1.nextInt();
        Scanner number2 = new Scanner(System.in);
        System.out.println("enter your second number");

        int second = number2.nextInt();
        Scanner number3 = new Scanner(System.in);
        System.out.println("enter your third number");
        int third = number3.nextInt();
        if (first>second&&first>third){// here it checks if the number 1 is greater than number 2 and number three. it has to be greater than all the numbers for it to be executed
            System.out.println("the first number is the largest here");
        } else if (second>first&&second>third) {// here it checks if the number 2 is greater than number 1 and number three. it has to be greater than all the numbers for it to be executed
            System.out.println("the second number is the greatest");

        }
        else {// here it checks if the number 3 is greater than number 1 and number 2. it has to be greater than all the numbers for it to be executed
            System.out.println("the third number is the greatest");
        }
    }
}
class SwitchStatement{
    public static void main(String[] args) {
        Scanner checkBirthDay = new Scanner(System.in);
        System.out.println("Enter your Birthday  date");
       int Birthday = checkBirthDay.nextInt();
       switch (Birthday){
           case 10:
               System.out.println("hurray its you birthday");
               break;
           case 11:
               System.out.println("wrong date");
               break;
       }
    }
}



class Switchstatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for birth day and month
        System.out.println("Enter your birth day (1-31): ");
        int birthDay = scanner.nextInt();

        System.out.println("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        // Get today's date
        LocalDate today = LocalDate.now();
        int currentDay = today.getDayOfMonth();
        int currentMonth = today.getMonthValue();

        // Check if today matches the birthday entered
        if (birthDay == currentDay && birthMonth == currentMonth) {
            System.out.println("Hurray! It's your birthday today!");
        } else {
            System.out.println("Today is not your birthday.");
        }
        System.out.println(currentDay);
        System.out.println(currentMonth);

        scanner.close();
    }
}
