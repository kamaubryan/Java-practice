package Arrays;


class Laptops {
    public String name;
    public int price;

    Laptops(String name,  int price){
        this.name= name;
        this.price=price;
    }
}

public class RevisedArrayofObjects {

    public static void main(String[] args) {
        // declaring the array
        Laptops[] favLaptops;

        // allocating the memory
        favLaptops = new Laptops[3];

        // initialize the elements of the array
        favLaptops[0] = new Laptops("M4 maxMacbook", 7000);
        favLaptops[1]  = new Laptops("asus", 2500);
        favLaptops[2] = new Laptops("Lenovo" , 1500);

        // accessing the elements

        for (int i=0; i<favLaptops.length; i++){
        System.out.println("this is my " + i  + " favourite laptop " + favLaptops[i].name + " and it costs $" + favLaptops[i].price  );}


    }

}
