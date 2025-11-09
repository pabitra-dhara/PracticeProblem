/*2. Doubly Linked List: Movie Management System
Problem Statement: Implement a movie management system using a doubly linked list. Each node will represent a movie and contain Movie Title, Director, Year of Release, and Rating. Implement the following functionalities:
Add a movie record at the beginning, end, or at a specific position.
Remove a movie record by Movie Title.
Search for a movie record by Director or Rating.
Display all movie records in both forward and reverse order.
Update a movie's Rating based on the Movie Title.
Hint:
Use a doubly linked list where each node has two pointers: one pointing to the next node and the other to the previous node.
Maintain pointers to both the head and tail for easier insertion and deletion at both ends.
For reverse display, start from the tail and traverse backward using the prev pointers.*/
class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next;
    Movie prev;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
class MovieDoublyLinkedList {
    private Movie head;
    private Movie tail;

    public MovieDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = newMovie;
            tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }
    public void addMovieAtFirst(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = newMovie;
            tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }
}

    public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieDoublyLinkedList movieList = new MovieDoublyLinkedList();
        movieList.addMovieAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addMovieAtEnd("The Matrix", "The Wachowskis", 1999, 8.7);
        movieList.addMovieAtFirst("Interstellar", "Christopher Nolan", 2014, 8.6);
    }
}