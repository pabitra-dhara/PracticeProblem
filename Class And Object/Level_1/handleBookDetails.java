/*3.Program to Handle Book Details
Problem Statement: Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details. */

import java.util.Scanner;

class Book{
    String title;
    String author;
    int price;
    Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void displayBookDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.err.print("Price: "+price);
    }
}
public class handleBookDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Book Title:");
        String title=sc.nextLine();
        System.out.print("Enter Book Author:");
        String author=sc.nextLine();
        System.out.print("Enter Book Price:");
        int price=sc.nextInt();
        Book obj=new Book(title, author, price);
        obj.displayBookDetails();

    }
}
