package Constructures;

import java.util.Scanner;

// this is a method where it doesnt need to return anything
public class RevisedConstructor {

    private String Name ;
    private int Age ;

    public RevisedConstructor(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" please enter your name ");
        String Name = scan.nextLine();

        Scanner Scan = new Scanner(System.in);
        System.out.println(" Please enter your age ");
        int age = Scan.nextInt();

        RevisedConstructor Person = new RevisedConstructor(Name,age);

        System.out.println("my name is : " + Person.getName() + " and my age is : " + Person.getAge());
    }
}
