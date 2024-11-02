package ObjectOrientedProgramming.Inherintance;
/*this is when a certain class takes properties from another class and it becomes theirs
* in  other word this is when a subclass gets to inherit the properties of a super class
* it gets  access to another class properties and gets to keep the properties
* you use the keyword extends to access the properties
* we can inherit properties of a class that is within the same package
* */

public class Inherintance {
    public static void main(String[] args) {
        // here we can still access the properties in the other file by creating an object
        Animal myAnimal = new  Animal();
        myAnimal.behavior("weirdly");
        myAnimal.sound("zzzzzz");
        // we can basically print the values
        System.out.println(myAnimal.behavior("weirdly")+" "+ myAnimal.sound("zzzzzz"));

        // since the class inherit has the properties similar to Animal hence we will print everything as usual
        Cat mycat = new Cat();
        // now we have access to the properties of animal
        mycat.behavior("slowly");// since everything in the methods behaviour and sound always accepts string hence we give them strings as the parameters

        System.out.println("my cat walks " +   mycat.behavior("slowly") + " and does sounds like "+ (mycat.sound("meow"))  );


        // we can create another instance of an object dog which has similar features and more
        // reminder is that we have inherited the properties from class cat
        Dog myDog = new Dog();
        myDog.leg(4); // we have given the required parameters that the method was needing
        myDog.sound("gugugugu"); // we have gotten access of the properties that animal had before
        myDog.behavior("walks super fast");
        // we can print every detail of the new acquired object called my dog
        System.out.println( "my dog has "+ myDog.leg(4) + " legs "+" where it " + myDog.behavior("walks super fast")+ " where it removes sounds like " + myDog.sound("gugugugu"));

    }
}
