import java.util.Scanner;
import java.util.Scanner;

class credentials{
    private int pin;
    private String Password;
// creating getters and setters
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getPassword( ) {
        return Password;
    }

    public void setPassword(String password) {
       this.Password = password;
    }
}
public class practiceMEthods {
    public static void main(String[] args) {
        credentials mycredentials = new credentials();
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your pin");
        int pin = scanner.nextInt();
        Scanner enterPassword = new Scanner(System.in);
        System.out.println("enter your password");
        String Password = enterPassword.nextLine();
        mycredentials.setPassword(Password);
        mycredentials.setPin(pin);
        System.out.println("your pin is "+" : "+ mycredentials.getPin() + " and your password is "+ " : "+ mycredentials.getPassword());
    }
}
