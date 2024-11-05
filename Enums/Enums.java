package Enums;
/*this are defined constants that we do create
*you cant extend a class from enum
* enum only extends the enum class
* */

enum cars{
    // here we are defining constants that we are going to use
    muscle,sporty,luxury,family;
}
public class Enums {
    public static void main(String[] args) {
        // we cann create a reference object like we do in classes
        cars mycar = cars.luxury;// inside the class enums the content in there is always an object
        // we can try to get the type of class
        System.out.println(mycar.getClass().getSuperclass());// output "class java.lang.Enum"
        // we can print the result
        // 1st way
        String name = mycar.name();
        System.out.println(name);
        // second way
        System.out.println(mycar);// similar outputs
        // we can also check the index of the enum
        System.out.println(mycar.ordinal());// will return 2 since its index 2
        // instead of print one object in an enum we can print all
        cars  [] alltypes= cars.values();// this this is an array we have to store it in an array
        // well use looping to to iterate over all values
        for (cars all : alltypes){
            System.out.println(all + " : "+ all.ordinal());// will print together with the index
        }

        // using if and ifelse and also switch in enums
        // we can create a new method
        cars typeofcar = cars.sporty;
        // we can use if else statements
        if(typeofcar == cars.family){
            System.out.println("this is best for a family guy");
        }
        else if (typeofcar==cars.luxury){
            System.out.println("man of culture");
        } else if (typeofcar==cars.muscle) {
            System.out.println("we ni mzii");
    }
        else {
            System.out.println("this is the sporty version");
        }
        // switch version
        cars Switch = cars.muscle;
        switch (Switch){
            case family :{
                System.out.println("this is best for a family guy");
                break;
            }
            case sporty:{
                System.out.println("this is the sporty version");
                break;
            }
            case muscle:{
                System.out.println("we ni mzii");
                break;
            }
            case luxury:{
                System.out.println("man of culture");
                break;
            }
        }
}}
