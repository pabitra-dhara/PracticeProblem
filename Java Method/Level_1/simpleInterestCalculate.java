// 1.Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
// Hint => 
// Simple Interest = Principal * Rate * Time / 100
// Take user input for principal, rate, time
// Write a method to calculate the simple interest given principle, rate and time as parameters
// Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”

import java.util.Scanner;

public class simpleInterestCalculate {
    public double calculator(double a,double b,double c){
        return (a*b*c)/100;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal:");
        double pri=sc.nextDouble();
        System.out.print("Enter Rate of Interest:");
        double rate=sc.nextDouble();
        System.out.print("Enter Time:");
        double time=sc.nextDouble();
        simpleInterestCalculate obj=new simpleInterestCalculate();
        double ans=obj.calculator(pri, rate, time);
        System.out.print("The Simple Interest is "+ans+" for Principal "+ pri +", Rate of Interest "+rate+" and Time "+time);
    }
}