/*Sample Problem 2: Educational Course Hierarchy
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system. */

class Course{
    String courseName;
    int duration;
    public void courseDetails(String n,int d){
        courseName=n;
        duration=d;
    }
}
class OnlineCourse extends Course{
    String platform;
    String isRecorded;
    public void onlineCourseDetails(String p,String r){
        platform=p;
        isRecorded=r;
    }
}
class PaidOnlineCourse extends OnlineCourse{
    int fee;
    int discount;
    public void paidOnlineCourseDetails(int f,int di){
        fee=f;
        discount=di;
    }
    public void show(){
        System.out.println("Course Name : "+courseName);
        System.out.println("Duration: "+duration+" hours");
        System.out.println("Course platform name: "+platform );
        System.out.println("Course is isRecorded: "+isRecorded);
        System.out.println("Course fee: "+fee);
        System.out.println("Course discount: "+discount);
        System.out.println("After discount course fee: "+ (fee*(100-discount))/100);
    }
}
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse obj=new PaidOnlineCourse();
        obj.courseDetails("Java",12);
        obj.onlineCourseDetails("Bridge Labz","Yes");
        obj.paidOnlineCourseDetails(10000, 10);
        obj.show();
    }
}
