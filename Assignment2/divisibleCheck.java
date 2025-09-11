// 1.Write a program to check if a number is divisible by 5
// I/P => number
// O/P => Is the number ___ divisible by 5? ___

import java.util.Scanner;

public class divisibleCheck {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A number:");
        int number=sc.nextInt();
        if(number%5==0){
            System.out.println(number+"Number is Divisible By 5");
        }else{
            System.out.println(number+"Number is Not Divisible By 5");
        }
    }
}