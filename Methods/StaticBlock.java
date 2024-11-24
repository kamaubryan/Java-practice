package Methods;


class Static{
    int enough ;
    static int notEnough ;
    static String Car ;
  // here we can create a static block of the objects that do not change
    static {// here this static block is only called once
        Car=" VolksWagen Golf 8R sport";
        notEnough = 3140495;
      System.out.println("in static block");
  }
  public void nonStatic(){
        enough = 232482092;
      System.out.println("nonstatic block");
  }
    public void show(){
        System.out.println("hello");
    }

}
public class StaticBlock {
    public static void main(String[] args) {
        Static newStatic =  new Static();
        // now we can access the contents of the class above
        newStatic.show();// here we have accessed the method above
        // but as we know right now is that the cant access a static method in the above manner


        // here we can create a new object
        Static anotherStatic = new Static();

    }
}
//package Methods;

class Static6 {
    int enough;
    static int notEnough;
    static String Car;

    // Static block - called only once when the class is loaded
    static {
        Car = "VolksWagen Golf 8R Sport";
        notEnough = 3140495;
        System.out.println("In static block");
    }

    // Non-static method
    public void nonStatic() {
        enough = 232482092;
        System.out.println("In non-static block");
    }

    // Method to show a message
    public void show() {
        System.out.println("Hello from show method");
    }
}

 class StaticBlock3 {
    public static void main(String[] args) {
        // Creating the first instance of Static
        Static newStatic = new Static();
        newStatic.show(); // Accessing non-static method
        System.out.println("Car: " + Static.Car); // Accessing static variable via class name
        System.out.println("NotEnough: " + Static.notEnough); // Accessing static variable

        // Creating another instance of Static to demonstrate static block behavior
        Static anotherStatic = new Static();
        anotherStatic.show(); // Calling show again

        // Accessing non-static method of the second instance
        anotherStatic.nonStatic(); // This will set 'enough' and print the non-static block message

        System.out.println("Enough: " + anotherStatic.enough); // Accessing non-static variable from instance
    }
}

