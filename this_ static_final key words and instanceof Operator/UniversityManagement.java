class Student {
    private static String universityName = "Chitkara University";
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student stu1 = new Student(101, "Pabitra", "A");
        Student stu2 = new Student(102, "Ram", "B");

        stu1.displayStudentDetails();
        stu2.displayStudentDetails();
        Student.displayUniversityName();
    }
}

