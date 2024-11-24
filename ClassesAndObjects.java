/*
* Java is an object programming languages hence everything in java is an object
* every object has a behavior and a property
* in order to create an object you have to create a class
* a class acts as a blueprint for creating an object
* */
// lets create a separate class
class calculator{// this class itself is an object itself
    int b;
    // the following methods recieves some two parameters which in turn returns the operation
    public int multiplication(int number1,int number2){// here we have created a method for multiplying
        // we can perform our tasks
        int multiple = number1*number2;
        System.out.println("multiplying");
        return multiple;// you have to return something in the method


    }
}
public class ClassesAndObjects {
    public static void main(String[] args) {
        //we have to create an instance of an object so that we can access the properties of the class above
        calculator multiply= new calculator();// we have now created an object in this
        multiply.multiplication(67,68);//here we have called the method where it will give us the contents of the method
        System.out.println(multiply.multiplication(56,57));
        // we can equate the method to a variable
        int result = multiply.multiplication(67,68);
        System.out.println(result);
        int num1=6;
        int num2=8;
        // we can also use the numbers we have use in our class
        System.out.println(multiply.multiplication(num1,num2));// here we have used the values that we have created inside the main class
        // they will act as the parameters above


    }
}

