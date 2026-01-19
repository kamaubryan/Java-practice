package Strings;

public class StringMethods {
    public static void main(String[] args) {

        // commonly used string methods
        String Device = "Tablet";

        System.out.println(Device.length()); // checks the length of the string

        System.out.println(Device.charAt(4)); // returns the string at that index

        System.out.println(Device.substring(4));// it will return the string from that index

        System.out.println(Device.substring(1,4)); // it will return a range between those indexes

        System.out.println(Device.concat(" and Laptop")); // adds another String to the current string

        System.out.println(Device.indexOf("b")); // returns the index of the specified string

        System.out.println(Device.toLowerCase()); // brings all the characters in lowercase

        System.out.println(Device.toUpperCase()); // all in uppercase

        System.out.println(Device.equals("tablet")); // it will compare and the output will be in boolean (true or false)

        System.out.println(Device.equalsIgnoreCase("tabLEt")); // it ignores the case and returns in a boolean answer

        System.out.println(Device.replace("T", "P")); // replaces the old character with the new character

        System.out.println(Device.contains("b"));// will return a boolean

        System.out.println(Device.startsWith("a")); // returns a boolean

        String phone = "Iphone ";

            char[] chars = phone.toCharArray();
            for(char c :chars){
                System.out.println(c + " ");
            }


    }
}
