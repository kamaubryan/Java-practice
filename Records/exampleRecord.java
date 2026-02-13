package Records;

import java.util.Objects;

// records helps us remove boiler plate code .
class internetConnectivity{
    private final String Strength;
    private final int Price;
// constructors
    internetConnectivity(String strength, int price){
        this.Strength = strength;
        this.Price = price;
    }
    // getters

    public String getStrength() {
        return Strength;
    }

    public int getPrice() {
        return Price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof internetConnectivity that)) return false;
        return Price == that.Price && Objects.equals(Strength, that.Strength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Strength, Price);
    }

    @Override
    public String toString() {
        return "internetConnectivity{" +
                "Strength='" + Strength + '\'' +
                ", Price=" + Price +
                '}';
    }

    public static void main(String[] args) {
        internetConnectivity Internetconnectivity = new internetConnectivity("5G", 3000);
        System.out.println(" the well preffered internet is  : " + Internetconnectivity.getStrength() + " and the price is kes" + Internetconnectivity.getPrice());

    }
}
public record exampleRecord(String Strength, int Price) {
    public static void main(String[] args) {
        exampleRecord internet = new exampleRecord("5G", 3000);
        System.out.println(internet.Price); // for the records its easy to print the details

    }

}
