package RevisedCollections;
// this is a framework including a set of classes and interfaces that provide ready made structure to store and manipulate data

import java.util.ArrayList;
import java.util.Collection;


public class collection {
    public static void main(String[] args) {
        Collection<String> Cars = new ArrayList<>();

        Cars.add("Mercedes");
        Cars.add("Beamer");
        Cars.add("Ford");

//        implementation

        System.out.println(" this is after adding the elements to the collection list : " + Cars);

    }
}
