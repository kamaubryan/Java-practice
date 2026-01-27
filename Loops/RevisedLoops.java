package Loops;

import java.util.Scanner;

// loops allow a set of instructions to run a multiple times based on a condition
public class RevisedLoops {
    public static void main(String[] args) {

        // for loops

        forLoop.main(args);

        forEachLoop.main(args);

        whileLoops.main(args);

        doWhileLoop.main(args);

    }
}


class  forLoop{

    public static void main(String[] args) {

        for ( int numbers  = 0; numbers<=10; numbers++){ // WHILE working with for loop its better to define the variable inside the for loop
            System.out.println(numbers + "  ");
        }

    }
}

class forEachLoop {

    public static void main(String[] args) {

        //  this is used to iterate over collections and arrays

        String [] DreamCars = new String[3];

        //defining the  arrays
         DreamCars[0] = "Benz";
         DreamCars[1]  = "Porsche";
         DreamCars [2] = "Beamer";

         for (String CarDream : DreamCars){
             System.out.println( " dream car : " + CarDream );
         }
    }
}


// do while loop


class whileLoops {
    public static void main(String[] args) {

        int m = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Please enter 3 of your best carBrands ");
        String[] DreamCars = new String[3];

        while (m<DreamCars.length){
            System.out.println("CAR " + (m+1) +":");
            DreamCars[m] = scan.nextLine();
            m++;
        }

         System.out.println("here as list of your favourite cars : \n");

        m =0; // we have to reset the value of the variable ;
        while (m<DreamCars.length){
            System.out.println(DreamCars[m]+"\n " );
            m++;
        }

    }
}


class doWhileLoop {

    public static void main(String[] args) {

        int r = 0;
        String[] names = {"Brian", "Timothy", "Stephen "};

        // you have to first execute the code before defining it
        do {
            System.out.println(names[r]);
            r++;
        } while (r<names.length);
    }
}