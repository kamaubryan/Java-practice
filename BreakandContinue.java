// this is used to specify where to break and also where to continue in a loop


public class BreakandContinue {
    public static void main(String[] args) {
        // break
        for (int i=0;i<=10;i++){
            if (i==4){
                break;//when i is equal to 4 the loop will break
            }
            System.out.println(i);
        }

        // continue
        for (int i=0;i<=10;i++){
            if (i==5){
                continue;// this will skip 5 and go to the next number available
            }
            System.out.println(i);
        }
    }
}
