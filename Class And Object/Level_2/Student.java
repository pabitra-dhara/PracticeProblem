/*1.Program to Simulate Student Report
Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
To calculate the grade based on the marks.
To display the student's details and grade.
Explanation: The Student class organizes all relevant details about a student as attributes. Methods are used to calculate the grade and provide a way to display all information. */
class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }

    String calculateGrade() {
        if(marks>=90) {
            return "A";
        }else if(marks>=75){
            return "B";
        }else if(marks>=60){
            return "C";
        }else if(marks>=40){
            return "D";
        }else{
            return "F";
        }
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1=new Student("Pabitra", 101, 92.5);
        Student s2=new Student("Anita", 102, 67.0);
        Student s3=new Student("Rahul", 103, 38.5);

        System.out.println("Student Reports:\n");
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
