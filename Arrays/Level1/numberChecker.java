// 2.Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
// Hint => 
// Define an integer array of 5 elements and get user input to store in the array.
// Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
// If the number is negative, print negative. Else if the number is zero, print zero. 
// Finally compare the first and last element of the array and display if they equal, greater or less

import java.util.Scanner;

public class numberChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numbers=new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<numbers.length;i++) {
            int num=numbers[i];
            if(num>0){
                if(num%2==0){
                    System.out.println(num + " is Positive and Even");
                }else{
                    System.out.println(num + " is Positive and Odd");
                }
            }else if(num<0){
                System.out.println(num + " is Negative");
            }else{
                System.out.println(num + " is Zero");
            }
        }
        int first=numbers[0];
        int last=numbers[numbers.length-1];
        if(first==last){
            System.out.println("First and last elements are equal.");
        }else if(first>last){
            System.out.println("First element is greater than last element.");
        }else{
            System.out.println("First element is less than last element.");
        }
    }
}
