package ObjectOrientedProgramming.RevisedInheritance;
//this is when more than one class inherits from the base class

class Vehicle{
    Vehicle(){
        System.out.println(" this is a vehicle");
    }
}

class Mercedes extends Vehicle {
    Mercedes(){
        System.out.println(" this is a mercedes ");
    }
}

class Porsche extends Vehicle{
    Porsche(){
        System.out.println(" this is a porsche ");
    }
}
public class MultilevelInherintance {
    public static void main(String[] args) {
        Mercedes merc =  new Mercedes();
        Porsche porsche = new Porsche();
    }
}
