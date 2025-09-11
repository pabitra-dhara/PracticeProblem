// 9.Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
// Hint => 
// All the steps are the same as the problem 8 except the marks are stored in a 2D array
// Use the 2D array to calculate the percentages, and grades of the students

import java.util.Scanner;

public class studentGrad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[][] marks=new int[n][3];
        double[] percentage=new double[n];
        String[] grade=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter marks for student " +(i+1)+":");
            System.out.print("Physics: ");
            marks[i][0]=sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1]=sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2]=sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            int total=marks[i][0]+marks[i][1]+marks[i][2];
            percentage[i]=total/3.0;

            if(percentage[i]>=90) grade[i]="A+";
            else if(percentage[i]>= 80) grade[i]="A";
            else if (percentage[i] >=70) grade[i]="B";
            else if (percentage[i] >= 60) grade[i]="C";
            else if (percentage[i] >= 50) grade[i]="D";
            else grade[i]="F";
        }

        System.out.println("\nStudent Results:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for(int i=0;i<n;i++){
            System.out.println((i+1)+"\t"+marks[i][0]+"\t"+marks[i][1]+"\t\t"+marks[i][2]+"\t"+percentage[i]+"\t\t"+grade[i]);
        }
    }
}
