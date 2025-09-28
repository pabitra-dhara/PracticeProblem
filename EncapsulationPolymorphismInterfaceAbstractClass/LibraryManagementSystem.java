/*5. Library Management System
Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type. */
interface Reservable {
    void reserveItem(String name);
    boolean checkAvailability();
}
abstract class LibraryItem {
    private String id, title, author;
    private String borrower;
    LibraryItem() {}
    protected void setDetails(String id,String title,String author){
        this.id=id; this.title=title; this.author=author;
    }
    public void showDetails() {
        System.out.println(id+ "-"+title+"by"+author);
    }
    protected void setBorrower(String name){
        borrower = name; 
    }
    protected String getBorrower() { 
        return borrower; 
    }
    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    Book(String i,String t,String a){
        setDetails(i,t,a);
    }
    public int getLoanDuration(){
        return 14;
    }
    public void reserveItem(String n){
        setBorrower(n);System.out.println("Book reserved by "+n);
    }
    public boolean checkAvailability(){
        return getBorrower()==null;
    }
}

class Magazine extends LibraryItem implements Reservable {
    Magazine(String i,String t,String a){
        setDetails(i,t,a);
    }
    public int getLoanDuration(){
        return 7;
    }
    public void reserveItem(String n){
        setBorrower(n);System.out.println("Magazine reserved by "+n);
    }
    public boolean checkAvailability(){
        return getBorrower()==null;
    }
}

class DVD extends LibraryItem implements Reservable {
    DVD(String i,String t,String a){
        setDetails(i,t,a);
    }
    public int getLoanDuration(){
        return 3;
    }
    public void reserveItem(String n){
        setBorrower(n);System.out.println("DVD reserved by "+n);
    }
    public boolean checkAvailability(){
        return getBorrower()==null;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args){
        LibraryItem b=new Book("B1","Java Basics","Author A");
        LibraryItem m=new Magazine("M1","Tech Weekly","Author B");
        LibraryItem d=new DVD("D1","Movie Night","Director C");
        handle(b);
        handle(m);
        handle(d);
    }
    static void handle(LibraryItem item){
        item.showDetails();
        System.out.println("Loan: "+item.getLoanDuration()+" days");
        Reservable r=(Reservable)item;
        System.out.println("Available? "+r.checkAvailability());
        r.reserveItem("Alice");
        System.out.println("Available? "+r.checkAvailability());
    }
}
