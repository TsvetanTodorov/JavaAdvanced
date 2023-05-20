package DefiningClasses.Exercise._02_CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Company {


    private List<Department> departmentList = new ArrayList<>();

    public void addDepartment(Department department) {
        departmentList.add(department);
    }

    public boolean isExistingDepartment(String name) {
        return departmentList.stream().anyMatch(e -> e.getName().equals(name));
    }


    public void addEmployee(Employee employee) {
        Department department = departmentList
                .stream()
                .filter(currentDepartment -> currentDepartment.getName().equals(employee.getDepartment()))
                .collect(Collectors.toList()).get(0);

        department.addEmployee(employee);
    }


    public void printDepartmentWithHighestAverageSalary() {
        Department departmentWithHighestAverageSalary = getDepartmentWithHighestAverageSalary();
        departmentWithHighestAverageSalary.printDepartmentWithHighestAverageSalary();
    }

    private Department getDepartmentWithHighestAverageSalary() {
        return departmentList.stream().max(Comparator.comparing(Department::calculateSalaries)).get();
    }
}
