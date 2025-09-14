/*10.An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status. 
 */
import java.util.Scanner;

public class calculateBMIQ {
    public static double calculateBMI(double w, double h) {
        double hm = h / 100.0;
        return w / (hm * hm);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4){
            return "Underweight";
        }else if (bmi <= 24.9){
            return "Normal";
        }else if (bmi <= 39.9){
            return "Overweight";
        }else{
             return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] d = new double[10][3];
        String[] s = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            d[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            d[i][1] = sc.nextDouble();
            d[i][2] = calculateBMI(d[i][0], d[i][1]);
            s[i] = getBMIStatus(d[i][2]);
        }

        System.out.println("\nWeight(kg) Height(cm) BMI Status");
        for (int i = 0; i < 10; i++) {
            System.out.println(d[i][0] + " " + d[i][1] + " " + d[i][2] + " " + s[i]);
        }
    }
}

