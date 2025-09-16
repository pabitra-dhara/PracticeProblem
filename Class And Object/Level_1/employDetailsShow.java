/*1.Program to Display Employee Details
Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details. */

import java.util.Scanner;

class Employee{
    String name;
    int id;
    int salary;
    Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displayEmployeeDetails(){
        System.out.println("Employee name is: "+name);
        System.out.println("Employee Id is: "+id);
        System.out.println("Employee salary is: "+salary);
    }
}
public class employDetailsShow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee name: ");
        String name=sc.nextLine();
        System.out.print("Enter Employee Id: ");
        int id=sc.nextInt();
        System.out.print("Enter Employee salary: ");
        int salary=sc.nextInt();
        Employee obj=new Employee(name, id, salary);
        obj.displayEmployeeDetails();
    }
}