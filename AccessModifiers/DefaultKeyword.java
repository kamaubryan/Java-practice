package AccessModifiers;
// when a method , class or data member has no defined access modifier , its said to have a default access. this means the classes in the same package(folder) can access them
class needs{
    String Shelter= "Good clean house";
    String Food = "Balanced diet";
    String Clothes = "fitting & Good looking Clothes";
}
public class DefaultKeyword {

    public static void main(String[] args) {
        needs BasicNeeds = new needs();

        System.out.println(" these are the basic needs to live a better life ");
        System.out.println("    : " + BasicNeeds.Shelter);
        System.out.println("    : " + BasicNeeds.Food);
        System.out.println("    : " + BasicNeeds.Clothes);
    }
}
