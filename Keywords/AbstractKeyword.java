package Keywords;

abstract class Brian{// for an abstract method to work it should be in an abstract class
    // creating the methods
  public abstract void getBehaviour();// in this case we are not sure of what to keep in this case since we don't know what is his behaviour yet
    public void getFavCar(String Car){
        System.out.println(Car);
    }
}
// we can extend the class Brian that  has different properties
class Brayoh extends Brian{// this is in other words called a concrete class
    // we can now define the properties of the undefined product
    public void getBehaviour(){// we now have to define the abstract method from above here
        System.out.println("super nonchalant");
    }
}
public class AbstractKeyword {
    public static void main(String[] args) {
       // Brian brian = new Brian();// you cant instanciate an object of an abstract class
        // the only thing you can do is create an object of the inherited class
        Brian brian = new Brayoh();// no we have created an object of the inherited class from the super class
        brian.getBehaviour();
        brian.getFavCar("m5cs");

    }
}
