package helpers;

import models.Company;
import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    private Utils utils;
    private Company company;
    private Scanner scanner;
    private List<Employee> employees;

    public void printOptions(){
        System.out.println("Choose one option!");
        System.out.println("1 – Print sum of all employees salary");
        System.out.println("2 – Display all employees data");
        System.out.println("3 – Add new employee");
        System.out.println("4 – End program");
    }
    public void printSumOfSalaries(){
        employees = new ArrayList<>();
        company = new Company(employees);
        int salarySum = 0;
        for (Employee myEmployee: company.getEmployees()) {
            salarySum += myEmployee.getSalary();
        }
        System.out.println("The sum of the employees salaries is: " + salarySum);
    }
    public void addNewEmployeeToList(){
        employees = new ArrayList<>();
        scanner = new Scanner(System.in);
        System.out.println("Enter the first name of an employee: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the last name of an employee: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter the salary of an employee: ");
        int salary = scanner.nextInt();
        scanner.nextLine();
        employees.add(new Employee(firstName, lastName, salary));
    }
}
