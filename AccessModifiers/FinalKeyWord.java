package AccessModifiers;

// final keyword makes the class not inheritable to other classes

import ObjectOrientedProgramming.Inherintance.Cat;

final class Car{
    private static int Speed;

    static public int getSpeed() {
        return Speed;
    }

    static public void setSpeed(int speed) {
        Speed = speed;
    }
}

// below will bring an error that you cant inherit a class with a final keyword

// class dreamcar extends Car{
//
//}

 class Dog {
    public final  void sound(){
        System.out.println("Wooh! Wooh!");
    }


    static String Color(String colour){

        return colour;
    }
}
class Mutina extends Dog{
//    bellow cant happen since the method there cant be overridden
//    public void sound(){
//
//    }
    static void bark(){
        System.out.println("Guuh! Guuh!");
    }

}

public class FinalKeyWord {
    public static void main(String[] args) {
        Car.setSpeed(240);
        System.out.println(" My Dreamcar speed is : " + Car.getSpeed());

        Mutina.bark(); // bark is a static method so i dont have to reinitialize the class
        Mutina mutina = new Mutina(); // since the method sound isnt a static we have to reinitialize the method to access the method sound()
        mutina.sound();

        System.out.println(Dog.Color("black"));
        System.out.println(Mutina.Color("yellow"));

//        final variables
        final int number = 45;
//        number=4;  Cannot assign a value to final variable 'number'
        System.out.println("final number : " + number);
    }
}
