// 6.Write a program to check whether a number is positive, negative, or zero.
// Hint => 
// Get integer input from the user and store it in the number variable.
// If the number is positive, print positive.
// If the number is negative, print negative.
// If the number is zero, print zero.

import java.util.Scanner;

public class checkNumberIsPosetiveNagativeOrZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        if(number>0){
            System.out.print("print positive");
        }else if(number<0){
            System.out.print("print negative");
        }else{
            System.out.print("print zero");
        }
    }
}
