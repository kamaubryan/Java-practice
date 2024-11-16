package Streams;

import javax.swing.text.html.HTML;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PracticeStream {
    public static void main(String[] args) {
        // we are going to use raw arrays and the collection arrays
        String Names [] = {"Brian","Bacon","Kamau","Kiriro","Stephen"};
        System.out.println(Arrays.toString(Names));
        List<String> MyNames = new ArrayList<>(4);
        MyNames.add(0,"Brian");
        MyNames.add(1,"Bacon");
        MyNames.add(2,"KaMau");
        MyNames.add(3,"Stephen");
        System.out.println(MyNames);
        Stream<String> FilteredNames = MyNames.stream().filter(m->Character.isUpperCase(m.charAt(2)));
        System.out.println(FilteredNames);
        FilteredNames.forEach(System.out::println);
    }
}
