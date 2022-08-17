package helpers;

import models.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelper {
    public static Employee getEmployeeFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name of an employee: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the last name of an employee: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter the salary of an employee: ");
        int salary = scanner.nextInt();
        scanner.nextLine();
        return new Employee(firstName, lastName, salary);
    }

    public static int getOptionFromUser() {
        while (true) {
            try {
                return new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("This is not an integer! Please provide a correct number!");
            }
        }
    }
}
