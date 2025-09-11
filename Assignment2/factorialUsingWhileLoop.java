// 14.Write a Program to find the factorial of an integer entered by the user.
// Hint => 
// For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
// Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
// Using a while loop, compute the factorial.
// Print the factorial at the end.

import java.util.Scanner;

public class factorialUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n=sc.nextInt();
        if(n<0) {
            System.out.println("The number " + n + " is not a positive integer.");
        }else{
            long factorial=1;
            int i=1;
            while (i<=n) {
                factorial*=i;
                i++;
            }
            System.out.println("The factorial of " + n + " is " + factorial);
        }
    }
}
