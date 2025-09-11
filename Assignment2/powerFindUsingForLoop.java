// 12.Create a program to find the power of a number.
// Hint => 
// Get integer input for two variables - number and power and check for positive integer
// Create a result variable with an initial value of 1.
// Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result

import java.util.Scanner;

public class powerFindUsingForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number=sc.nextInt();
        System.out.print("Enter power: ");
        int power=sc.nextInt();
        if(number>0 && power>=0) {
            long result=1;
            for(int i=1;i<=power;i++) {
                result*=number;
            }
            System.out.println(number + " raised to the power " + power + " is " + result);
        }else{
            System.out.println("Invalid input.");
        }
    }
}
