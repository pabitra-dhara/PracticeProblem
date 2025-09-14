/*5.Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
*/
import java.util.Scanner;

public class numberCheck {
    public int check(int n){
        if(n>0){
            return 1;
        }else if(n<0){
            return -1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        numberCheck obj=new numberCheck();
        int ans=obj.check(n);
        if(ans==1){
            System.out.print("This number is positive number");
        }else if(ans==-1){
            System.out.print("This number is negative number");
        }else{
            System.out.print("This number is zero");
        }
    }
}
