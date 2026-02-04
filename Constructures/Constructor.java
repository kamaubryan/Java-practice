package Constructures;

/*
* it is a special method that doesnt return anything
*
* */
class siblings {
    private int whatBorn;
    private String Name;
    // we can set a default value for the  values aboves
    public siblings() {
        whatBorn = 1;
        Name = "Brian";
        System.out.println("in constructor");// every time an object is created the constructor is called
    }
// we have created methods that can access and modify the values
    public int getWhatBorn() {
        return whatBorn;
    }

    public void setWhatBorn(int whatBorn) {
        this.whatBorn = whatBorn;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
}
public class Constructor {
    public static void main(String[] args) {
        siblings mySiblings =  new siblings();// everytime this is executed the above constructor is ussually called
        System.out.println(mySiblings.getName() + " : "+ mySiblings.getWhatBorn());// here they have taken the default values that we have defined in the constructor
         //we can now try to set the values to our liking and print them
        mySiblings.setName("Steven");
        mySiblings.setWhatBorn(3);
        // we can reprint the statement and it will have different values than the first one
        System.out.println(mySiblings.getName() + " : "+ mySiblings.getWhatBorn());// this has different values

        // here we are calling the constructor class below it behaves like hoisting in js

        // here we have given the  values to the new object created and give it our values
        parameterizedConstructor myConstructor = new parameterizedConstructor(300000,"senior software Developer");
// we can now print our newly made object
        System.out.println(myConstructor.getPosition() +" : " + myConstructor.getSalary());
    }
}

class parameterizedConstructor{
    private int salary ;
    private String Position;
    // no we can create a constructor where we will give it the default values

    public parameterizedConstructor(int salary, String position) {// this is a parameterized constructor which takes int parameters
        this.salary = salary;
        this.Position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        this.Position = position;
    }
}
