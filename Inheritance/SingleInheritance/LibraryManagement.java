/*Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.*/
class Book{
    String title;
    int publicationYear;
    public void setBook(String t,int py){
        title=t;
        publicationYear=py;
    }
}
class Auther extends Book{
    String name;
    String bio;
    public void setAuther(String n,String b){
        name=n;
        bio=b;
    }
    public void displayInfo(){
        System.out.println("Book title: "+title);
        System.out.println("Book publication year: "+publicationYear);
        System.out.println("Auther name: "+name);
        System.out.println("Auther bio: "+bio);
    }
}
public class LibraryManagement {
    public static void main(String[] args){
        Auther obj=new Auther();
        obj.setBook("Java Fundamental",2025);
        obj.setAuther("John","John is java fundamental book writer");
        obj.displayInfo();
    }
    
}