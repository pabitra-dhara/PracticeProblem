// 8.Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 

// Hint => 
// Take input for the number of students
// Create arrays to store marks, percentages, and grades of the students
// Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
// Calculate the percentage and grade of the students based on the percentage
// Display the marks, percentages, and grades of each student

import java.util.Scanner;

public class threeSubjectGradeFind {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[][] marks=new int[n][3];
        double[] percentage=new double[n];
        String[] grade=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter marks of student "+(i+1)+":");
            for(int j=0;j<3;j++){
                if(j==0) System.out.print("Physics: ");
                if(j==1) System.out.print("Chemistry: ");
                if(j==2) System.out.print("Maths: ");
                int m=sc.nextInt();
                if(m<0){ 
                    System.out.println("Marks cannot be negative! Enter again."); 
                    j--; 
                }else{
                    marks[i][j]=m;
                }
            }
            int total=marks[i][0]+marks[i][1]+marks[i][2];
            percentage[i]=(total/300.0)*100;
            if(percentage[i]>=80) grade[i]="A";
            else if(percentage[i]>=70) grade[i]="B";
            else if(percentage[i]>=60) grade[i]="C";
            else if(percentage[i]>=50) grade[i]="D";
            else if(percentage[i]>=40) grade[i]="E";
            else grade[i]="R";
        }
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1)+": Physics="+marks[i][0]+", Chemistry="+marks[i][1]+", Maths="+marks[i][2]+", Percentage="+percentage[i]+", Grade="+grade[i]);
        }
    }
}
