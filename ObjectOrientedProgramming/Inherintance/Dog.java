package ObjectOrientedProgramming.Inherintance;
/*
* here we are testing the single and multilevel inheritance
* the class animal has been inherited by class cat then class dog inherits from class cat, that  is called multilevel inheritance
* when the classes inherit from only one class that is called single level inheritance
* Another class can also inherit from class dog and that is also multilevel inheritance
* */
public class Dog  extends Cat{// here we have extended the properties of the class animal to class Dog
    // lets add a method to this class dog
    public int leg(int noOfLegs){// it accepts the parameter no of legs where it returns the nooflegs
        return noOfLegs;
    }
}
