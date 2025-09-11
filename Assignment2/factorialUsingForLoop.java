// 15.Rewrite program 14 using for loop
// Hint => 
// Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 

import java.util.Scanner;

public class factorialUsingForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n=sc.nextInt();
        if(n<0) {
            System.out.println("The number " + n + " is not a positive integer.");
        }else{
            long factorial=1;
            for (int i=1;i<=n;i++) {
                factorial*=i;
            }
            System.out.println("The factorial of " + n + " is " + factorial);
        }
    }
}
