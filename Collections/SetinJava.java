package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* this supports unique values
* it deesnt defaultly sort the values
* doesnt support index values
* you cant duplicate values
* */
public class SetinJava {
    public static void main(String[] args) {
        Set <Integer> Numbers = new HashSet<>();
        Numbers.add(34);
        Numbers.add(34);
        Numbers.add(12);
        Numbers.add(123);
        Numbers.add(122);
        Numbers.add(10);

        // when we print the values it will only print one of the duplicate element
        System.out.println(Numbers);// doesnt sort items

        // if we want sorted sets we can use treeset which sorts the array from the small to the biggest
        Set <Integer> Salary = new TreeSet<>();
        Salary.add(23754357);
        Salary.add(2831648);
        Salary.add(211242);
        Salary.add(123);
        System.out.println(Salary);// sorts the numbers in a smallest to biggest manner


    }
}
