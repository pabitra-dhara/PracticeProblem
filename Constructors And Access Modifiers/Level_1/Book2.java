/*Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book. */
class Book2{
    String title;
    String author;
    int price;
    boolean availability;
    Book2(String title,String author,int price,boolean availability){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;
    }
    void borrowBook(){
        if(availability==true){
            availability=false;
            System.out.println(title+" Book you are borrow");
        }else{
            System.out.println(title+" this book is alredy borrow");
        }
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price);
        if(availability==true){
            System.out.println(title+" this book is available");
        }else{
            System.out.println(title+" this book is not available");
        }
    }
    public static void main(String[] args) {
        Book2 b1= new Book2("Java Programming", "James Gosling", 530, true);
        b1.borrowBook();
    }
}