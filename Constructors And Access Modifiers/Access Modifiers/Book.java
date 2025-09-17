/*Problem 2: Book Library System
Design a Book class with:
ISBN (public).
title (protected).
author (private).
Write methods to:
Set and get the author name.
Create a subclass EBook to access ISBN and title and demonstrate access modifiers. */
class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author=author;
    }
}

class EBook extends Book {

    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {
        Book b=new Book("234567890", "Java Basics", "John Doe");
        b.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + b.getAuthor());
        System.out.println();
        EBook eb=new EBook("987654321", "Advanced Java", "Alice Brown");
        eb.display();
    }
}
