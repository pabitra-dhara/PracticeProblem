/*1. Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference. */

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getEmployeeId(){
         return employeeId; 
    }
    public String getName(){
         return name; 
    }
    public double getBaseSalary(){
         return baseSalary; 
    }
    public void assignDepartment(String dept) {
        this.department = dept;
    }
    public String getDepartmentDetails() {
        return department;
    }
    public abstract double calculateSalary();
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Salary: " + calculateSalary());
    }
}
class FullTimeEmployee extends Employee{
    private double fixedSalary;

    public FullTimeEmployee(int id, String name, double baseSalary, double fixedSalary){
        super(id, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
    }
}
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return getBaseSalary() + hoursWorked * hourlyRate;
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Pabitra", 10000, 15000);
        e1.assignDepartment("HR");

        Employee e2 = new PartTimeEmployee(2, "Ram", 2000, 40, 200);
        e2.assignDepartment("IT");
        e1.displayDetails();
        e2.displayDetails();
    }
}
