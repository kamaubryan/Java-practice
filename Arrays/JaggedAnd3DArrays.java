package Arrays;

import java.util.Scanner;

/*this is where the multidimensional array can have different values and length in each array
* the inside array can have different size
* */
public class JaggedAnd3DArrays {
    public static void main(String[] args) {

        // lets create a multidimensional array which is a jagged array
        String names [][]= new String[3][]; // here we have specified the number of arrays we want but inside the arrays we have not specified the particular size of each array
        // here we are specifying the size of the  inner arrays
        names[0]= new String[3];// this is the first array which has three values
        names[1] =new String[4];//this has four values
        names[2]=new String[2];// this has two values
        // lets try storing the values manually
        // this is the first array
        names[0][0]="brian";
        names [0][1]="Kiriro";
        names[0][2]="kamau";
// second array
        names[1][0]="Steven";
        names[1][1]="njihia";
        names[1][2]="kamau";
        names[1][3]="Timothy";
        // third array
        names[2][0]="mwangi";
        names[2][1]="kamau";
        // we can now store the values inside the array
        for (int i=0; i<names.length;i++){// where we are iterating over the first outer arrays
            for (int z =0; z<names[i].length;z++){// here we are iterating over the inside arrays where they are of different lengths
                System.out.print( names[i][z]+" ");
            }
            System.out.println();
        }
        userinputjaggedarray.main(args);
        revisedJaggedArray.main(args);
    }
}



class revisedJaggedArray {

    public static void main(String[] args) {
        // trying to check kiriro kids

        int[][] kiriroKids = new int[12][];

        // each kid have different no of kids
        kiriroKids[0] =new int[4];
        kiriroKids[1]= new int[5];
        kiriroKids[2]=new int[1];
        kiriroKids[3]=new int[2];
        kiriroKids[4]= new int[6];
        kiriroKids[5]=new int[3];
        kiriroKids[6]=new int[2];
        kiriroKids[7]=new int[3];
        kiriroKids[8]=new int[3];
        kiriroKids[9]=new int[3];
        kiriroKids[10]=new int[4];
        kiriroKids[11]=new int[4];

        for (int i =0; i<kiriroKids.length; i++){
            for (int j =0; j<kiriroKids[i].length;j++){
                System.out.print(" " + kiriroKids[i][j]+ " ");
            }
            System.out.println();
        }


    }
}

class userinputjaggedarray{

    public static void main(String[] args) {
        // trying to have a 3 dimensional array

        Scanner scan = new Scanner(System.in);

        // asking how many kids does kiriro have
        System.out.println(" how many kids does kiriro have? ");
        int kirirokidscount = scan.nextInt();
        scan.nextInt();

        // 3d jagged array
        String[][][] kiriroFamily = new String[kirirokidscount][][];

        for (int i=0; i<kirirokidscount; i++){
            System.out.println("\n enter the name of kirirokid " + (1+i) + " : ");
            String kidName = scan.nextLine();

            System.out.println(" how many kids does " + kidName + " have ?");
            int grandkidscount = scan.nextInt();
            scan.nextLine();

            kiriroFamily[i] = new String[grandkidscount][];

            for (int j =0; j<grandkidscount; j++){
                System.out.println(" enter the name of child "+ (j+1) +" of " + kidName +(" : "));
                String GrandkidName = scan.nextLine();

                System.out.println("How many kids does " + GrandkidName + " have?");
                int greatGrandKidsCount = scan.nextInt();
                scan.nextLine();

                kiriroFamily[i][j] = new String[greatGrandKidsCount];

                for (int k =0; k<greatGrandKidsCount; k++){
                    System.out.println(" enter name of child " + ( k+1 ) + " of " + GrandkidName + " : "  );
                    kiriroFamily[i][j][k]=scan.nextLine();
                }

            }
        }

        // printing the family tree
        System.out.println("\n kiriro family tree ");

        for (int i = 0; i<kiriroFamily.length; i++){
            System.out.println( " kiriros kid "+ (i+1));

            for (int j =0; j<kiriroFamily[i].length; j++){
                System.out.println( " child " + (j+1));

                if (kiriroFamily[i][j].length==0){
                    System.out.println("no child");
                } else {
                    for (String name : kiriroFamily[i][j]){
                        System.out.println( "  - "+ name);
                    }
                }
            }
        }
        scan.close();
    }

}