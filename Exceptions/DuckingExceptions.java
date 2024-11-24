package Exceptions;
/*
*
* */

class A {
    public void show(){
        try {
            // lets try searching for a class thats not in this package
            Class.forName("yoow ");// there is no class like this
        }
        catch (ClassNotFoundException e){
            System.out.println("not able to find the particular class");
        }
    }
}
// we can try without a try catch inside the class
class B {
    // since we have not put a try catch in the method we have to throw the method from the method
    public void showb() throws ClassNotFoundException{
Class.forName("yeyeyeyeyeye");
        }
    }

public class DuckingExceptions {
    public static void main(String[] args) {
        // here we are trying to create an object of the class above inorder to call the method with the try catch
        A a = new A();
        a.show();

        // now we have to create the try catch here
        B b = new B();
        // since this will bring an error we have to put the try catch
        try {
            b.showb();
        } catch (ClassNotFoundException e) {
            System.out.println("the mentioned class is not available");
        }

    }

}
