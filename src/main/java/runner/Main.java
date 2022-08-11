package runner;

import helpers.Utils;
import models.Company;
import models.Employee;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utils utils = new Utils();
        List<Employee> employees = new ArrayList<>();
        Company company = new Company(employees);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee details: ");
        for (int i = 0; i < 5; i++) {
            utils.addNewEmployeeToList(employees);
        }

        while (true) {
            utils.printOptions();
            int option = 0;
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("This is not an integer! Please provide a correct number!");
                scanner.nextLine();
            }

            switch (option) {
                case 1 -> utils.printSumOfSalaries(employees);

                case 2 -> {
                    for (Employee myEmployee : company.getEmployees()) {
                        System.out.println(myEmployee.toString());
                    }
                    scanner.nextLine();
                    System.out.println("");
                }
                case 3 -> utils.addNewEmployeeToList(employees);

                case 4 -> System.exit(0);
                default -> {
                    System.out.println("Please choose one of the options 1-4!");
                    System.out.println("");
                }
            }
        }
    }
}

