package Exceptions;

import java.util.Scanner;

/*try can be used with very many resources
* try with finally .when you put finally in a try catch statement it ensures that the statement there will be executed regardless of the outcome
* */
public class TrywithResources {
    public static void main(String[] args) {
        //using scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        String name = "kiriro";
       // we can use try catch method here
        try {
            boolean b = name == scanner.nextLine();// here we will print the wrong output
        } catch (Exception e) {
            System.out.println("naaah mahn wrong name");
        }
//         here we will use finally to close the scanner resource
        finally {
            scanner.close();
        }
//        // lets try printing an out of bounds array
   String names [] = new String[4];// has initial values
     // lets try to catch an array that is out of bounds
        try {
            String name1 = names[6];// this will throw an error

       }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("this is out of bounds " +e);
        }
        // here we can have a statement that is gonna be executed regardless
        // finally can also be used to close a resource
        finally {
            System.out.println("go home to your families");
        }
    }
}
