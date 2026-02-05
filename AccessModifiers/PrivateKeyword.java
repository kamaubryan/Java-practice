package AccessModifiers;

public class PrivateKeyword {

    private String Continent;
    private String Country;
    private String County;

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public static void main(String[] args) {

        PrivateKeyword Location = new PrivateKeyword();

        Location.setContinent("Africa");
        Location.setCountry("Kenya");
        Location.setCounty("Nairobi");

        System.out.println( " -- Here is my current Location -- \n");
        System.out.println(" Continent : " + Location.getContinent());
        System.out.println(" Country : " + Location.getCountry());
        System.out.println(" County : " + Location.getCounty());
    }
}
