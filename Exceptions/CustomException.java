package Exceptions;
/*this a custom built exception that only return what you have said it will return
*
* */
// we have extended our class from the extend class
class CustomMadeException extends Exception{
    // we have created an constructor
    public  CustomMadeException(String string){
super(string);// we are passing the message to the super class  this is for the purposes of getting the value of e
    }
}
public class CustomException {
    public static void main(String[] args) {
        // we will try to get the length of a string
     int num1 = 2;
     int num2 = 0;
        try {
        num2 = 0/num1;// since this will be 0 we should throw our custom exception
        throw new CustomMadeException("any number divided by zerro is zero");
        }
        catch (CustomMadeException e){
            System.out.println("it is really out of bounds "+e);
        }
        catch (Exception e){
            System.out.println("default message");
        }
    }
}
