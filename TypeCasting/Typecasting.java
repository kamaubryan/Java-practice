package TypeCasting;

// Type casting is the process of converting from one data type to another
// There are 2 main types:
// 1. Widening (Implicit) - automatic conversion from smaller to larger type
// 2. Narrowing (Explicit) - manual conversion from larger to smaller type

class WideningTypeCasting {
    // Involves converting from a smaller data type to a larger data type
    // Happens automatically - no data loss risk
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println("Original int: " + num1);

        // Automatic type casting (widening)
        double num2 = num1;
        System.out.println("Converted to double: " + num2);

        // Widening hierarchy example: byte -> short -> int -> long -> float -> double
        byte myByte = 100;
        int myInt = myByte;      // Automatic
        long myLong = myInt;     // Automatic
        float myFloat = myLong;  // Automatic
        double myDouble = myFloat; // Automatic
        System.out.println("Full widening chain: " + myByte + " -> " + myDouble);
    }
}

class NarrowingTypeCasting {
    public static void main(String[] args) {
        double myNum1 = 15.0;
        System.out.println("Original double: " + myNum1);

        // Explicit casting required - potential data loss
        short myNum2 = (short) myNum1;
        System.out.println("After narrowing to short: " + myNum2);

        // Example showing data loss
        double decimal = 123.456;
        int integer = (int) decimal;  // Loses .456
        System.out.println("Data loss example: " + decimal + " -> " + integer);

        // Example showing overflow risk
        double large = 50000.0;
        short overflow = (short) large;  // short max is 32,767
        System.out.println("Overflow example: " + large + " -> " + overflow);
    }
}

public class Typecasting {
    public static void main(String[] args) {
        System.out.println("=== Widening Type Casting ===");
        WideningTypeCasting.main(args);

        System.out.println("\n=== Narrowing Type Casting ===");
        NarrowingTypeCasting.main(args);
    }
}
