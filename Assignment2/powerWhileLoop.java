// 14.Rewrite the above program to find the power of a number using a while loop.
// Hint => 
// Get integer input for two variables named number and power.
// Create a result variable with an initial value of 1.
// Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
// In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
// Finally, print the result

import java.util.Scanner;

public class powerWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number=sc.nextInt();
        System.out.print("Enter power: ");
        int power=sc.nextInt();
        if(number>0 && power>=0) {
            long result=1;
            int counter=0;
            while(counter<power) {
                result*=number;
                counter++;
            }
            System.out.println(number + " raised to the power " + power + " is " + result);
        }else{
            System.out.println("Invalid input.");
        }
    }
}
