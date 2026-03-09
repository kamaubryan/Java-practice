package RevisedCollections;

import java.util.ArrayList;
import java.util.List;

/*
 1. used to store ordered collections
 2. duplicate collections are allowed
 3. elements can be accessed with their index
 */
public class lists {

    public static void main(String[] args) {
//        creating the list class
        List<String> TechJobs =  new ArrayList<>(5);

        TechJobs.add("Software Developer");
        TechJobs.add("UI/UX");
        TechJobs.add("Devops Engineer");
        TechJobs.add("Quality Assurance");
        TechJobs.add("TEch Lead");

        System.out.println(TechJobs);
        System.out.println(" the following are the most popular tech jobs : " );

        for (String Techjobs : TechJobs){
            System.out.println("   "+Techjobs);
        }


//        updaating the list

        TechJobs.set(4, "Project Manager");

        System.out.println( " updated lists : " + TechJobs);

//        Searching  the elements

        String TechjobElement3 = TechJobs.get(3);

        System.out.println(TechjobElement3);

//        removing one of the elements

        TechJobs.remove(2);

        System.out.println(" After removal : " + TechJobs);
    }
}
