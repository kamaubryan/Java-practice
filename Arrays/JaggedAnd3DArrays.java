package Arrays;

import java.util.Scanner;

/*this is where the multidimensional array can have different values and length in each array
* the inside array can have different size
* */
public class JaggedAnd3DArrays {
    public static void main(String[] args) {

        // lets create a multidimensional array which is a jagged array
        String names [][]= new String[3][]; // here we have specified the number of arrays we want but inside the arrays we have not specified the particular size of each array
        // here we are specifying the size of the  inner arrays
        names[0]= new String[3];// this is the first array which has three values
        names[1] =new String[4];//this has four values
        names[2]=new String[2];// this has two values
        // lets try storing the values manually
        // this is the first array
        names[0][0]="brian";
        names [0][1]="Kiriro";
        names[0][2]="kamau";
// second array
        names[1][0]="Steven";
        names[1][1]="njihia";
        names[1][2]="kamau";
        names[1][3]="Timothy";
        // third array
        names[2][0]="mwangi";
        names[2][1]="kamau";
        // we can now store the values inside the array
        for (int i=0; i<names.length;i++){// where we are iterating over the first outer arrays
            for (int z =0; z<names[i].length;z++){// here we are iterating over the inside arrays where they are of different lengths
                System.out.print( names[i][z]+" ");
            }
            System.out.println();
        }
        UserInputJaggedArray.main(args);
    }
}



class UserInputJaggedArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // inputing data through the terminal;


        System.out.println("How many kids does Kiriro have?");
        int kiriroKidsCount = Integer.parseInt(scan.nextLine());// this converts the input to an integer

        String[] kiriroKidsNames = new String[kiriroKidsCount];// 1st dimensional array
        String[][] grandKidsNames = new String[kiriroKidsCount][]; // 2d dimensional array
        String[][][] greatGrandKidsNames = new String[kiriroKidsCount][][]; // dimensional array;;

        // INPUT
        for (int i = 0; i < kiriroKidsCount; i++) {

            System.out.println("\nEnter name of Kiriro's kid:");
            kiriroKidsNames[i] = scan.nextLine();

            System.out.println("How many kids does " + kiriroKidsNames[i] + " have?");
            int grandKidsCount = Integer.parseInt(scan.nextLine());

            grandKidsNames[i] = new String[grandKidsCount];
            greatGrandKidsNames[i] = new String[grandKidsCount][];

            for (int j = 0; j < grandKidsCount; j++) {

                System.out.println("Enter name of child of " + kiriroKidsNames[i] + ":");
                grandKidsNames[i][j] = scan.nextLine();

                System.out.println(
                        "How many kids does " + grandKidsNames[i][j] + " have?"
                );
                int greatCount = Integer.parseInt(scan.nextLine());

                greatGrandKidsNames[i][j] = new String[greatCount];

                for (int k = 0; k < greatCount; k++) {
                    System.out.println(
                            "Enter name of child of " + grandKidsNames[i][j] + ":"
                    );
                    greatGrandKidsNames[i][j][k] = scan.nextLine();
                }
            }
        }

        // OUTPUT
        System.out.println("\n--- KIRIRO FAMILY TREE ---");

        for (int i = 0; i < kiriroKidsCount; i++) {
            System.out.println(kiriroKidsNames[i]);

            for (int j = 0; j < grandKidsNames[i].length; j++) {
                System.out.println("  └─ " + grandKidsNames[i][j]);

                if (greatGrandKidsNames[i][j].length == 0) {
                    System.out.println("      (no children)");
                } else {
                    for (String name : greatGrandKidsNames[i][j]) {
                        System.out.println("      └─ " + name);
                    }
                }
            }
        }

        scan.close();
    }
}