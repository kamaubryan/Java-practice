package ObjectOrientedProgramming.RevisedInheritance;


class laptops {
    protected String Brand = "MAC";
    public void Specs(){
        System.out.println(" this is an M4 MAX");
    }
}

class MAC extends laptops {
    public String modelname = " M4 MAX";
}

public class Singleinheritance {

    public static void main(String[] args) {
        MAC myMac = new MAC();
        myMac.Specs();

        System.out.println("this laptop is a "+ myMac.Brand + " and its model name is : " + myMac.modelname);
    }
}
