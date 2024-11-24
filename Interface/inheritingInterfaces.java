package Interface;
/*while inheriting an interface we usually use the extend keyword like we use in classes
*
* */
interface greeting{
    // create a method
    void greet();
}
// we can inherit the interface above
interface official extends greeting{
    // now we have inherited all the properties of interface greeting
    // we usually dont have to redefine the method
}
public class inheritingInterfaces {
    public static void main(String[] args) {
        // we can create methods of the interfaces above
        greeting mygreeting = new greeting() {
            // we have used invisible classes to define the methods
            @Override
            public void greet() {
                System.out.println(" sasa");
            }
        };
        // we can also create a method of interface official
        official myofficial = new official() {
            // we have already inherited the properties of interface greeting eventhough we didnt write it above
            @Override
            public void greet() {
                System.out.println("hello there");
            }
        };
        // call them
        mygreeting.greet();
        myofficial.greet();
    }
}
