/*Doubly Linked List: Library Management System
Problem Statement: Design a library management system using a doubly linked list. Each node represents a book and contains the following attributes: Book Title, Author, Genre, Book ID, and Availability Status. Implement the following functionalities:
Add a new book at the beginning, end, or at a specific position.
Remove a book by Book ID.
Search for a book by Book Title or Author.
Update a book’s Availability Status.
Display all books in forward and reverse order.
Count the total number of books in the library.
Hint:
Use a doubly linked list with two pointers (next and prev) in each node to facilitate traversal in both directions.
Ensure that when removing a book, both the next and prev pointers are correctly updated.
Displaying in reverse order will require traversal from the last node using prev pointers. */
class Book {
    int id;
    String title, author, genre;
    boolean available;
    Book next, prev;

    Book(int id, String title, String author, String genre, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
}

class Library {
    Book head, tail;
    void addFirst(int id, String t, String a, String g, boolean av) {
        Book b = new Book(id, t, a, g, av);
        if (head == null)
            head = tail = b;
        else {
            b.next = head;
            head.prev = b;
            head = b;
        }
    }
    void addLast(int id, String t, String a, String g, boolean av) {
        Book b = new Book(id, t, a, g, av);
        if (head == null)
            head = tail = b;
        else {
            tail.next = b;
            b.prev = tail;
            tail = b;
        }
    }
    void remove(int id) {
        Book c = head;
        while (c != null) {
            if (c.id == id) {
                if (c.prev != null)
                    c.prev.next = c.next;
                else
                    head = c.next;
                if (c.next != null)
                    c.next.prev = c.prev;
                else
                    tail = c.prev;
                return;
            }
            c = c.next;
        }
    }
    void search(String key) {
        Book c = head;
        boolean found = false;
        while (c != null) {
            if (c.title.equals(key) || c.author.equals(key)) {
                System.out.println("Found: " + c.title + " by " + c.author);
                found = true;
            }
            c = c.next;
        }
        if (!found)
            System.out.println("Not found!");
    }
    int count() {
        int cnt = 0;
        for (Book c = head; c != null; c = c.next)
            cnt++;
        return cnt;
    }
    void displayReverse() {
        for (Book c = tail; c != null; c = c.prev)
            System.out.println(c.id + " " + c.title + " " + c.author);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addLast(1, "Java Basics", "James", "Programming", true);
        lib.addLast(2, "Python 101", "Guido", "Programming", true);
        lib.addFirst(3, "C++ Guide", "Bjarne", "Programming", false);
        System.out.println("\nSearch result:");
        lib.search("Guido");
        System.out.println("\nAfter removing ID 2:");
        lib.remove(2);
        System.out.println("\nReverse Order:");
        lib.displayReverse();
        System.out.println("\nTotal Books: " + lib.count());
    }
}
