package Packages.AccessModifiers;
// lets use this to text the ones that are only accessed within a package
public class Main {
    public static void main(String[] args) {
        Protected myProtected = new Protected();
        myProtected.height=169; // here we are able to access the values since we are in  the same package
        // lets try Default
        Default myDefault = new Default();
        myDefault.height= 168;// we are also given access since we are on the same package

    }
}
