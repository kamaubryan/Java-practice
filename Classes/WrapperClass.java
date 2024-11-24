package Classes;

public class WrapperClass {

    public static void main(String[] args) {
        int num1 = 9;
        System.out.println(num1);
        // we can reassign this to an integer
        Integer num2 = num1;// here num2 does not have the exact value of num1 since we have reassigned it to an integer. boxing is happening automatically to an object integer
        System.out.println(num2);
        // we can try to get the exact value of num1
        int num3 = num2.intValue();// here we have unboxed it to an int from an integer bracket
        System.out.println(num3);

        // we can autounbox from a string to an int
        String number1 = "23";// this here is a string in a number // autoboxing has already happened in this case
        System.out.println(number1);// this prints the number in a string form
        // we can get the value number which is in a string to an integer
        int number2 =  Integer.parseInt(number1);
        System.out.println(number2*2);// since we cant multiply a string we can now multiply a number since unboxing has already happened

        // lets try with an actual word
        String word = "yoow";
        System.out.println(word);
        // converting it to a number
        int numberWord = Integer.parseInt(word);
        System.out.println(numberWord);// the word "yoow" here is already a number
    }
}
