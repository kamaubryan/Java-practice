package Methods;
// methods are blocks of code that perform specific tasks

import java.util.Scanner;

abstract class GreatCars{
    abstract void greatCars(String name, String Brand, int YOM);// abstract methods cant have a body

}
class DreamCar extends GreatCars{
    @Override
    void greatCars(String name, String Brand, int YOM){
        System.out.println("My dream car is "+ name + " which is a brand of : " + Brand + " of the year : " + YOM );
    }

    public static void main(String[] args) {
        DreamCar myCar = new DreamCar();
        myCar.greatCars("E250","Mercedes", 2023);
    }
}

public class JavaMethods {


    // types of methods
    // static method
    static void dreamCar(String name, String Model){
        System.out.println(" my dream car is " + name + " and its model is " + Model);
    }

// instance method
    public void family(){
        System.out.println("A good family is the one that is loving and caring");
    }


    public static void main(String[] args) {
        // calling the static method you dont have to reinitialize the class
        dreamCar("Mercedes", "E63s");
// we have to reinitialize the class to access the method
        JavaMethods Myfamily = new JavaMethods();

        Myfamily.family();

        // calling the class above
            DreamCar.main(args);

            ifElseMethod.main(args);

            FullName.main(args);

            Power.main(args);

    }
}

class ifElseMethod {
    String Car1 = "Beamer";
    String Car2 = "Benzo";
    String Car3 = "Audi";
    String Car4 = "VolksWagen";



 void checkIfIsGermanCar (  String  GermanCar){
        if (GermanCar.equals(Car1) || GermanCar.equals(Car2)|| GermanCar.equals(Car3)|| GermanCar.equals(Car4)){
            System.out.println("this is a german car");
        } else {
            System.out.println("not a german car boyz");
        }
    }

    public static void main(String[] args) {

     // requesting the user to enter their preffered car brand
        Scanner scan = new Scanner(System.in);
        System.out.println("please anter your preffered Car Brand");
        String GermanCar = scan.nextLine();


       ifElseMethod Checker = new ifElseMethod();
       Checker.checkIfIsGermanCar(GermanCar);
    }
}


class FullName {
    static String names(String Fname,String Sname){
       String full_Name = Fname+ Sname;
        return full_Name;
    }

    public static void main(String[] args) {
        System.out.println(  names("brian", "Kamau"));

    }
}

class Power{
    static int power(int x){

        return (int) Math.pow(x,x); // we have type casted the power since it requires the parameters in double form

    }

    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            System.out.println(" the power of " + i + " is : " + power(i));
        }
    }
}