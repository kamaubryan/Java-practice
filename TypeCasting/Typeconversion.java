package TypeCasting;

/*
* this involves converting from one datatype to another
* also casting is involved
*
* */
public class Typeconversion {
    // converting int to byte
    public static void main(String[] args) {
        byte a = 127;
        int b = 290;
        int y = a;// this has already converted to int since int is big enough to hold byte values
        System.out.println(y);
        byte g = (byte) b; // here we have converted the value of b above to form int to byte.. using implicit casting method
        System.out.println(g);// the output here will be 34??? this because the max value of a byte is 256 so when you convert to byte it take your value and divides it by 256 and displays the remainder as your value
        // in this case our value is 290 it will be 290%256 which is equals to 34;

        float f = 5.6f;
        int x = (int) f;// here we have already changed the value of f to x as an integer
        System.out.println(x);// the output here is 5 since it has been converted to integer

        // type promotion...........................................................................................................................................................
        byte k = 10;
        byte l =50;
        int outcome = k*l;// when we multiply the two value their result will be more than the byte validity so we promote the result to int since int can handle the value outcome
        System.out.println(outcome);
    }
    }

