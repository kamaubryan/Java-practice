package Interface;
/*these are interfaces with one method
*
* */
// to notify the compiler that this is a functional interface we have to use an annotation
@FunctionalInterface// indicates that the interface below should only have one method
interface  great{
    // no need to write the abstract keyword in this methods
    void Great();

}

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // here we have used anonymous class
      great mygreat = new great() {
          @Override
          public void Great() {
              System.out.println("having peace of mind and getting blessed by God");
          }
      };
      mygreat.Great();
    }
}
