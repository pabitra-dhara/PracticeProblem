/*1.Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 
 */

import java.util.Scanner;

public class compareToString {
    public boolean compare(String f,String s){
        if(f.length()!=s.length()){
            return false;
        }else{
            for(int i=0;i<f.length();i++){
                if(f.charAt(i)!=s.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st String:");
        String f=sc.next();
        System.out.print("Enter 2nd String:");
        String s=sc.next();
        compareToString obj=new compareToString();
        boolean temp=obj.compare(f, s);
        if(temp==true){
            System.out.print("Both String are same");
        }else{
            System.out.print("Both String is not same");
        }
    }
}