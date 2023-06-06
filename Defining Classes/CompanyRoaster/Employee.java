package DefiningClasses_Ex.CompanyRoaster;

public class Employee {
    //характеристики: name, salary, position, department, email, and age
    //mandatory
    private String name;
    private double salary;
    private String position;
    private String department;
    //optional
    private String email;
    private int age;

    //конструктор
    //4 параметъра -> name, salary, position, department
    //нямаме възраст. имейл
    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = -1;
        this.email = "n/a";
    }
    //6 параметъра -> [name, salary, position, department, email, age]
    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    // 5 параметъра -> name, salary, position,department, email
    //нямам възраст
    public Employee (String name, double salary, String position, String department, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = -1;
    }

    //5 параметъра -> name, salary, position, department, age
    //нямаме имейл
    public Employee(String name, double salary, String position, String department,int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
        this.email = "n/a";
    }

    //getter на полето salary
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name + " ").append(String.format("%.2f",salary) + " ").append(email + " ").append(age);
        return builder.toString();
    }
}