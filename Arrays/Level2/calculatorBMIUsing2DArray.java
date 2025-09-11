// 7.Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
// Hint => 
// Take input for a number of persons
// Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
//        double[][] personData = new double[number][3];
//        String[] weightStatus = new String[number];
// Take input for weight and height of the persons and for negative values, ask the user to enter positive values
// Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
// Display the height, weight, BMI and status of each person

import java.util.Scanner;

public class calculatorBMIUsing2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n=sc.nextInt();
        double[][] personData=new double[n][3];
        String[] weightStatus=new String[n];
        for(int i=0;i<n;i++){
            double weight, height;
            do{
                System.out.print("Enter weight (kg) of person "+(i+1)+": ");
                weight=sc.nextDouble();
            }while(weight<=0);
            do{
                System.out.print("Enter height (m) of person "+(i+1)+": ");
                height=sc.nextDouble();
            }while(height<=0);
            double bmi=weight/(height*height);
            personData[i][0]=weight;
            personData[i][1]=height;
            personData[i][2]=bmi;
            if(bmi<=18.4){
                weightStatus[i]="Underweight";
            }else if(bmi<=24.9){
                weightStatus[i]="Normal";
            }else if(bmi<=39.9){
                weightStatus[i]="Overweight";
            }else{
                weightStatus[i]="Obese";
            }
        }
        System.out.println("Person  Weight(kg)  Height(m)  BMI  Status");
        for(int i=0;i<n;i++){
            System.out.println((i+1)+"\t"+personData[i][0]+"\t\t"+personData[i][1]+"\t\t"+personData[i][2]+"\t"+weightStatus[i]);
        }
    }
}
