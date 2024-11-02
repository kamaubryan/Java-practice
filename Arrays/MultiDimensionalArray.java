package Arrays;

/*
* this is where a single array has multiple arrays
* this is how we put it {int names [][] = new int [4][6]}-- this numbers inside represents the number of array inside
* in this case we have 4 arrays where each has 6 elements
* when we want to access this we use the index
*
* */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int numbers[][]= new int[3][4];

        // when we want to print the contents inside it we use two loops {nested loops}
// here we want to generate randowm numbers using the math.random manner
        for (int j=0; j<numbers.length;j++){
            for (int k =0; k<4;k++){// inside this loop is where we print all the contents inside the inner loop
                numbers[j][k]= (int) (Math.random()*10);// here we have borrowed random number from the library and laater we multiplied with a
                // hundred the type casted it to int data type since its a double data type
            }
        }
        for (int j=0; j<numbers.length;j++){
            for (int k =0; k<4;k++){// inside this loop is where we print all the contents inside the inner loop
                System.out.print(numbers[j][k] +" ");
            }
        System.out.println();
}
        // we can use an enhanced array
        for (int n[]:numbers){// here we have assigned the variable n to the numbers array
            for (int m :n){// then we reassigned the variable m to n
                System.out.print(m+" ");// now it will print all the values here
            }
            System.out.println();
        }
    }
}
