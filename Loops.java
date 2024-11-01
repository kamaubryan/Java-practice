import java.util.Scanner;

/*this is used to iterate around conditions
*there are several loops which include for-loop, while-loop, do-while-loop;
*/
 class ForLoops {
    public static void main(String[] args) {
        // lets say we want to repeat a certain statement int a number of times
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");


        for (  int i = scanner.nextInt(); i<=20; i++) {
            System.out.println("  hello there "+i +" times");
        }
        scanner.close();
        // we can have a loop inside a loop
        int day;// we want to show the work hours of each weekday
        int hours;
        for (day=0;day<=5;day++){
            System.out.println("this is day "+ day);
            for (hours=1;hours<=9;hours++){// this is a loop inside a loop
                System.out.println("the working hours are from "+(hours+8) +" --" +(hours+9));
            }
        }
    }
}
class DowhileLoop{// a condition can be passed even when it hasn't met for at least one
    public static void main(String[] args) {
int r=0;
do {
    System.out.println("hello there "+ r +" times");// this will print until it meets the condition
    r++;
}while (r<=5);
// but lets see a case where the conditions is not met
        int k = 6;
        do {
            System.out.println("woza kijana " + k + "times");
            k++;
        }
        while (k<=5);// here k is less than the required condition but it will print at least one
    }
}
class whileLoop{// this only print when the concept is only true using a one line of condition
    public static void main(String[] args) {
        int k=0;
        while (k<=6){
            System.out.println("this is number "+ k);
            k++;
            int r =1;
            while (r<=3){// here we are printing the following after every iteration
                System.out.println("    hello there "+ r + "times");
                r++;
            }
        }
    }
}
