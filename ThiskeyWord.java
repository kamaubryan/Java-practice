/*
* using this keyword
*
* */
class shoes{
    private int size;
    private String Color;

    public int getSize() {// here is the getter function
        return size;
    }

    public void setSize(int s) {// here we are setting the values using this keyword
        this.size = s;// this keyword represents the current object its simpler than creating another object twice
    }
// the same applies to this
    public String getColor() {
        return Color;
    }

    public void setColor(String c) {
        this.Color = c;
    }
}
public class ThiskeyWord {
    public static void main(String[] args) {
        shoes myshoes = new shoes();
        myshoes.setColor("grey");
        myshoes.setSize(34);
        System.out.println("this is my ideal shoe characteristics " + myshoes.getColor() + " : " + myshoes.getSize());
    }
}
