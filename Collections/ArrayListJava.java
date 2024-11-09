package Collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*collections ensures dynamic in arrays and its very convenient to use
*
* */
public class ArrayListJava {
    public static void main(String[] args) {
        // here we have used generics where we have to specify the type of the array
       Collection <Integer> newcollection = new ArrayList<>();
       // we can add multiple properties in the arraylist
        newcollection.add(3);
        newcollection.add(5);
        newcollection.add(7);
        newcollection.add(12);
        // unlike arrays we can directly print collections without having to iterate
        System.out.println(newcollection);

        // if we want to access with index value its safe to use list
        List <String> Names = new ArrayList<>(4);
        // we can names with indexes
        Names.add(0,"karayo");// here we are specifying the index that the name will be
        Names.add(1,"Samuel");
        Names.add(2,"wunna");
        Names.add(3,"yeyeyeye");
        System.out.println(Names);
        for (String name : Names){
            System.out.println(name);
        }
        // we can also set the value of an array
        Names.set(2,"weqtnhwejj");// here we have changed the value that was there before to a new one
        System.out.println(Names);
// cheking index of a name
        System.out.println(Names.indexOf("karayo"));
        // we can also delete the value of and array list
        Names.remove(2);
        System.out.println(Names);
    }
}
