package Enums;

enum Success{
    Discipline,
    Consistency,
    Luck;
        }

public class EnumExample {
    public static void main(String[] args) {


        for( Success success : Success.values()){
            System.out.println(success + " " );
        }
        Success LevelOfSuccess = Success.Discipline;
        System.out.println( LevelOfSuccess);

        // lets use a switch statement to check the lever I am

        switch (LevelOfSuccess){
            case Discipline :
                System.out.println(" this is the first phase of Success");
                break;
            case Consistency:
                System.out.println(" second phase of success where many people fail");
                 break;
            case Luck:
                System.out.println(" With this you are on to success");
                break;
            default:
                System.out.println(" None of the above");
                break;
        }
    
    }
}
