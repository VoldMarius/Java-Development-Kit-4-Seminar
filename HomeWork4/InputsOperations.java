package HomeWork4;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class InputsOperations  {
    Scanner input;
    public InputsOperations() {
        input = new Scanner(System.in, StandardCharsets.UTF_8);
    }

    public int inputID() {
        System.out.print("Required Employee ID: ");
        return input.nextInt();
    }

    public String inputContactNumber() {
        System.out.print("An employee's phone number is required: ");
        return input.next();
    }

    public String inputName() {
        System.out.print("Employee name required:: ");
        return input.next();
    }

    public int inputExperience() {
        System.out.print("Employee experience required: ");
        return input.nextInt();
    }

    public int inputAction() {
        System.out.println( """
                1 - Add an employee
                2 - List employees based on length of service
                3 - Display the phone number of the employee by name
                4 - Find an employee by personnel number
                5 - Add a phone number
                0 - Exit the program 
                """);
        System.out.print("Enter action: ");
        return input.nextInt();
    }
}
