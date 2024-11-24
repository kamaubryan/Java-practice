package Enums;


enum Car{
    // we have created constant of cars
    Toyota(3000000),Mercedes(5000000),Ford(4000000),GTI(2500000), ;
    // lets create a constructor in order to incoporate the prices
    private int price;
    private Car(int price) {
        this.price = price;
    }
    // lets create a getter and a setter to get the price that is in private
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
public class EnumClasses {
    public static void main(String[] args) {
        Car mycar = Car.Ford;
        System.out.println(mycar.getPrice());
        // we can print all of them
        for (Car car : Car.values() ){
            System.out.println(car + " : " + car.getPrice());
        };
        // we can change a specific price of a certain car
        mycar.setPrice(347777);
        System.out.println(mycar + " : "+"ksh"+ mycar.getPrice());
        //
        mycar = Car.GTI;
        mycar.setPrice(598236245);
        System.out.println(mycar + " : "+"ksh"+ mycar.getPrice());
    }

}
