/*
* this is where a function calls itself
*
* */
public class Recursion {// we have created a class called recursion
    public static void main(String[] args) {// we have created main method inside the class
        int result = sum(15);
        System.out.println(result);
    }
    public static int sum (int k){
        if (k>0){
            return k+ sum(k-1);

    }
        else {
            return 0;
        }
}}
 class main{
    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        return n* factorial(n-1);
    }

     public static void main(String[] args) {
          int number =6;
         System.out.println("number is:" + number);
         if (number<0){
             System.out.println("error : factorial is undefined for negative numbers");
             System.exit(1);
         }
         int result = factorial(number);
         System.out.println("factorial of " + number + "is:" + result);
     }
}
