// 2.Create a program to find the maximum number of handshakes among N number of students.
// Hint => 
// Get integer input for number of students
// Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
// Write a method to use the combination formulae to calculate the number of handshakes

import java.util.Scanner;

public class handshakeCalculator {
    public int calculator(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Students:");
        int n=sc.nextInt();
        handshakeCalculator obj=new handshakeCalculator();
        System.out.print("Maximum number of handshakes is possible:"+ obj.calculator(n));
    }
}
