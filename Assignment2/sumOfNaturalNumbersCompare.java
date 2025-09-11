// 12.Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using while loop
// Compare the two results and print the result

import java.util.Scanner;

public class sumOfNaturalNumbersCompare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n=sc.nextInt();
        if(n>0){
            int sumFormula=n*(n+1)/2;
            int sumWhile=0;
            int counter=1;
            while(counter<=n) {
                sumWhile+=counter;
                counter++;
            }
            System.out.println("Sum using formula n*(n+1)/2: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);
            if(sumFormula==sumWhile) {
                System.out.println("Both computations match. The result is correct!");
            }else{
                System.out.println("Results do not match. Check computations!");
            }

        }else{
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
