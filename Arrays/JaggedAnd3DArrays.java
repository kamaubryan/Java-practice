package Arrays;

/*this is where the multidimensional array can have different values and length in each array
* the inside array can have different size
* */
public class JaggedAnd3DArrays {
    public static void main(String[] args) {

        // lets create a multidimensional array which is a jagged array
        String names [][]= new String[3][];// here we have specified the number of arrays we want but inside the arrays we have not specified the particular size of each array
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
    }
}

