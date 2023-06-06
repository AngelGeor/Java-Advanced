package DefiningClasses_Ex.CompanyRoaster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        //име на отдела -> списък със служителите
        Map<String, List<Employee>> departmentsList = new HashMap<>();
        for (int i = 0; i < number; i++) {
            String[] parameters = scanner.nextLine().split("\\s+");// ["", "", ""]
            String name = parameters[0];
            double salary = Double.parseDouble(parameters[1]);
            String position = parameters[2];
            String department = parameters[3];
            Employee employee = null;
            //6 параметъра -> [name, salary, position, department, email, age]
            if (parameters.length == 6) {
                String email = parameters[4];
                int age = Integer.parseInt(parameters[5]);
                employee = new Employee(name, salary, position, department, email, age);
            }
            //4 параметъра -> name, salary, position, department
            else if (parameters.length == 4) {
                employee = new Employee(name, salary, position, department);
            }
            else if (parameters.length == 5) {
                String forthParameter = parameters[4]; //email или age
                if (forthParameter.contains("@")) {
                    // 5 параметъра -> name, salary, position,department, email
                    String email = forthParameter;
                    employee = new Employee(name, salary, position, department, email);
                } else {
                    //5 параметъра -> name, salary, position, department, age
                    int age = Integer.parseInt(forthParameter);
                    employee = new Employee(name, salary, position, department, age);
                }
            }

            //обект Employee
            //служител, на който му знам отдела

            //отделът на служителя да го няма
            if (!departmentsList.containsKey(department)) {
                //отдел -> празен списък
                departmentsList.put(department, new ArrayList<>());
                departmentsList.get(department).add(employee);
            }
            //отделът на служителя да го има
            else {
                departmentsList.get(department).add(employee);
            }

        }

        //отдел (средната заплата) -> списък със служителите
        String maxAverageSalaryDepartment = departmentsList.entrySet()
                .stream()
                .max(Comparator.comparingDouble(entry -> getAverageSalary(entry.getValue())))
                .get() //entry (отдел -> списък със служителите): отделът с най-висока заплата
                .getKey();

        System.out.printf("Highest Average Salary: %s%n", maxAverageSalaryDepartment);
        //списък със хората от отдела с най-висока заплата
        List<Employee> employeeList = departmentsList.get(maxAverageSalaryDepartment);
        employeeList.sort(Comparator.comparingDouble(employee -> employee.getSalary())); //ascending by salary
        Collections.reverse(employeeList); //descending

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }


    }

    public static double getAverageSalary(List<Employee> employees) {
        //сума от заплатите / бр. служителите
        double sum = 0;
        for (Employee employee : employees ) {
            sum += employee.getSalary();
        }
        return sum / employees.size();
    }
}
