/*2.Problem 2: Online Course Management
Design a Course class with:
Instance Variables: courseName, duration, fee.
Class Variable: instituteName (common for all courses).
Methods:
An instance method displayCourseDetails() to display the course details.
A class method updateInstituteName() to modify the institute name for all courses. */

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName="ABC Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " +courseName);
        System.out.println("Duration: " +duration + " months");
        System.out.println("Fee: Rs." +fee);
        System.out.println("Institute: " +instituteName);
    }

    static void updateInstituteName(String newName){
        instituteName=newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 12000);
        Course c2 = new Course("Web Development", 4, 8000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        updateInstituteName("XYZ Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}


