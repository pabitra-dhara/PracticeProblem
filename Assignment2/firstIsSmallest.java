// 2.Write a program to check if the first is the smallest of the 3 numbers.
// I/P => number1, number2, number3
// O/P => Is the first number the smallest? ____

import java.util.Scanner;

public class firstIsSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1=sc.nextInt();
        System.out.print("Enter second number: ");
        int number2=sc.nextInt();
        System.out.print("Enter third number: ");
        int number3=sc.nextInt();
        boolean isFirstSmallest=(number1<number2) && (number1<number3);
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
    }
}
