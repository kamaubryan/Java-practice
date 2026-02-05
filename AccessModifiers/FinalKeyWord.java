package AccessModifiers;

// final keyword makes the class not inheritable to other classes

final class Car{
    private static int Speed;

    static public int getSpeed() {
        return Speed;
    }

    static public void setSpeed(int speed) {
        Speed = speed;
    }
}

// below will bring an error that you cant inherit a class with a final keyword

// class dreamcar extends Car{
//
//}

public class FinalKeyWord {
    public static void main(String[] args) {
        Car.setSpeed(240);
        System.out.println(" My Dreamcar speed is : " + Car.getSpeed());
    }
}
