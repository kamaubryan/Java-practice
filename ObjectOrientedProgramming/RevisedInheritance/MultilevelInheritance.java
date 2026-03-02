package ObjectOrientedProgramming.RevisedInheritance;


class Kiriro{
    Kiriro (){
        System.out.println(" I'm the Grandpa");
    }
}

class Kamau extends Kiriro{
    Kamau(){
        System.out.println("I'm the Father");
    }
}

class Brian extends Kamau{
    Brian(){
        System.out.println("I'm the grandchild");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Brian KamauBrian = new Brian();// this initializes all the constructors

    }
}
