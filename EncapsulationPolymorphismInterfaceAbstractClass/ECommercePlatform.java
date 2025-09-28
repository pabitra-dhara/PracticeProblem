/*2. E-Commerce Platform
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product. */
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public abstract double calculateDiscount();
    public abstract double calculateTax();
    public abstract double getFinalPrice();

    public void display() {
        System.out.println("ID: " + productId + ", Name: " + name + ", Price: " + price);
    }
}
class Electronics extends Product {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.10; }
    public double calculateTax() { return getPrice() * 0.18; }
    public double getFinalPrice() {
        return getPrice() + calculateTax() - calculateDiscount();
    }
}
class Clothing extends Product {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount(){
         return getPrice() * 0.20; 
    }
    public double calculateTax(){
         return getPrice() * 0.05; 
    }
    public double getFinalPrice(){
        return getPrice() + calculateTax() - calculateDiscount();
    }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.05; }
    public double calculateTax() { return 0; }
    public double getFinalPrice() {
        return getPrice() - calculateDiscount();
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product e = new Electronics(1, "Phone", 20000);
        Product c = new Clothing(2, "T-Shirt", 1000);
        Product g = new Groceries(3, "Rice", 1500);
        show(e);
        show(c);
        show(g);
    }

    static void show(Product p) {
        p.display();
        System.out.println("Discount: " + p.calculateDiscount());
        System.out.println("Tax: " + p.calculateTax());
        System.out.println("Final Price: " + p.getFinalPrice());
    }
}
