import java.util.Scanner;

/*they work like logical operators hence but a little bit different
*
* */
public class ConditionalStatements {
}
//
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
    }


}
