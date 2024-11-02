package Methods;
/*
*
*
* */

class Method{
    int num1 = 34;
    int num2 = 10;
    static int num3 = 100;
    public static void methods(){
        System.out.println("this is a static method");
        System.out.println(num3);// while accessing the variables above you cant access if they arent in static manner
    };
}
public class StaticMethods {
    public static void main(String[] args) {
        Method newMethod = new Method();// we have created an instance of the object above

        //while accessing static methods its kinda different
        Method.methods();// here we have called the earlier static
    }


}
