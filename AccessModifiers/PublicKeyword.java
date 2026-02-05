package AccessModifiers;
// this means the method, class and datamembers are accessible anywhere in the program

class success {
    public static String success(String Hardword, String Consistency , String Luck, String Grace){
        return Hardword+Consistency + Luck + Grace;
    }
}
public class PublicKeyword {
    public static void main(String[] args) {
        System.out.println("these are the essentials of success");
        System.out.println(success.success("  :hardwork","  \n  :consistency","   \n  :Luck", "  \n  :Grace"));
    }
}
