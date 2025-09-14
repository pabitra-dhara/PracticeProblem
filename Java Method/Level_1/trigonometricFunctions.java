/*12.Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
*/
import java.util.Scanner;

public class trigonometricFunctions {
    public static double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double mySin(double x) {
        double sum = 0;
        int terms = 10;
        for (int i = 0; i < terms; i++) {
            double term = Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
            sum += term;
        }
        return sum;
    }
    public static double myCos(double x) {
        double sum = 0;
        int terms = 10;
        for (int i = 0; i < terms; i++) {
            double term = Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i);
            sum += term;
        }
        return sum;
    }

    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double pi = 3.141592653589793;
        double radians = angleDegrees * (pi / 180.0);
        double sine = mySin(radians);
        double cosine = myCos(radians);
        double tangent = sine / cosine;
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println("Sine of " + angle + "° = " + results[0]);
        System.out.println("Cosine of " + angle + "° = " + results[1]);
        System.out.println("Tangent of " + angle + "° = " + results[2]);
    }    
}
