package Conditionals;
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

        int age = 22;
        String legalAge = (age<18)? "still a kid" : (age<=21)? "abit a grown up" : (age >=21) ? "can even enter into clubs" : "you are adult";
        System.out.println(legalAge);
    }
}
