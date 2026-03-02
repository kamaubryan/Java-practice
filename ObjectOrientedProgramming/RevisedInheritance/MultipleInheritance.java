package ObjectOrientedProgramming.RevisedInheritance;
// this is where one class inherits from more than one interface at the same time
// this is only applicable with interfaces

interface Linux{
    default void Linux(){
        System.out.println("        LINUX");
    }
}

interface Windows{
    default void Windows(){
        System.out.println("        WINDOWS");
    }
}

interface MACOS{
    default void MACOS(){
        System.out.println("        MACOS");
    }
}

class LaptopsOS implements MACOS,Windows,Linux{
    LaptopsOS(){
        System.out.println("Laptop OS include : ");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        LaptopsOS laptopsOS = new LaptopsOS();
      laptopsOS.Linux();
      laptopsOS.Windows();
      laptopsOS.MACOS();
    }
}
