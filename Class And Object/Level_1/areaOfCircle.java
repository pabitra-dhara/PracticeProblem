/*2.Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle. */

import java.util.Scanner;
class Circle{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double areaCal(){
        return 3.14*radius*radius;
    }
    double circumferenceCal(){
        return 2*3.14*radius;
    }
    void displayCal(){
        System.out.println("Area: "+areaCal());
        System.out.print("Circumference: "+circumferenceCal());
    }
}
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius=sc.nextDouble();
        Circle obj=new Circle(radius);
        obj.displayCal();
    }
}
