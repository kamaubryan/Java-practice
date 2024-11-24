package Annotations;

import java.util.Scanner;

abstract class car {
     String engineType;
    String  color;
    public abstract String getEngine(String engineType);
    public String getcolor(String color){
        System.out.println("any color of your choice");
        this.color = color;
        return color;
    }
}
class merc extends car{
    @Override
    public String getEngine(String engineType) {
        this.engineType = engineType;
        return engineType;
    }

    @Override// here we have overwridden the method
    public String getcolor(String color) {
      this.color = color;
        return color;
    }
}
public class overration {
    public static void main(String[] args) {
        merc mymerc = new merc();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your engine type");
        String engine = scanner.next();
       String result =  mymerc.getEngine(engine);
        System.out.println(mymerc.getEngine(engine));
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter your best color");
        String color = scanner1.next();

        // lets use an
    }
}
