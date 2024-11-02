package Variable;
/*
*
* */
class car{
    String name;
    String EngineType ;
   static int ModelYear;
    // we can use a make a certain variable to be constant in each object
    static String Models; // this will be constant in each object to a point where when one is changed the others will change to that value which is changed

    public  void getAllCarProperties(){

        System.out.println(name +" : "+EngineType+" : "+ ModelYear + " : "+ Models);
    }

}
public class StaticVariables {
    public static void main(String[] args) {
        car mycar = new car();
        mycar.EngineType = "v8";
        mycar.name  = "Mercedes";
        mycar.ModelYear = 2025;

        // lets create other objects
        car mycar2 = new car();
        mycar2.EngineType = "v12";
        mycar2.name  = "RollsRoyce";
        mycar2.ModelYear = 2026;

        car mycar3 = new car();
        mycar3.EngineType = "v4";
        mycar3.name  = "Toyota";
        mycar3.ModelYear = 2027;// since this is the last change of the variable instance then all the properties will be the same
        car.Models = "MuscleCar";
   mycar.getAllCarProperties();
   mycar2.getAllCarProperties();
   mycar3.getAllCarProperties();// here we have printed all the properties in each object
    }
}
