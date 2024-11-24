package Exceptions;
/*this is a manner of handling errors since when compiling , when the compiler find an error it stops executing at that moment
* using try catch method it makes it possible to run the other commands
*
* */
public class TryCatch {
    public static void main(String[] args) {
        int num1 =0;
        int num2 = 0;
         // we will use try catch for when a certain error is expected

        try {
            // here definitely theres going to be an error
            num2= 45/num1;// dividing anything by zero is always zero and since its ann error it will print the catch statement
        }
        catch (Exception e){
            System.out.println("this is not possible" + e);
        }
        // we can now print the others outside the method
        System.out.println("successfull");
        System.out.println(num2);// here it print the initial value of num2 before the compiling

        // lets try when there is not error
        try {
            num2 = 2;
            num1=4;
            int result = num1/num2;// this is a logic division so no error should occur

        } catch (Exception e) {
            System.out.println("not possible");// this statement won't be printed since there is no error above
        }
        System.out.println("it was successfull");
        System.out.println(num1);
    }

}
