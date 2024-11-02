package ObjectOrientedProgramming;

/*
* this is called hiding some content from certain people
*it utilises the methods of get and set methods in order to access the values
* they are divided into two where the unassigned value use both set and get and the others use the get method only
* */

import java.security.PrivateKey;

class FavouriteCar{
    String engine;// very much accessible
    String  color;// very much accessible
    // lets try to hide them
    private String model ="GLE";// this can only be accessed in this class nowhere else can it be accessed
    private String type = "mercedes";
    // lets try unassigned values
    private String Size ;
    private String Fastness;
    // in order to access this variable above which are private you can use the following methods
    public String Getmodel() {
        return model;// here we have gotten the access of the private variables above
        // this is because they are in the same class
    }
    public String getType(){
        return type;// this returns the type
    }

    // before we get the methods you have to set the values
     public void setSize(String size){
         Size=size;
     }
     public void setFastness(String HowFast){
        Fastness=HowFast;
     }
    // we will create a method to get the names
    public String getSize(){
        return Size;
    }
    public String getFastness(){
        return Fastness;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        FavouriteCar myCar = new FavouriteCar();
        myCar.color = "Alpine Grey";
        myCar.engine="A v8 Engine";
        System.out.println(myCar.engine);// this variables are accessible
        // when we try to access the private properties of the class above there will be an error
      //  myCar.model= "gle";// there will be an error since the objects are private
        // no we are able to fetch the values of the private variables using the method we have created
        System.out.println(myCar.Getmodel());
        System.out.println(myCar.getType());

        // now here when we are trying  to access the unassigned values we can set the values then we get the values
        myCar.setFastness("pretty fucking fast");// here we have already set the values of the private unassigned variables
        myCar.setSize("SUV");
        // we can now print them
        System.out.println(myCar.getFastness() +" and " + myCar.getSize());
    }
}

class practice {
    private String practice1 = "kinda hard";// the first is already given the value
    private String practice2;// the second one is not given any value
    // in the first you just have to create a get method which we will access later
    public String getPractice1(){
        return practice1;
    }
    // here on the second variable we have to create a method that first set the unassigned variable
    public void SetPractice2(String outcome){// since we aint returning anything then the method should be void
        practice2= outcome;
    }
    // then we have to get the setted variable
    public String getPractice2(){
        return practice2;
    }
}
// we now create another class that we will print the outcomes
   class example {
    public static void main(String[] args) {
        practice newPractice = new practice();
        System.out.println( newPractice.getPractice1());
        newPractice.SetPractice2("not that bad");// here we are setting the variable of the unassigned variable
        System.out.println(newPractice.getPractice2());// then we can now get value
    }
}