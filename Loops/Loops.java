package Loops;

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

// here we will use for each loop
class EnhancedForLoop{

    public static  void main(String[] args) {
        String names[]= new String[4];
        names[1] = "kamau";
        names[0]= "brian";
        names[3]="njoki";
        names[2]="samuel";
        // here we can use the for each loop in this example
        for (String n: names){// here the code is much simpler than in the other for loops
            System.out.println(n);
        }
        // lets try with another example
        String namess [][]= new String[3][];// here we have specified the number of arrays we want but inside the arrays we have not specified the particular size of each array
        // here we are specifying the size of the  inner arrays
        namess[0]= new String[3];// this is the first array which has three values
        namess[1] =new String[4];//this has four values
        namess[2]=new String[2];// this has two values
        // lets try storing the values manually
        // this is the first array
        namess[0][0]="brian";
        namess [0][1]="Kiriro";
        namess[0][2]="kamau";
// second array
        namess[1][0]="Steven";
        namess[1][1]="njihia";
        namess[1][2]="kamau";
        namess[1][3]="Timothy";
        // third array
        namess[2][0]="mwangi";
        namess[2][1]="kamau";
        // we can now store the values inside the array
      // here we can now use the enhanced for each loop
      for (String hello[] : namess){
          System.out.println(hello);// ill check this later
      }

    }
}
