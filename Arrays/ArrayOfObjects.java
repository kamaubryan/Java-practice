package Arrays;/*
*
* */

class kiriro{
    // this class has the following properties
    int WhatBorn;
    String First_name;
    int children;
}
public class ArrayOfObjects {
    // now we have to create an instance of the first class which has several properties
    public static void main(String[] args) {
        // this are the first arrays
        kiriro firstBorn = new kiriro();
        firstBorn.WhatBorn = 1;
        firstBorn.First_name="teresia";
        firstBorn.children=4;
        // second born
        kiriro secondBorn = new kiriro();
        secondBorn.WhatBorn = 2;
        secondBorn.First_name = "susan";
        secondBorn.children=5;
        // third born
        kiriro thirdBorn = new kiriro();
        thirdBorn.WhatBorn = 3;
        thirdBorn.First_name="ann";
        thirdBorn.children=1;
        // now we can store the objects we have created in an array
        kiriro KirirosChildren[]= new kiriro[3];// here we have created an array and we have stored objects inside the array
        KirirosChildren[0]= firstBorn;
        KirirosChildren [1]= secondBorn;
        KirirosChildren [2]=thirdBorn;
     // lets now print the values
     for (int i=0;i<KirirosChildren.length;i++){
         System.out.println("here is every child of Arrays.Arrays.kiriro "+KirirosChildren[i].First_name+" : " + KirirosChildren[i].children + "and what born they are : "+ KirirosChildren[i].WhatBorn );
     }
    }
}
