import java.util.Arrays;

// they are divided into two : primitive and non-primitive data types
// primitive datatypes are later divided into four: integer,float,character,boolean
public class DataTypes {
    public static void main(String[] args) {
        int kakpo = 34;// 4 bytes
        System.out.println(kakpo);
        long jdcf = 45565;// 8 bytes
        System.out.println(jdcf);
        short krek = 454;// 2 bytes
        System.out.println(krek);
        char c = 'k'; // while assigning a character you have to use the single speech marks not like in string where we use double ones
        System.out.println(c);
        c++;// you can increment a character like a number
        System.out.println(c);// the output here wil be l. it follows the alphabetical order
        boolean factual =true; //only true or false
        System.out.println(factual);
        double achievements = 5.6;// you have to specify the type
        System.out.println(achievements);
        float loops = 5.5f;// in float, you have to indicate if it is a double or float . if it is a float you put the letter f at the end
        System.out.println(loops);
    }
}

class OtherDatatypes{
    public static void main(String[] args) {
        // primitive data types
        byte B = 100;  // byte
        short S = 30000; // 2bytes
        int I = 100000; // 4 bytes
        long L = 100000000L; // 8bytes

        float F = 3.14f; // 4bytes
        double D = 3.142345554; // 8bytes
        char C = 'A'; // 2bytes (unicode character)
        C++; // this will increment the current alphabet to "B" the output will be "B"
        boolean Claim = true; //1bit

        System.out.println("byte " + B);
        System.out.println("short "+ S);
        System.out.println("int " + I);
        System.out.println("long "+ L);
        System.out.println("float "+ F);
        System.out.println("double " + D);
        System.out.println("char "+ C);
        System.out.println("boolean " + Claim);

         // non primitive data types
        // string
        String laptops = "Lenovo";
        System.out.println("the laptop that coded this line is a "+ laptops);

        // array
        int[] numbers ={1,5,7,8,9};
        String [] socialmedia = {"Tiktok", "Substack", "youtube", "X"};
        System.out.println(" here are the numbers : " + " "+ Arrays.toString(numbers));
        System.out.println("these are the main social medias : " + Arrays.toString(socialmedia));
         // * interface
        // * Class
        // * object
    }
}
