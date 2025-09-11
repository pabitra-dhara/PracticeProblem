// 2.Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
import java.util.Scanner;

public class leapYearWithSingleIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year:");
        int year=sc.nextInt();
        if(year>=1582 && ((year%400==0) || (year%4==0 && year%100!=0))){
            System.out.println(year + " is a Leap Year.");
        }else if(year>=1582){
            System.out.println(year + " is not a Leap Year.");
        }else{
            System.out.println("The program works for year >= 1582 only.");
        }
    }
}
