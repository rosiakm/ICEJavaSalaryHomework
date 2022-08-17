package models;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printInfoAboutAllEmployees() {
        for (Employee myEmployee : employees) {
            System.out.println(myEmployee.toString()+"\r\n");
        }
    }

    public int getSalarySum() {
        int salarySum = 0;
        for (Employee myEmployee : employees) {
            salarySum += myEmployee.getSalary();
        }
        return salarySum;
    }
}
