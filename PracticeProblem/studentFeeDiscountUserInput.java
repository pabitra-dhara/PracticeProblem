// 9.Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
// Hint => 
// Create a variable named fee and take user input for fee.
// Create another variable discountPercent and take user input.
// Compute the discount and assign it to the discount variable.
// Compute and print the fee you have to pay by subtracting the discount from the fee.
// I/P => fee, discountPrecent
// O/P => The discount amount is INR ___ and final discounted fee is INR ___

import java.util.Scanner;

public class studentFeeDiscountUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Student Fee: ");
        double fee=sc.nextDouble();
        System.out.print("Enter the Discount Percentage: ");
        double discountPercent=sc.nextDouble();
        double discount=(fee*discountPercent)/100;
        double finalFee=fee-discount;
        System.out.println("The discount amount is INR "+ discount+" and final discounted fee is INR "+ finalFee);
    }
}
