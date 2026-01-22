package JavaOperators;

public class InstanceOf {
    public static void main(String[] args) {

        // instanceof is used for typechecking
        // returns in a bolean form either true or false
        String str = "HI";
        System.out.println(str instanceof String);

        Object obj = new String("yoow");
        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof String);
    }
}
