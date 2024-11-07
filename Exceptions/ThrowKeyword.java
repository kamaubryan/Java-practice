package Exceptions;
/*this  keyword is used when you want to custom make an error that you do customize it to get your catch statement
*
*
* */
public class ThrowKeyword {
    public static void main(String[] args) {
        // lets create default variables
        int num1 = 9;
        int j = 0;
        // we use try catch method
        try {
            // we are reassigning the value of J;
            j = 1 / num1;// by default this will execute and no error will be created but we dont want that sso we will create ours
            if (j==0){
               // throw new Exception();// we can give any catch here but it will still print the error but warned
                throw new ArithmeticException();
            }

        } catch (ArithmeticException e) {// since this is an arithmetic exception we have to specify
            System.out.println("this is not valid in this case");
        } catch (Exception e) {// this is the default exception
            System.out.println("can't work");
        }
        System.out.println(j);// this will print
    }}