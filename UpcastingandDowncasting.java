/*
*we can type cast classes. its divided into two : upcasting and downCasting
* upcasting is when we get the properties of the superclass to the subclass hence printing the properties of the superclass while on the subclass
* down casting this is when we do print the properties on the subclass while on the superclass
* this is achieved through inheritance
* */
class greeting{
    public void greeting(){
        System.out.println("hello there");
    }
}
// lets extend an onofficial greeting
class wozza extends greeting{
    // method as always
    public void greeting1(){
        System.out.println("wozza wozza");
    }
}

public class UpcastingandDowncasting {

    public static void main(String[] args) {
        // this is what we call up-casting where we have typecasted the subclass with the super class
        greeting mygreeting  = (greeting) new wozza();// here we have type casted the methods in class greeting with the method in class wozza
        mygreeting.greeting();// here i can only access the method in a since i have type casted the class greeting with class wozza

        //down casting
        greeting officialGreeting = new wozza();// here we are only going to print the methods in class wozza

        // we can change change that
        wozza unofficialGreeting = (wozza) officialGreeting;// we have given the properties of the subclass to the superclass
        unofficialGreeting.greeting1();//it will print the properties of the subclass
    }
}
