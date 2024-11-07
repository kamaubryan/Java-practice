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
