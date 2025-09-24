/*Sample Problem 2: School System with Different Roles
Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics. */
class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Teacher extends Person{
    String subject;

    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject=subject;
    }

    void displayRole() {
        displayInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}
class Student extends Person{
    String grade;

    Student(String name, int age, String grade){
        super(name, age);
        this.grade=grade;
    }

    void displayRole(){
        displayInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person{
    String department;

    Staff(String name, int age, String department){
        super(name, age);
        this.department=department;
    }
    void displayRole() {
        displayInfo();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Pabitra", 22, "Mathematics");
        Student s1 = new Student("Rahul", 15, "10th Grade");
        Staff st1 = new Staff("Pijush", 35, "Administration");
        t1.displayRole();
        s1.displayRole();
        st1.displayRole();
    }
}
