package Exceptions;
/*this is used when you have multiple errors that may occur and probably each error has different messages
* you can use multiple catches to display the different error messages
*  */
public class MultipleTryCatches {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;
        int result;
        String names []= new String[4];
        String greeting = null;
        // now lets apply try catch error method
        try {
            // three multiple errors
            // try executes line by line
            result = num2/num1;//
            System.out.println(names[4]);// this will definitely bring an error
            System.out.println(greeting.length());// this should bring an error since its there is no value
        }
        // first catch for the first error
        catch (ArithmeticException e){//this is an arithmetic error
            System.out.println("you cant divide a number by zero " + e);
        }
        // second for array out of bounds
        catch (IndexOutOfBoundsException e ){// this is out of bounds of the index
            System.out.println("array is out of bounds " + e);
             }
        // third for a null error
        // since we don't  error that is here we can use the default exception
        catch (Exception e){
            System.out.println("something went wrong " + e);
        }
    }
}
