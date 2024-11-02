/*
* this is mostly used in making the decision making
* they include AND "&&" with OR "||" with NOT "!"
* in and situation both conditions have to be true but in OR situation only one condition has to be right for it to execute
* not is used to reverse the logic of a condition
* */
public class LogicalOperators {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 150;
        int num3 = 200;
        // logical and "&&"
        boolean result = num1>num2&&num1>num3;// here both conditions have to be correct for it to be true
        System.out.println("logical and " +result);// in this case both conditions are false so the output will be false
        result = num1<num2&&num3>num2;// this case both conditions are true hence the output will be true
        System.out.println("logical and "+result);
        result = num1>num3&&num2<num3;// here one condition is true but the output will be false since the other condition is false
        System.out.println("logical and "+result);
        // logical OR "||"
        result = num1<num2||num3>num2;// this case both conditions are true hence the output will be true
        System.out.println("Logical OR "+result);
         result = num1>num2||num1>num3; // here both conditions are not correct hence the output false
        System.out.println("Logical OR "+ result);
        result = num1>num3||num2<num3;// here only one condition is true and the output will be true
        System.out.println("Logical Or "+ result);
        // Logical Not "!"
        result = num1>num3;// in this scenarion num1 is less than num3 hence the out will be false but we can reverse that with not operator
        System.out.println("Logical Not " +!result);


    }
}
