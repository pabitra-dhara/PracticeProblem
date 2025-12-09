/*
Problem 1: Library and Books (Aggregation)
Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
Tasks:
Define a Library class with an ArrayList of Book objects.
Define a Book class with attributes such as title and author.
Demonstrate the aggregation relationship by creating books and adding them to different libraries.
Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects. */

import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }
    public void addBook(Book b) {
        books.add(b);
    }

    public void showLibrary() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.showInfo();
        }
        System.out.println();
    }
}

public class LibraryAndBooks {
        public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Spring Boot Class Note", "Mohita Mam");
        Book b3 = new Book("Web Class Note", "Anmul Sir");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);

        lib1.showLibrary();
        lib2.showLibrary();
    }
}
