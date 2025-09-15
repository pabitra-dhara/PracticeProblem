/*10.Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below
Hint => 
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. 
 */
import java.util.Random;

public class StudentMarks {
    public static void main(String[] args) {
        int students = 5;
        int[][] marks = generateMarks(students);
        int[][] results = calculateResults(marks);
        char[] grades = calculateGrades(results);
        displayScorecard(marks, results, grades);
    }

    static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = rand.nextInt(41) + 60; 
            }
        }
        return arr;
    }

    static int[][] calculateResults(int[][] marks) {
        int[][] res = new int[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            int avg = total / 3;
            int percent = (total * 100) / 300;
            res[i][0] = total;
            res[i][1] = avg;
            res[i][2] = percent;
        }
        return res;
    }

    static char[] calculateGrades(int[][] results) {
        char[] grades = new char[results.length];
        for (int i = 0; i < results.length; i++) {
            int percent = results[i][2];
            if (percent >= 80) grades[i] = 'A';
            else if (percent >= 70) grades[i] = 'B';
            else if (percent >= 60) grades[i] = 'C';
            else if (percent >= 50) grades[i] = 'D';
            else if (percent >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        return grades;
    }

    static void displayScorecard(int[][] marks, int[][] results, char[] grades) {
        System.out.println("Student  Physics  Chemistry  Math  Total  Average  Percentage  Grade");
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t\t" + marks[i][0] + "\t\t" + marks[i][1] + "\t\t" + marks[i][2]+ "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2] + "%" + "\t\t" + grades[i]);
        }
    }
}

