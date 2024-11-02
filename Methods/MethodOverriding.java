package Methods;
/*
* this is when you inherit a certain class and you dont want to take the valueof the methods created in the super class then you change it to whatever you want it
*
*
* */
class Girls {
    // lets create an empty method
    public void typeofGirls(){
        System.out.println("what type of girls do you like in class Girls");
    }
    // we can also create another method
    public void colorOfGirls(){
        System.out.println(" i like them lightSkins in class girls");
    }
}
class Girl extends Girls{ // we have inherited the properties of the class above
    // we can change the value of the methods already in class Girls to give us our required value
public void typeofGirls(){
    System.out.println("what type of girls do you like in class Girl");
}
// we can override the other method
    // you dont necessarily need to use the @overriding anotation
    public void colorOfGirls(){
        System.out.println(" i like them lightSkins in class girl");
    }

}
public class MethodOverriding {
    public static void main(String[] args) {
        // to access the class above you just create a new object
        Girls myGirls = new Girls();
        myGirls.typeofGirls();// here we have accessed the method in above

        // we can also create an object of the class Girl
        Girl myGirl = new Girl();
        myGirl.typeofGirls();// here we have already accessed the method of the first class
        myGirl.colorOfGirls();

    }

}
