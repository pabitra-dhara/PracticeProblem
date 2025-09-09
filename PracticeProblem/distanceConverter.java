// 14.Write a program the find the distance in yards and miles for the distance provided by user in feets
// Hint => 1 mile = 1760 yards and 1 yard is 3 feet
// I/P => distanceInFeet
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;

public class distanceConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the distance in feet:");
        double feet=sc.nextDouble();
        double inches=feet*12;
        double cm=inches*2.54;
        double yards=feet/3;
        double miles=yards/1760;
        System.out.println("Your distance in cm is " + cm +" while in feet is " + feet +" and inches is " + inches);
    }
}
