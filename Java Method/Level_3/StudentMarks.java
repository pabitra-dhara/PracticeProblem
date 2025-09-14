/*12. Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the total, average, and the percentage score 

Hint => 
Take input for the number of students
Write a method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using the Math.round() method. 
Finally, write a Method to display the scorecard of all stud
*/
import java.util.*;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 10 + (int) (Math.random() * 90);
            }
        }
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double percent = Math.round((total / 300.0 * 100) * 100.0) / 100.0;

            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t\t"+ marks[i][2] + "\t" + total + "\t" + avg + "\t" + percent + "%");
        }

    }
}
