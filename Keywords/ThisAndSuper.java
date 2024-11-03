package Keywords;

/*super keyword is always default in all which it means that after calling parameter which also occure after inheriting
it call the constructor of the super class or the base class
*this keyword is basically used to mean that you want tp print all the constructors in the same class
* */
// lets create two random classes
// every class in java extends from class objects by default
class randomclass1 extends Object{
    // we can also create a constructor in this class
// every constructor has a method called super even if its not called
    // this super method means that call the constructor of a super class
    public randomclass1() {
        super();// this always there
        System.out.println("yoow I'm in class Keywords.randomclass1");
    }
    // we can also create a parameterized consttructor
    public randomclass1(int AnyNumber){
        super();
        System.out.println("hello there this is just any number " + ":"+ AnyNumber);
    }
}
// the second class extends from the super class Keywords.randomclass1
class randomclass2 extends randomclass1{// when we specify the class to extend from for example in this class we only extends from the class above
    // we  can create a constructor that returns a simple statement

    public randomclass2() {
        super(34);// then in this constructor we have specified that it will print from the super non-parameterised constructor; we can specify the parameterized one

        System.out.println("yoow I'm in class Keywords.randomclass2");
    }
    // we can create another constructor that accepts parameter
    public randomclass2(String greeting){
        // since when we are calling executing the object class two its calling the default non parameterized constructor then we can pass a parameter in the super method which is in the parameterized method in the second class
        this();// here we have specified the constructor to print from this class
        System.out.println("wozza");
    }
}
public class ThisAndSuper {
    public static void main(String[] args) {

        // lets create for the second
        // when we have already created the object of the class above the constructor in class1 will also be executed

        randomclass2  rclass2 = new randomclass2();// here we are calling the default constructor of Keywords.randomclass2; since we have not given it parameters
        // the constructor has already been called after instanciating the new object
        // here we can specify which constructor is being called by just adding the parameter
        rclass2 = new randomclass2("yoow");// in this case the first parameter in the first class is being called
// since in the above code we are specifying the constructor to print we can choose to print all parameterized and none parameterized constructors
        // we can achive this using this keyword

// we can create another object known where we will see the real difference
        randomclass2 myClass =  new randomclass2("heey");//just by creating this new obj we have called the parameterised constructor which will print all constructors in the class which will then call the non parameterized constructor



    }
}
