package AccessModifiers;

// this makes the class, methods and the data members to be accessible withing the package(folder) and also within the subclasses
class car{
    protected int Speed;
    protected String interior;
}
 class LuxuryCar extends car{
    void setInterior(String interior){
        this.interior =interior;
    }
    String getInterior(){
        return interior;
    }

 }
public class ProtectedKeyword {
    public static void main(String[] args) {
        LuxuryCar desiredCar = new LuxuryCar();
         desiredCar.setInterior("Hand leather stiched");
        System.out.println(" this is accessed through the subclass : " + desiredCar.getInterior());

        car prefferedCar = new car();
        System.out.println(prefferedCar.Speed);

    }

}
