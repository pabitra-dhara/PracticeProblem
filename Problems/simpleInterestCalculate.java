import java.util.Scanner;

public class simpleInterestCalculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal amount:");
        double p=sc.nextDouble();
        System.out.print("Enter rate of interest:");
        double r=sc.nextDouble();
        System.out.print("Enter time in years:");
        double t=sc.nextDouble();
        double si=(p*r*t)/100;
        System.out.print("Simple Interest is:"+si);
    }
}
