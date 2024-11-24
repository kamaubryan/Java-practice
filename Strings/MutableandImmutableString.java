package Strings;
/*
* here we are using string buffer and string builder
* String buffer lets you change the value of the string upto 16 values
*
* */
public class MutableandImmutableString {
    public static void main(String[] args) {
        StringBuffer name1= new StringBuffer("brayooh");// this is the intial value of the string name
        System.out.println(name1.capacity());// gives you an extra space of 16 bytes which is added to your current value
        System.out.println(name1.length());// the initial length is 7
        // lets try to change the value
        name1.append("wozza");// here we have just added the name wozza to the existing value brayooh
        System.out.println(name1);
        // we can also delete a certain index
        System.out.println(name1.delete(7,9));// here we have deleted the specific characters we want out
        // you can also use this
        System.out.println(name1.deleteCharAt(9));// it returns the full name without the specific deleted data
        // we can also insert at a certain character
        System.out.println(name1.insert(0,"hello"));// here we have inserted at the first index
    }
}
