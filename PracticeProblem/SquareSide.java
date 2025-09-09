// 13.Write a program to find the side of the square whose parameter you read from user 
// Hint => Perimeter of Square is 4 times side
// I/P => perimeter
// O/P => The length of the side is ___ whose perimeter is ____

import java.util.Scanner;

public class SquareSide {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeter=sc.nextDouble();
        double side=perimeter/4;
        System.out.print("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}