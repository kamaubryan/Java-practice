package InitializerBlocks;
// this executes the code before object initialization during the class loading state (the main method in this case)
public class StaticInitializerBlock {

    // this runs in the compile time
    static {
        System.out.println("Hello!");
    }

    static {
        System.out.println("HI!");
    }

    public static void main(String[] args) {
        System.out.println("in the main method");
    }
}
