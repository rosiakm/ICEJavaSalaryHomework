package runner;

import models.Company;

import static helpers.InputHelper.getEmployeeFromUser;
import static helpers.InputHelper.getOptionFromUser;
import static helpers.Menu.printOptions;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        System.out.println("Enter employee details: ");
        for (int i = 0; i < 5; i++) {
            company.addEmployee(getEmployeeFromUser());
        }
        while (true) {
            printOptions();
            switch (getOptionFromUser()) {
                case 1 -> System.out.println("The sum of the employees salaries is: " + company.getSalarySum()+"\r\n");
                case 2 -> company.printInfoAboutAllEmployees();
                case 3 -> company.addEmployee(getEmployeeFromUser());
                case 4 -> System.exit(0);
                default -> System.out.println("Please choose one of the options 1-4!\r\n");
            }
        }
    }
}

