package Interface;

// here we can create a parent interface which is extended by the class laptop
interface Computer{// remember everything in an interface is abstract
    void code();// we will implement the method differently in each class
}
class laptop implements Computer{
    // in this context a programmer need a laptop to develop
    public void code(){
        System.out.println("powerfull one which is a laptop");
    }
}
// lets create another class desktop that implements the interface computer
class Desktop implements Computer{
    // we have to implement the method code
    public void code() {
        System.out.println("super fast in a desktop");
    }
}
class programmer{
    // here we will need the class laptop in order to develop
    public void devApp(Computer lap){// inside the method we have passed a parameter that is an object of the laptop class
        lap.code();// then here we have called the method above
        System.out.println("he codes");
    }
}
public class importance {
    public static void main(String[] args) {
        programmer meProgrammer = new programmer();
        // we have to create an object of class laptop
        laptop lap = new laptop();
        meProgrammer.devApp(lap);// this will output the statement above
        // we also have to create an object of class desktop
        Desktop myDesktop = new Desktop();
        // we can now create an object of the class computer
        Computer preferable = new laptop();
        Computer  available = new Desktop();

        // we can call the method with the parameter
        meProgrammer.devApp(preferable);// we can decide if its a laptop we want
        meProgrammer.devApp(available);// or a desktop

    }
}
