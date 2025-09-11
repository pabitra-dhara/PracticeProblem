// 1.Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
// Hint => 
// Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
// Define a double array to save salary and years of service for each of the 10 employees
// Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
// Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
// Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
// Print the total bonus payout as well as the total old and new salary of all the employees

import java.util.Scanner;

public class employeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary of employee" + (i + 1) + ":");
            double sal = sc.nextDouble();
            System.out.println("Enter years of service of employee" + (i + 1) + ":");
            double years = sc.nextDouble();
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input.Please enter again.");
                i--;
                continue;
            }
            salaries[i] = sal;
            yearsOfService[i] = years;
        }
        for (int i = 0; i < 10; i++) {
            double bonus;
            if (yearsOfService[i] > 5) {
                bonus = salaries[i] * 0.05;
            } else {
                bonus = salaries[i] * 0.02;
            }
            bonuses[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee" + (i + 1) + "-OldSalary:" + salaries[i] + ",Bonus:" + bonuses[i]
                    + ",NewSalary:" + newSalaries[i]);
        }
        System.out.println("\nTotal Bonus Payout:" + totalBonus);
        System.out.println("Total Old Salary:" + totalOldSalary);
        System.out.println("Total New Salary:" + totalNewSalary);
    }
}