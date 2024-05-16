package learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Read input form the reader using scanner
        try (Scanner userInput = new Scanner(System.in)) {

            String personName;
            int personId;
            double personSalary;
            Boolean isFTE;
            String personEMPStatus;

            System.out.print("Please enter your name: ");
            personName = userInput.nextLine();
            System.out.print("Please enter ID: ");
            personId = userInput.nextInt();
            System.out.print("Please enter Salary: ");
            personSalary = userInput.nextDouble();
            System.out.print("Joining as FTE?: ");
            isFTE = userInput.nextBoolean();
            personEMPStatus = (isFTE == true) ? "Y" : "N";
            System.out.println("Name: " + personName);
            System.out.println("ID: " + personId);
            System.out.println("Salary: " + personSalary);
            System.out.println("FTE: " + personEMPStatus);
            userInput.close(); // Closing the Scanner input stream.

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
