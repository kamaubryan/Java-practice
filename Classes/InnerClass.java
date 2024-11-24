package Classes;

/*this is where you can define a class inside a  class
* since some properties of some class can only we accessed inside a certain class
*
* */
class A{
    int age;
    public void show(){
        System.out.println("in class A");
    }
    // we have now created a class within a class
    class B{
        public void showB(){
            System.out.println("in the class B");
        }
    // lets try to create a class inside a class which is inside a class
        class B1{
            // method
        public void showB1(){
            System.out.println("inside B1 class");
        }
    }

    }
       static class C {
            public void showC(){
                System.out.println("in the class C");
            }
        }


}
public class InnerClass {
    public static void main(String[] args) {
        // we can call the object class of A
        A a = new A();
        // wecan access the properties like methods
        a.show();// this will print the properties
        //inorder to access the class B that is inside the Class A
        A.B b = a.new B();// we have used the object that we had earlier of class A
        b.showB();// we are now able to access the method in class A

        //lets try in a static class

        // when a class is static you dont need to create an object of it
        A.C c = new A.C();// we have not needed to create an object of C
        c.showC();//

        // lets try to access the method inside a class which is inside a class that is inside a class
        A.B.B1 b1 = b.new B1();
        b1.showB1();// we have now accessed the inner method of class B1

    }
}
