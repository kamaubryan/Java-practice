package ObjectOrientedProgramming.Class;



// lets first create a class that had attributes

class car {
    int YOM ;
    String Make ;
    String CarType ;

    public car (int YOM, String Make, String CarType){
        this.YOM = YOM;
        this.Make = Make;
        this.CarType= CarType;
    }
}


public class Class {

    public static void main(String[] args) {
         car favCar = new car(2023,"Mercedes Benz", "Sedan"); // this is creating an object from the class we created above;
        System.out.println(" my fav car YOM is : " + favCar.YOM + " and its brand is : " + favCar.Make + " which is a " + favCar.CarType);

    }
}
