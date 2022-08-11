package runner;

import helpers.Utils;
import models.Company;
import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Employee> employees;
    private static Utils utils;
    private static Company company;

    public static void main(String[] args) {
        utils = new Utils();
        employees = new ArrayList<>();
        company = new Company(employees);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee details: ");
        for (int i = 0; i < 5; i++) {
            utils.addNewEmployeeToList();
        }

        while (true) {
            utils.printOptions();
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    utils.printSumOfSalaries();
                    //scanner.nextLine();
                    break;
                case 2:
                    for (Employee myEmployee : company.getEmployees()) {
                        myEmployee.getAllData();
                    }
                    scanner.nextLine();
                    break;
                case 3:
                    utils.addNewEmployeeToList();
                    //scanner.nextLine();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please choose one of the options 1-4!");
                    scanner.nextLine();
                    break;
            }
        }
    }
}

