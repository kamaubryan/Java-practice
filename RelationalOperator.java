/*
* it involves greater than ">", lesser than "<", equal to "==",
* not equalto "!="
*
* */

public class RelationalOperator {
    public static void main(String[] args) {
        int x =10;
        int y = 20;
        boolean result = x>y;// we have compared the value of x to y using relational operators
        System.out.println(result);
        y=10;
        result=x>=y;// in this scenario y and x are of the same value hence the greater than or equalto will be true
        System.out.println(result);
        x= 13;// change of value of x
        result = x!=y;// x with the new value is not equal to y.
        System.out.println(result);
        y=13;// changed the value of y to 13
        result = x==y;// here the value is true
        System.out.println(result);
        // you can also do it with any data type
        String fName = "Brian";
        String sName = "Kiriro";
        Boolean comparison = fName== sName; // since they arent the same the output will be false
        System.out.println(comparison);

    }
}
