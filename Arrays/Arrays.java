package Arrays;

/*
* this is where a certain variable stores multiple values
* here its kinda different since you have to the java code that you're declaring an array
*
* */
public class Arrays {
    // the draw backs of an array is that you when you have already specified the number of elements in each array you cant change that but you can only copy the array and give them new number .
    public static void main(String[] args) {
        // this is the creation of variable
        String names []= {"rian", "kamau","Arrays.Arrays.kiriro","brian"};
    // we can print all the names using for loop where it will iterate in the loop
        for (int i =0;i<names.length;i++){
            System.out.println(names[i]);
        }
        // if you want to access a certain number you can use the following method
        System.out.println(names[2]);// you can use the brackets method
        // we can change a specific value of the array using the following
        names[2]= "Monster";
        System.out.println(names[2]);// here the value has already changed

        // we can make it dynamic since it can change anytime
        int numbers []= new int[8];// here we have specified the number of arrays that we need
        numbers[0]= 0;
        numbers[3]=1;
        numbers[5]=6;
        numbers[7]=10;
        numbers[2]=13;
        // lets try printing all the values at once using for loop
        for (int k=0; k<numbers.length;k++){
            System.out.println(numbers[k]);
        }




    }
}
