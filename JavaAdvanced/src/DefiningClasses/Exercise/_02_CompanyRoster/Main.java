package DefiningClasses.Exercise._02_CompanyRoster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int employeeCount = Integer.parseInt(scanner.nextLine());

        Company company = new Company();

        for (int i = 0; i < employeeCount; i++) {

            String[] employeeInfo = scanner.nextLine().split(" ");
            String name = employeeInfo[0];
            double salary = Double.parseDouble(employeeInfo[1]);
            String position = employeeInfo[2];
            String employeeDepartment = employeeInfo[3];
            Employee employee = new Employee(name, salary, position, employeeDepartment);

            if (!company.isExistingDepartment(employeeDepartment)) {
                company.addDepartment(new Department(employeeDepartment));
            }

            if (employeeInfo.length == 5) {
                String data = employeeInfo[4];
                if (isEmail(data)) {
                    employee.setEmail(data);
                } else {
                    employee.setAge(Integer.parseInt(data));
                }
            } else if (employeeInfo.length == 6) {
                String email = employeeInfo[4];
                int age = Integer.parseInt(employeeInfo[5]);
                employee.setEmail(email);
                employee.setAge(age);
            }

            company.addEmployee(employee);

        }

        company.printDepartmentWithHighestAverageSalary();
    }


    public static boolean isEmail(String data) {
        return data.contains("@");
    }
}
