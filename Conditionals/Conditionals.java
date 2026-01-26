package Conditionals;

import java.util.Scanner;

// they are used in decison making
public class Conditionals {

    public static void main(String[] args) {

        // if statement
        // includes only one decision
        boolean israining = false;
        if(!israining){
            System.out.println("its super sunny");// this is the code to be executed
        }

        // if else statement

        boolean isdark = true;
        if (!isdark){
            System.out.println("lights Off !! ");
        } else {
            System.out.println("lights On !!");
        }


        // if else if
        // this is a nested if else statement

        int results = 82;
        if (results <= 50){
            System.out.println("Bro that's a fail !!");
        } else if (results<=60){
            System.out.println("Bro that's a pass !!");
        } else if (results<=70) {
            System.out.println("bro that's a competent!!!");
        } else if (results<=80) {
            System.out.println("Bro that a proficiency!!!");
        } else if (results<=100) {
            System.out.println("Bro thats a mastery");
        }

        // ternary operator
// there are 2 ways of initializing
       boolean isFruitfull = true;

        System.out.println((!isFruitfull)?"nota good disciple":"is a good disciple");

// second waay
        String result = (isFruitfull)?" Is a good disciple": " not a good disciple";
        System.out.println(result);

        // nested ternary operator

        int age = 25;
        String legalAge = (age<18)? "still a kid" : (age<=21)? "abit a grown up" : (age <=25) ? "can even enter into clubs" : "you are a full adult";
        System.out.println(legalAge);


        // other method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your preferred typa girl");
        String PrefferedGirl = scan.nextLine();


        System.out.println( PrefferedGirl.equals("pretty chick")? "good choice": PrefferedGirl.equals("good personality")? "amazing choice": "reenter again" );


        // switch statements

        Scanner scann = new Scanner(System.in);
        System.out.println("Enter the day ");
        String Day = scann.nextLine();

        switch (Day){
            case "monday":
                System.out.println("the first day of the week");
                break;
            case "tuesday":
                System.out.println("the second day of the week");
                break;
            case "wednesday":
                System.out.println("the third day of the week");
                break;
            case "thursday":
                System.out.println("the fourth day of the week");
                break;
            case "friday":
                System.out.println("the fifth day of the week");
                break;
            case "saturday":
                System.out.println("the sixth day of the week");
                break;
            case "sunday":
                System.out.println("the seventh day of the week");
                break;
            default:
                System.out.println("no day like that fahm ");
        }

    }
}
