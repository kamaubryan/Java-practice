package Abstraction.Interfaces;
// interfaces implement abstractions in the full length

interface Animal{
    String Colour();
    String Family();

//   public String Breed ;
}

class Cat implements Animal{
    private String colour;
    private String Family;

    Cat(String colour, String Family){
        this.colour = colour;
        this.Family = Family;
    }

    @Override
    public String Colour(){
        return " the color of this cat is : " +  colour;
    }

    @Override
    public String Family(){
        return " the family of cat is : " + Family;
    }
}

class Rabbit implements Animal{
    private String colour;
    private String Family;

    Rabbit(String colour, String Family){
        this.colour = colour;
        this.Family = Family;
    }

    @Override
    public String Colour(){
        return " the color of the rabbit is : " + colour;
    }

    @Override
    public String Family(){
        return " the family of the rabbit is : " + Family;
    }
}
public class InterfaceExamples {
    public static void main(String[] args) {
        Cat cat = new Cat(" Grey", " CAT");
        Rabbit rabbit = new Rabbit("White", "Leporidae");

//        printing the answers

        System.out.println(cat.Colour() +" \n" + cat.Family());
        System.out.println(rabbit.Colour() + "\n" +rabbit.Family());
    }
}
