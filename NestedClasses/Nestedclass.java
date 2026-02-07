package NestedClasses;
//this is a class inside a class
class Farming  {
     static void typeofFarming(){
         System.out.println(" Crop Farming");
     }

     static class preferredfarmingType{
         static void profitableFarming(){
             System.out.println( " Animal farming");
         }

     }
}

class Cars {
    static int OuterSpeed = 300;
    private static String model ;
     String colour ;

     // this is the nested class
     class MERCEDES {
         void preferedMercedesCar (){
             // the static variable is easier to access
             System.out.println("outer speed : "+ OuterSpeed);

             // also the private is easier to access it
             model = "Mercedes E63s";
             System.out.println("outer class model : "+ model);

             // for the non static variable we have to create an object of the outer class
             Cars preferedCar = new Cars();
             preferedCar.colour = "ALPINE GREY";
             System.out.println( " outer colour : " + preferedCar.colour);
         }
     }
}


// private innerclass and how to access them
class  GreatestRappers{
    static String OuterRapper = "Dave";
    // a private inner class
    private class ExtraGreatestRapper{
        private String InnerRapper = " NF ";
    }
   void showInnerRapper() {
        ExtraGreatestRapper superRapper= new ExtraGreatestRapper();
       System.out.println(" this is the inner rapper : " +superRapper.InnerRapper);
    }
    void shoutOuterRapper(){
        System.out.println( "this is the outer rapper : " +OuterRapper);
    }

}

public class Nestedclass {

    public static void main(String[] args) {
        // when wanting to access the nested classes you have to create an object of the nested class

      Cars myCar = new Cars();
      Cars.MERCEDES favMercedes = myCar.new MERCEDES();

      favMercedes.preferedMercedesCar();


// here simce we are using static methods we dont have to create an object out of it
      Farming.typeofFarming();
//      since we are using static class no need of create an object of the nested class
      Farming.preferredfarmingType.profitableFarming();

      // declaring the RApper class

        GreatestRappers MyKindofRappers = new GreatestRappers();
        MyKindofRappers.shoutOuterRapper();
        MyKindofRappers.showInnerRapper();
    }
}
