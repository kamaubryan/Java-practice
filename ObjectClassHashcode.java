import java.util.Objects;

/*
*
* */
class Programing{
    String language;
    int PayGrade;
    // we can define our toString method here
    public String toString(){
        return  language + " : " + PayGrade; // we have no redefined our method toString();
    }

    // the comp can create the the  hashcode and tostring method for you

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programing that = (Programing) o;
        return PayGrade == that.PayGrade && Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, PayGrade);
    }
}

public class ObjectClassHashcode {
    public static void main(String[] args) {
        // lets create an object of the class above
        Programing myProgramming = new Programing();
        myProgramming.language="JavaScript";
        myProgramming.PayGrade=459990;
        // when we try to print the object above it will give us some hash code
        System.out.println(myProgramming); // this is the weird output "Programing@4a574795" by default the myprogramming calls the .toString();method
        System.out.println(myProgramming.toString());// this will bring the same output like the first output
    }
}
