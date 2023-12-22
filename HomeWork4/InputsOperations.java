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

}
