package Objects;
/*
*
* */
class A {
    public A (){
        System.out.println("object already created"); // here we have already created an object  and now we are creating the constructor
    }
    public void show(){// here we have created an object which is empty and cants return anything
        System.out.println("in a show");
    }
}
public class Anonymousobjects {
    public static void main(String[] args) {
        // this is what we call an anonymous object // its because it has no name
        new A();// here we have already created an object hence the constructor is already called
        // you cant reuse the object you have created since you have to create a new one
        new A().show(); // this prints like the below once which we have assigned to "a"
        // we create an instance of the object above
        A a = new A();// here the small a is referring to a reference value that is used to reference the object being created
        a.show();
        // when we run the above code all the code even that of the constructor will be run

    }

}
