/*1.Problem 1: University Management System
Create a Student class with:
rollNumber (public).
name (protected).
CGPA (private).
Write methods to:
Access and modify CGPA using public methods.
Create a subclass PostgraduateStudent to demonstrate the use of protected members. */
// Student.java
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA=CGPA;
    }

    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {

    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Specialization: " + specialization);
    }

    public static void main(String[] args) {
        Student s1 = new Student(7068, "Pabitra", 8.5);
        s1.displayStudent();
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());
        System.out.println();
        PostgraduateStudent pg1 = new PostgraduateStudent(7048, "Ram", 8.7, "Computer Science");
        pg1.displayPGStudent();
    }
}
