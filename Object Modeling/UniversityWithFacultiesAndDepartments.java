/*Problem 2: University with Faculties and Departments (Composition and Aggregation)
Description: Create a University with multiple Faculty members and Department objects. Model it so that the University and its Departments are in a composition relationship (deleting a university deletes all departments), and the Faculty members are in an aggregation relationship (faculty can exist outside of any specific department).
Tasks:
Define a University class with Department and Faculty classes.
Demonstrate how deleting a University also deletes its Departments.
Show that Faculty members can exist independently of a Department.
Goal: Understand the differences between composition and aggregation in modeling complex hierarchical relationships. */

class University {
    String name;
    University(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("University: " + name);
    }
}

class Department {
    String name;
    Department(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("Department: " + name);
    }
}

class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("Faculty: " + name);
    }
}

public class UniversityWithFacultiesAndDepartments {
    public static void main(String[] args) {
        University u = new University("Chitkara University");
        Department d = new Department("Computer Application");
        Faculty f = new Faculty("Mohita Khurana");
        u.show();
        d.show();
        f.show();
    }
}
