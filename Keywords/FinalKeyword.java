package Keywords;

/*
* this can be used with a method class and a variable
* when you use a final keyword in a variable that means that we cant reassign any value to the variable
* when you use final in class that means we cant inherit anymore from that class
* when use declare a method final you cant override it
* */
public class FinalKeyword {
    public static void main(String[] args) {
        // lets try with a variable
        // normal variable
        int num1 = 20;
        System.out.println(num1);
        // we can change the value of this variable to another
        num1=34;// we have already changed the value
        System.out.println(num1);
        // we can make the variable a constant one
        final int num2 = 45;
        // when we try to change the variable it will bring an error
        //num2 = 34;// this will bring an error

        // we can create an object of the class Keywords.Car below
        Car myCar = new Car();
        myCar.engineType();
        myCar.Color("Alpine Grey");

        // lets try creating an object of class Keywords.AIC
        AIC myAIC = new AIC();
        myAIC.Praising();// since this is not overrideable it will print the specific in the class Keywords.AIC not the one in Class Church
        myAIC.Singing();// we cant override this since its already final in class Keywords.Churches

    }
}
// lets try with classes
final class Car {
    // we can create a method
    public void engineType(){
        System.out.println("a V8 engine");
    }
    // lets create another with parameters
    public void Color(String TypeofColor){
        System.out.println(TypeofColor);
    }
}
// lets try to inherit the final class above
//class FavouriteCar extends Keywords.Car{// when we try to inherit the class Keywords.Car we cants since the class is the final class
//}

// lets try method finallizing
class Churches {
    // lets create a simple method
    public void Praising(){// this is a non final method
        System.out.println("praise God ");
    }
    public final void Singing(){// this is a final method which cant be overrided
        System.out.println("singing to the Most High");
    }
}
// then we inherit the  class Keywords.Churches
class AIC extends Churches {
    // we can override the method above

    @Override
    public void Praising() {
        System.out.println("Praise the With all your heart and soul");
    }
    // no lets tyr overriding thefinal method
//    public final void Singing(){// when we try to override the final method it bring an error since its final
//        System.out.println("Sing by praising , jumping");
//    }
//
}