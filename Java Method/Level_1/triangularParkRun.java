// 4.An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
// Hint => 
// Take user input for 3 sides of a triangle 
// The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
// Write a Method to compute the number of rounds user needs to do to complete 5km run

import java.util.Scanner;

public class triangularParkRun {
    public double calculateRounds(double side1,double side2,double side3,double totalDistanceMeters){
        double perimeter=side1+side2+side3;
        return totalDistanceMeters/perimeter;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first side of the triangular: ");
        double side1=sc.nextDouble();
        System.out.print("Enter second side of the triangular: ");
        double side2=sc.nextDouble();
        System.out.print("Enter third side of the triangular: ");
        double side3=sc.nextDouble();
        double totalDistanceMeters=5000;
        triangularParkRun obj=new triangularParkRun();
        double rounds=obj.calculateRounds(side1, side2, side3, totalDistanceMeters);
        System.out.println("The athlete must complete "+rounds+" rounds to finish 5 km run.");
    }
}
