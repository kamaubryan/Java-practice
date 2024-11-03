//package Packages.MainPackage;
//
//import Packages.AccessModifiers.Default;
//import Packages.AccessModifiers.Private;
//import Packages.AccessModifiers.Protected;
//import Packages.AccessModifiers.PublicAccessor;
//import Packages.firstPackage.Testing;// here we have had to import the package since were in different files
//
//public class Tester {
//    public static void main(String[] args) {
//        Testing test = new Testing();
//        PublicAccessor newPublicAccesser = new PublicAccessor();
//        newPublicAccesser.height= 5.6;// here we have accessed the values and given the value to them
//        Private newPrivateAccesser = new Private();
//       // newPrivateAccesser.Height;// we cant access the height since its only private
//        // when we try to access the default height we cant since we are in different packages
//        Default myDefault = new Default();
//       // myDefault.Height// this is impossible since we are on different packages
//
//        // lets try the protected access modifiers
//        Protected myProtected =  new Protected();
//       // myProtected.height// accessing is impossible since we are  in different packages
//    }
//}
//// inorder to access the default and protected values we can use the inheritance mamnner where a subclass can have the values
//// File: DefaultInhertance.java
//
//
//class DefaultInhertance extends Default {
//    public void getheight() {
//        // Accessing the inherited default field `height` from superclass `Default`
//        System.out.println("Height: " + height);
//    }
//
//    public static void main(String[] args) {
//        // Creating an instance of DefaultInhertance
//        DefaultInhertance instance = new DefaultInhertance();
//        instance.height = 180; // Setting a value for the inherited height field
//        instance.getheight();   // This should print: Height: 180
//    }
//}
//
