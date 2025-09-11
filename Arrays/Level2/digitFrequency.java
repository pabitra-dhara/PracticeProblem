// 10.Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
// Hint => 
// Take the input for a number
// Find the count of digits in the number
// Find the digits in the number and save them in an array
// Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
// Display the frequency of each digit in the number

import java.util.Scanner;

public class digitFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number=sc.nextLong();
        int[] frequency=new int[10];
        long temp=number;
        while(temp!=0){
            int digit=(int)(temp%10);
            frequency[digit]++;
            temp/=10;
        }
        System.out.println("Digit frequencies:");
        for(int i=0;i<10;i++){
            if(frequency[i]!=0){
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
