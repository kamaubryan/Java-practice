package Classes;
/*
* while working with abstract classes we saw that you can create an object of the abstract class the only remedy was to extend another class from it and create the object
* we can also achieve that using anonymous class
* */

abstract class E{// here we created the anonymous class
    public abstract void showE();
    public abstract void SecondShowE();
    public void getE(){
        System.out.println("we have getted E");
    }
}
public class AbstractAndAnonymousInnerClass {
    public static void main(String[] args) {
        // when we try to create an object of the abstract class
        E e = new E() {
            @Override
            public void showE() {
                System.out.println("in class E which is abstract");
            }

            @Override
            public void SecondShowE() {
                System.out.println("In the second Abstract E");
            }
        };
        e.showE();
        e.getE();
        e.SecondShowE();
    }
}
