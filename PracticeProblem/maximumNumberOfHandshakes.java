// 16.Create a program to find the maximum number of handshakes among N number of students.
// Hint => 
// Get integer input for numberOfStudents variable.
// Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
// Display the number of possible handshakes.

import java.util.Scanner;

public class maximumNumberOfHandshakes {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents=sc.nextInt();
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1))/2;
        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);
    }
}

