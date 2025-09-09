// Write a program to take 2 numbers and print their quotient and reminder
// Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
// I/P => number1, number2
// O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___

import java.util.Scanner;

public class quotientRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2=sc.nextInt();
        int quotient=number1/number2;
        int remainder=number1%number2;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +" of two numbers " + number1 + " and " + number2);
    }
}
