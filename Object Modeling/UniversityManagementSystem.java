/*
Problem 5: University Management System
Description: Model a university system with Student, Professor, and Course classes. Students enroll in courses, and professors teach courses. Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
Goal: Use association and aggregation to create a university system that emphasizes relationships and interactions among students, professors, and courses. */
class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
    void enrollCourse(String courseName) {
        System.out.println(name + " enrolled in " + courseName);
    }
}
class Professor {
    String name;
    Professor(String name) {
        this.name = name;
    }
    void assignCourse(String courseName) {
        System.out.println(name + " is assigned to teach " + courseName);
    }
}
class Course {
    String courseName;
    Course(String courseName) {
        this.courseName = courseName;
    }
    void showCourse() {
        System.out.println("Course: " + courseName);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Arjun");
        Student s2 = new Student("Sita");
        Professor p1 = new Professor("Dr. Pabitra");
        Professor p2 = new Professor("Dr. Rohit");
        Course c1 = new Course("Math");
        Course c2 = new Course("Physics");
        p1.assignCourse(c1.courseName);
        p2.assignCourse(c2.courseName);
        s1.enrollCourse(c1.courseName);
        s1.enrollCourse(c2.courseName);
        s2.enrollCourse(c1.courseName);
        c1.showCourse();
        c2.showCourse();
    }
}
