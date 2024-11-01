import java.util.Scanner;

/*this where most operations happen at.
* in every class create it should have a behavior and that behavior is called a method
* */
// lets create a class that has a method
class car{// this class car has a behavior and we can define the method
    // if we dont want to give the method any return statement we use the "void" keyword
    public void engineRevving(){// here the word public means that youre giving it access to anything
        // so here we dont expect anything returned
        System.out.println("this is a v8 engine that can do many revs as possible");
    }
    // lets create another method that has a return method at the end
    public  String getName( String FirstName, String SecondName){
        return FirstName+SecondName;
    }

}
// we can create a class where in order to recieve something you have to meet certain conditions
class BuyingCar{
    public String BuyingAcar(int Money){// here it is a method where the user has to input a certain amount of money to access the car
        if (Money<3000000){
            return ("tafuta pesa kijana");// remember to return
        }
        else if (Money==3000000){
            return ("bado we ni maskini  lakini una nafasi ya kuchukua hii gari");
        }
        else {
            return ("kijana you have worked hard enough");
        }
    }
}
public class Methods {
    public static void main(String[] args) {
        // here we are promptiong the user to input their details using the scanner library
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first name");
        String fname = scanner.nextLine();
        System.out.println("enter your second name");
        String Sname = scanner.nextLine();
        System.out.println("how much do you have");
        int money = scanner.nextInt();
        // here we have to create an object of the first class above to access the contents in the above class
        car myCar = new car();
        // here we can call the methods
        myCar.engineRevving();// here it will output the statment in the enginerevving method since it didnt have the return method
        // calling the second method
        myCar.getName(fname,Sname);
        // for us to print the values we can do that in two ways
        // or by just printing the details given
        System.out.println("this are your names "+myCar.getName(fname,Sname));
        // storing in another variable
        String AllNames = myCar.getName(fname,Sname);
        System.out.println("this are your names"+ AllNames);
        // here we are creating an instance of the class above
        BuyingCar buy = new BuyingCar();

        String  result = buy.BuyingAcar(money);
        System.out.println(result);

    }
}
