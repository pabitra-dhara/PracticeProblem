/*Problem 4: Employee Records
Develop an Employee class with:
employeeID (public).
department (protected).
salary (private).
Write methods to:
Modify salary using a public method.
Create a subclass Manager to access employeeID and department. */
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID=employeeID;
        this.department=department;
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary=salary;
    }
}

class Manager extends Employee {

    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void display() {
        System.out.println("Employee ID: " +employeeID);
        System.out.println("Department: " +department);
        System.out.println("Salary: Rs." +getSalary());
    }

    public static void main(String[] args) {
        Employee e=new Employee(101, "IT", 50000);
        e.setSalary(55000);
        System.out.println("Updated Salary: Rs." + e.getSalary());
        System.out.println();
        Manager m=new Manager(201, "HR", 70000);
        m.display();
    }
}

