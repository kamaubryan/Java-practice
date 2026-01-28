package ObjectOrientedProgramming;

public class Person {

    String Name;
    String Behaviour;
    String Normality;
    int Age;

   Person(String Name, String Behaviour, String Normality, int Age){ // this is a constructor
       this.Behaviour= Behaviour;
       this.Name = Name;
       this.Normality = Normality;
       this.Age = Age;
   }

    public static void main(String[] args) {
        // lets try and print the values above

        Person Brian = new Person("Kamau", "Intelligent", "curious", 22);
        System.out.println(" My name is " + Brian.Name + " and I posses the following characteristics " + "\n : "  +Brian.Behaviour + "\n : " + Brian.Normality + "\n : " +Brian.Age);
    }



}
