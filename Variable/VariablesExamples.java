package Variable;

public class VariablesExamples {

    String freedom = "ability to do anything without questions asked";// this can be used anywhere
    static String music = "relaxing"; // can be shared by all the projects in the class

    final int num = 10;

    public void showVariables(){
        int localVariable = 20;  // this can only be accessed on this method only

        System.out.println("what is freedom : "+ freedom);
        System.out.println("whats music :" + music);// this is a static one
        System.out.println("num :" + num);

    }

    public static void main(String[] args) {
        VariablesExamples myVariables_examples = new VariablesExamples();
        myVariables_examples.showVariables();

        System.out.println(VariablesExamples.music); // here we have called the static variable even after changing the method
    }
}
