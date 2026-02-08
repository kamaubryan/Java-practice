package ObjectOrientedProgramming;
// this is where we call different methods in a single line without calling other methods with the same object on separate lines

class religion{
    private int NoofReligion;
    private String MyReligion;
    // we have created a constructor for the parent class
    religion(){
        System.out.println(" we have several religions in Kenya");
    }
   public religion SetNoofReligion(int noofReligion){
        this.NoofReligion = noofReligion;
        return this;
    }

   public religion SetMyReligion(String MyReligion){
    this.MyReligion=MyReligion;
     return this;
    }

    void AboutReligion(){
        System.out.println(" there are : " + NoofReligion + "number of Religions in kenya and : " + MyReligion + "  is my religion");
    }
}
public class MethodChaining {
    public static void main(String[] args) {
        // method chaining
            new religion().SetNoofReligion(3).SetMyReligion("Christianity").AboutReligion(); // this will print all the methods in the class

// method chaining for the class below
        new Electronics().setKilloWatts(1200).setPrice(5000).setCategory("TV").QualityElectronic();
    }
}

class Electronics{
    // creating  constructor\
    Electronics(){
        System.out.println("these are device that need electricity to work ");
    }
    // variables we are going to work with
    private int KilloWatts;
    private int Price;
    private String Category;

    // create a custom setter for the private variables above

    public Electronics setKilloWatts(int KilloWatt){
        this.KilloWatts= KilloWatt;
        return this;
    }
    public Electronics setPrice(int Price) {
        this.Price = Price;
        return this;
    }
    public Electronics setCategory(String Category){
        this.Category = Category;
        return this;
    }
    // a void method
    void QualityElectronic(){
        System.out.println("Budget friendly electronic with " + KilloWatts + "Killowatts " + " is supposed to be approximately $" + Price + " which is of the " + Category+ " Category");
    }


}