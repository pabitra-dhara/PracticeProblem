/*4.Program to Model a Movie Ticket Booking System
Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
Book a ticket (assign seat and update price).
Display ticket details.
Explanation: The MovieTicket class organizes ticket information with attributes. The methods handle booking logic and display ticket details */
import java.util.Scanner;

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    MovieTicket(String movieName) {
        this.movieName=movieName;
        this.seatNumber="Not Booked";
        this.price=0.0;
    }

    void bookTicket(String seatNumber, double price) {
        this.seatNumber=seatNumber;
        this.price=price;
        System.out.println("Ticket booked successfully for "+movieName);
    }

    void displayTicketDetails() {
        System.out.println("Movie Name :" + movieName);
        System.out.println("Seat Number:" + seatNumber);
        System.out.println("Price:"+ price);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String name=sc.nextLine();
        MovieTicket ticket=new MovieTicket(name);
        System.out.print("Enter Seat Number: ");
        String seat=sc.nextLine();
        System.out.print("Enter Ticket Price: ");
        double price=sc.nextDouble();
        ticket.bookTicket(seat, price);
        System.out.println("\nTicket Details:");
        ticket.displayTicketDetails();
    }
}
