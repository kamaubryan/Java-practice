package Abstraction.Abstractionclasses;
// abstraction is the process of hiding  internaln implementation details and showing essential functionality

// abstract classes // they are partially abstract

abstract class Tech{
    public String Developer;
    public String Designer;
    public String ProjectManager;

    abstract String Categories (String Developer, String Designer, String ProjectManager);

  public Tech(){
      System.out.println(" constructor getting called");
   }
}


class SoftwareDevelopment extends Tech{



    @Override
    String Categories(String Developer, String Designer, String ProjectManager) {
    this.Designer = Designer;
    this.Developer = Developer;
    this.ProjectManager = ProjectManager;

    return " this are some of the categories of tech " + Developer +", "+ Designer +", "+ ProjectManager;
    }
}
public class AbstractClasses {

    public static void main(String[] args) {
        SoftwareDevelopment softwareDevelopment = new SoftwareDevelopment();


        System.out.println( softwareDevelopment.Categories("Software developer", "Product designer", "Project manager"));
    }
}
