package Methods;

/**
 *this is when a certain method has the same names but accepts different parameters which do return different values
 *
 *
 */

class Subtraction{
    // lets create a method inside the class
public int substract(int number1, int number2, int number3){// this method takes two parameters
    return number1-number2-number3;// then it returns by subtracting them
    // we can have the same method which accepts different parameters
}
public int subtract(int number1,int number2){
    return number1-number2;
}
// we also can create the same with diffrent parameters
    public double subtract(double number1,int number2){
    return number1-number2;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Subtraction subtract = new Subtraction();// here we have created an instance of an object inside
        int result = subtract.substract(34,19,3);// we have given another variable inorder to enable printing
        System.out.println(result);
        result = subtract.subtract(34,45);
        System.out.println(result);
       double result2= subtract.subtract(5.44,4);
        System.out.println(result2);


        Overloading.main(args);
    }
}

// this is a state where a method can have the same name but different parameters
class Overloading{
    static int Subtract(int Y, int X){
        int subtraction = X -Y;
        return subtraction;
    }

    static double Subtract(double M, double N){
        double subtraction = M- N;
        return subtraction;
    }

    // we can aslo have a method with the same data type but different parameters

    static int Subtract(int K){
        int subtraction = 10 - K;
        return subtraction;
    }

    public static void main(String[] args) {

        System.out.println(" this is the first method : " + Subtract(20,30));

        System.out.println(" this is the second method : " + Subtract(3.2, 4.3));

        System.out.println(" this is the third Method : " + Subtract(12));
    }
}