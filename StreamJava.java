import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* they are divided into two intermediate operations and terminate operations
* */
public class StreamJava {
    public static void main(String[] args) {
        List <Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        myNumbers.add(5);
        myNumbers.add(6);
        myNumbers.add(7);

        System.out.println(myNumbers);
        List <Integer> filtered = myNumbers.stream()
                .filter(m-> m%2==0)
                .map(m-> m*m)
                .collect(Collectors.toList());

        List <String> Names= new ArrayList<>();
        Names.add("hello");
        Names.add("Brian");
        Names.add("Timothy");
        Names.add("Steven");
        Stream <String> FilteredNames = Names.stream().filter(m-> Character.isLowerCase(m.charAt(0)));
        FilteredNames.forEach(System.out::println);


        System.out.println(filtered);


    }
}



 class Squares {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use streams to filter even numbers, square them, and collect to a new list
        List<Integer> evenSquares = numbers.stream()
                .filter(n -> n % 2 == 0)      // Filter even numbers
                .map(n -> n * n)              // Square each number
                .collect(Collectors.toList()); // Collect results to a list

        // Print the resulting list
        System.out.println("Squared even numbers: " + evenSquares);
    }
}