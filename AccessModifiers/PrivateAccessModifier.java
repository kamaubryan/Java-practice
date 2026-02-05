package AccessModifiers;

import java.util.Scanner;

public class PrivateAccessModifier {

    private String Name;
    private String Gender;
    private int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PrivateAccessModifier[] PersonDetails = new PrivateAccessModifier[3]; // we  are creating an array where we will store the details

        for (int i = 0; i < PersonDetails.length; i++) {
            PersonDetails[i] = new PrivateAccessModifier(); // Fixed: was [0], now [i]

            System.out.println("\nEnter details for person " + (i + 1));

            // Name validation - avoiding repetition
            while (true) {
                System.out.print("Name: ");
                String nameInputted = scan.nextLine();

                boolean nameExists = false;

                // Check if name already exists in previous entries
                for (int j = 0; j < i; j++) { // Fixed: was j > i, now j < i
                    if (PersonDetails[j].getName().equalsIgnoreCase(nameInputted)) {
                        nameExists = true;
                        break;
                    }
                }

                if (nameExists) {
                    System.out.println("The name already exists. Please enter another name.");
                } else {
                    PersonDetails[i].setName(nameInputted); // Fixed: was [0], now [i]
                    break;
                }
            }

            // Gender validation
            while (true) {
                System.out.print("Enter gender (male/female): ");
                String genderInput = scan.nextLine().toLowerCase();

                if (genderInput.equals("male") || genderInput.equals("female")) {
                    PersonDetails[i].setGender(genderInput);
                    break;
                } else {
                    System.out.println("Invalid gender. Please enter either 'male' or 'female'.");
                }
            }

            // Age validation
            while (true) {
                System.out.print("Enter age: ");
                try {
                    int ageInput = Integer.parseInt(scan.nextLine());

                    if (ageInput > 0 && ageInput < 150) {
                        PersonDetails[i].setAge(ageInput);
                        break;
                    } else {
                        System.out.println("Invalid age. Please enter a valid age (1-149).");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
        }

        // Display all person details
        System.out.println("\n=== All Person Details ===");
        for (int i = 0; i < PersonDetails.length; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Name: " + PersonDetails[i].getName());
            System.out.println("Gender: " + PersonDetails[i].getGender());
            System.out.println("Age: " + PersonDetails[i].getAge());
        }

        scan.close();
    }
}
