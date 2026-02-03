package Loops;

// break is used when a user wants to jump out of a loop when it reaches a certain condition


public class BreakAndContinue {

    public static void main(String[] args) {
        System.out.println(" with break keyword : ");
        String[] Names = {"Brian", "Timothy", "Daniel", "Stephen"};
        for (String kamauKids : Names){
            if (kamauKids.equals("Daniel")){
                break; // in this case the loop will break when it reaches the name "Daniel "
            };
            System.out.println(kamauKids );
        }

        System.out.println( " with continue keyword : ");
        for (String Kamaukids : Names){
            if (Kamaukids.equals("Daniel")){
                continue; // here ij just skips the unwanted name and contines to the other names and loops them
            };
            System.out.println(Kamaukids);
        }
    }
}
