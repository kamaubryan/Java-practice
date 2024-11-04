package Classes;

/*
* this is a class that doesnt have a name
* */

class D{
    // lets create a method called show
    public void ShowD(){
        System.out.println("in class D");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        // creating a new object of class D
        // we can create an anonymous inner class which we will change the output and override the method without using the class keyword
        D d = new D(){// this is a class inside a class
            @Override
            public void ShowD() {
                System.out.println("in new class D");
            }
        };
        d.ShowD();// when we print the code above it will print th changed items
    }
}

