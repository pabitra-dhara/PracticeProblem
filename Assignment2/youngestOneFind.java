// 6.Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
// Hint => 
// Take user input for the age and height of the 3 friends and store it in a variable
// Find the smallest of the 3 ages to find the youngest friend and display it
// Find the largest of the 3 heights to find the tallest friend and display it

import java.util.Scanner;

public class youngestOneFind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age of Amar: ");
        int ageAmar=sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar=sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony=sc.nextInt();
        System.out.print("Enter height of Amar: ");
        double heightAmar=sc.nextDouble();
        System.out.print("Enter height of Akbar: ");
        double heightAkbar=sc.nextDouble();
        System.out.print("Enter height of Anthony: ");
        double heightAnthony=sc.nextDouble();
        if(ageAmar<ageAkbar && ageAmar<ageAnthony) {
            System.out.println("Amar is the youngest");
        }else if(ageAkbar<ageAmar && ageAkbar<ageAnthony) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }
        if (heightAmar>heightAkbar && heightAmar>heightAnthony) {
            System.out.println("Amar is the tallest");
        } else if (heightAkbar>heightAmar && heightAkbar>heightAnthony) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }
    }
}
