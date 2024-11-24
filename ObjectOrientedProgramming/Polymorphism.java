package ObjectOrientedProgramming;
/*
* this is where a certain class behaves differently int different behaviors
* its divided into two = @a compile time , Run time;
* this type of polymorphism only works when its extended
* */


// lets try runtime polymorphism
class A{// class a is the parent since it has two inheritors Band C
    // lets create a method
    public void hello(){
        System.out.println("Hello in class A ");
    }
}
class B extends A{
    // lets try to method override the first method
    @Override
    public void hello(){
        System.out.println("hello in class B");
    }
}
class C extends A{
    @Override
    public void hello() {
        System.out.println("hello in class C");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        // lets create an object of class B
        B newB  = new B();
        newB.hello();//we have accessed the method
        // we can also create a new object with a class A
        // its possible to create a reference object with a super class using a subclass
        A obj = new B();//when we run this it will print the method in A class since we have created a method using the new B class
        obj.hello();// still here we can access the method
        // in simple terms
        A obj1 = new A();// here obj1 refers to an object of class A
        obj1.hello();//this will print the class A method
        // we can refer the same reference to the object of class B
        obj1 = new B();// now here we have given it to a reference of the object class B
        obj1.hello();// it will print the values of Object Class B
        // when we try with obj of class C it will print the class C itself
        obj1 = new C();// we have now acquaired the properties of class C
        obj1.hello();//

    }
}
