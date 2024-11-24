package Interface;
/*this is a shorter way of writing code
* its like writing arrow functions
* they are mostly used with functional interfaces
* */
// we have to use this annotation to indicate that its a functional interface

@FunctionalInterface
 interface God{
    // one method as expected
    void DescribeU();

}
// we can try an interface with a method which has parameters
@FunctionalInterface
interface Grace{// we want to check how lambda expressions work with methods that have parameters
    void Graced(String Love, String Kindness);
}
// lets try with methods with return
@FunctionalInterface
interface Blessings{
    String Blessing (String goodHealth, String peaceOfMind);
}
public class LambdaExpressions {
    public static void main(String[] args) {
        // define the interface  above
        God myGod = new God() {
            @Override
            public void DescribeU() {
                System.out.println("He's an awesome God");
            }
        };
        myGod.DescribeU();
        // there is a shorter way of writing that using lambda expressions
        God AwesomeGod = ()->{//  here we have eliminated the extra where we have used the lambda expression
            System.out.println("He is a caring God");
        };
        AwesomeGod.DescribeU();
        // we can also reduce the code even more
        AwesomeGod = ()-> System.out.println("Loving God");// here we have eliminated the brackets
        AwesomeGod.DescribeU();

        // lets try a method with parameters
        Grace GodsGrace = (love, kindness)-> System.out.println("its good to be " + love + " and " +kindness + "in order to recieve Gods grace");
 GodsGrace.Graced("loving ", "kind");

        // lets try with a method with a return type
        Blessings MyBlessing = (goodHealth, peaceOfMind) -> goodHealth +" and some "+ peaceOfMind;
        String fullyBlessed = MyBlessing.Blessing("Healthy","Peace of mind");
        System.out.println("this is a very great combination if you are blessed " + fullyBlessed);

    }

}
