/*1.Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors. */
class Book {
    String title;
    String author;
    int price;

    Book() {
        title="Unknown Title";
        author="Unknown Author";
        price = 0;
    }
    Book(String title, String author,int price) {
        this.title=title;
        this.author=author;
        this.price=price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayDetails();
        Book book2 = new Book("Java Programming", "James Gosling",350);
        book2.displayDetails();
    }
}

