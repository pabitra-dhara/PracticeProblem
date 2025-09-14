/*7.Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop */
import java.util.Scanner;

public class sumNaturalNumbers {
    public int findSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive number:");
        int n=sc.nextInt();
        sumNaturalNumbers obj=new sumNaturalNumbers();
        int sum=obj.findSum(n);
        System.out.print("The sum of first "+n+"natural number is "+sum);
    }
}
