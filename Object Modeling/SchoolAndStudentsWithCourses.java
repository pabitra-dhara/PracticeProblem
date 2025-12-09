/*Problem 1: School and Students with Courses (Association and Aggregation)
Description: Model a School with multiple Student objects, where each student can enroll in multiple courses, and each course can have multiple students.
Tasks:
Define School, Student, and Course classes.
Model an association between Student and Course to show that students can enroll in multiple courses.
Model an aggregation relationship between School and Student.
Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
Goal: Practice association by modeling many-to-many relationships between students and courses. */
class School {
    String name;
    School(String name) {
        this.name = name;
    }
    void showSchool() {
        System.out.println("School Name: " + name);
    }
}

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
    void showStudent() {
        System.out.println("Student Name: " + name);
    }
}

class Course {
    String courseName;
    Course(String courseName) {
        this.courseName = courseName;
    }
    void showCourse() {
        System.out.println("Course Name: " + courseName);
    }
}
public class SchoolAndStudentsWithCourses {
    public static void main(String[] args) {

        School school = new School("Chitkara University");
        Student s1 = new Student("Pabitra");
        Course c1 = new Course("Math");

        school.showSchool();
        s1.showStudent();
        c1.showCourse();
    }
}

