package Interface;
/*
* this a better way of storing public abstract methods instead of storing them in classes
* instead you can use the anonymous inner classes to access the abstract method
* a single class can implement multiple interfaces
* */
interface A {
    // everything in here is an abstract  so there is no need to declare them as abstract and public
    void showA();
    void getA();
    //when you declare a variable in an interface they are always final and you cant change the value
    int money = 350486; // this is finall you cant change it
    String Quote = "you have to win no matter what";
}
// lets create another interfaces
interface example1 {
    // we have created a method
    void show();
}
// lets now create a class that implements two interfaces
class implementInterfacess implements A,example1{// we have implemented two interfaces
    // we now have to define the methods

    @Override
    public void show() {
        System.out.println("we have just implemented two methods");
    }

    @Override
    public void showA() {
        System.out.println("we are in class implementationInterfaces");
    }

    @Override
    public void getA() {
        System.out.println("getted in class implementationInterfaces");
    }
}

// we have to create a class that implements the interface above
class B implements A{
    // we have to implement the methods
    @Override
    public  void showA(){
        System.out.println("we have shown In B");
    }

    @Override
    public void getA() {
        System.out.println("getted in B");
    }
}
// we can try using the Abstract class
abstract class C implements A{
    // now here we don't have to implement the methods in class A
}
public class Interface {
    public static void main(String[] args) {
        // can we call the class above
        A a = new A() {
            @Override
            public void showA() {
                System.out.println("showed in A");
            }

            @Override
            public void getA() {
                System.out.println("getted in A");
            }
        };
        a.getA();
        a.showA();
        // we can get the variables without using the instantiation method
        System.out.println(A.money);
        System.out.println(A.Quote);
        //we can use that or this
        int money = A.money;
        String Quote = A.Quote;
        // we can now print the values
        System.out.println(money);
        System.out.println(Quote);

// we can create an object in class B
        B b = new B();
        b.getA();
        b.showA();


        // now lets try implementing the methods in class C
        C c = new C() {
            @Override
            public void showA() {
                System.out.println("we have showed implementation this in C");
            }

            @Override
            public void getA() {
                System.out.println("we have getted this implementation in C");
            }
        };
        c.getA();
        c.showA();

        // we can now come and create an object of the class implementation
        implementInterfacess myclass = new implementInterfacess();
        // now we can access the statements
        myclass.getA();
        myclass.showA();
        myclass.show();
    }
}
