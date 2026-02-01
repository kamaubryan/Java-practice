package Methods;
// methods are blocks of code that perform specific tasks

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

    }
}
