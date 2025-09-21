class Employee {
    private static String companyName = "Tech Corp";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);

        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Alice", "Manager");
        Employee e2 = new Employee(2, "Bob", "Developer");

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        Employee.displayTotalEmployees();
    }
}

