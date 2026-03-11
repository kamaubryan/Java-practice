package RevisedCollections;

import java.util.HashSet;
import java.util.Set;

/*
 1. this represents a collection of unique elements
 2. doesn't allow duplicate elements
 3. contains atmost 1 null value but fot the treeset it doesnt allow any null value
 4. it doesnt store the elements in any specific order
 */
public class sets {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(45);

        // checking if it will print the duplicate elements

        System.out.println(" this are the numbers ");
        for (Integer no: numbers){
            System.out.println( no);
        }

        System.out.println(numbers.size());

//        checking if contains the elements

        System.out.println(numbers.contains(4)); // prints in a boolean structure

        // removing thw elements

        numbers.remove(45);

        System.out.println(numbers);


    }
}
