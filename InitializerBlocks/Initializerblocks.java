package InitializerBlocks;

// the difference betwween this and static blocks is that these dont have the static keyword, and they run at the time of instance creation
// the java compiles initializer blocks into every constructor
public class Initializerblocks {

    {
        System.out.println(" this is instance block 1");
    }

    {
        System.out.println(" this is instance block 2");
    }

    public Initializerblocks(){
        System.out.println(" inside the constructor");
    }

    public static void main(String[] args) {
        Initializerblocks example = new Initializerblocks();

        System.out.println(" in the main method");
    }
}

class InitializerBlockExample{
    static int number= 1;
    public String Name = "DTMF";
    {
        System.out.println(" the song by badbunny : " + Name + " is number : " + number + " in the billboard charts" );
    }
    // you have to initialize the class constructor
    public InitializerBlockExample(){
  
    }

    public static void main(String[] args) {
        InitializerBlockExample example = new InitializerBlockExample();

        System.out.println(" in the main method");
    }
}
