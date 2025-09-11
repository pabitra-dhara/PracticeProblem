// 17.Create a program to find the bonus of employees based on their years of service.
// Hint => 
// Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
// Take salary and year of service in the year as input.
// Print the bonus amount.

import java.util.Scanner;

public class employeeBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        double salary=sc.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService=sc.nextInt();

        double bonus=0.0;
        if(yearsOfService>5) {
            bonus=salary*0.05;
            System.out.println("Bonus amount: " +bonus);
        }else{
            System.out.println("No bonus for less than or equal to 5 years of service.");
        }
    }
}
