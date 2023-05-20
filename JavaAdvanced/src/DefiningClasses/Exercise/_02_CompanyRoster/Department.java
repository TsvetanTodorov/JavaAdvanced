package DefiningClasses.Exercise._02_CompanyRoster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Department {

    private String name;
    private List<Employee> employeeList = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public String getName() {
        return name;
    }

    public double calculateSalaries() {
        return employeeList.stream().mapToDouble(Employee::getSalary).average().stream().sum();
    }

    public void printDepartmentWithHighestAverageSalary() {
        System.out.printf("Highest Average Salary: %s\n", name);
        sortEmployeesBySalaryInDescendingOrder();
        employeeList.forEach(Employee::printInfo);
    }

    private void sortEmployeesBySalaryInDescendingOrder() {
        Collections.sort(employeeList, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));
    }


}
