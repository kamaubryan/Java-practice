package ObjectOrientedProgramming;

// this is the process of hiding elements in a class by using the private keywords then retrieving using the public getters and setters

class Laptop{
    private String Brand;
    private int Price;
    private String Color;

//    // nor arguments constructor
//    Laptop(){
//
//    }
//
//
////     parameterized constructor
//    Laptop(String Brand, int Price, String Color){
//        this.Brand = Brand;
//        this.Price = Price;
//        this.Color = Color;
//    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }
}
public class RevisedEncapsulation {

    public static void main(String[] args) {
        //instantiating the class above
        Laptop PremiumLaptop = new Laptop();

        PremiumLaptop.setBrand("MAC");
        PremiumLaptop.setPrice(7000);
        PremiumLaptop.setColor("DARK GREY");

        System.out.println("One of the most premium brands is a " + PremiumLaptop.getBrand() +  " which costs around " + PremiumLaptop.getPrice() + " dollars and is " + PremiumLaptop.getColor() + " in colour");
//        Laptop newlaptop = new Laptop("Mac", 7000,"space black");
    }
}
