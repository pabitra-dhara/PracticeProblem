/*1.An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
Hint => 
Take user input for the person's weight (kg) and height (cm) and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameters. Calls the user-defined method to compute the BMI and the BMI Status and stores in a 2D String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
 */
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) of person " + (i + 1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) of person " + (i + 1) + ": ");
            hw[i][1] = sc.nextDouble();
        }
        
        String[][] result = computeBMI(hw);
        displayResult(result);
    }

    static String[][] computeBMI(double[][] hw) {
        String[][] data = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double heightCm = hw[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 24.9) status = "Normal";
            else if (bmi < 39.9) status = "Overweight";
            else status = "Obese";
            
            data[i][0] = weight + "";
            data[i][1] = heightCm + "";
            data[i][2] = bmi + "";
            data[i][3] = status;
        }
        return data;
    }

    static void displayResult(String[][] result) {
        System.out.println("Weight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "  " + result[i][1] + "  " + result[i][2] + "  " + result[i][3]);
        }
    }
}
