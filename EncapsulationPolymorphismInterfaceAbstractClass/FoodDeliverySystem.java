/*6. Online Food Delivery System
Description: Create an online food delivery system:
Define an abstract class FoodItem with fields like itemName, price, and quantity.
Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.
 */
interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    FoodItem() {}
    protected void setDetails(String name, double price, int qty){
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }
    public String getItemName(){ return itemName; }
    public double getPrice(){ return price; }
    public int getQuantity(){ return quantity; }

    public void getItemDetails(){
        System.out.println(itemName + " - Qty: " + quantity + ", Price: " + price);
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    VegItem(String name, double price, int qty){
        setDetails(name, price, qty);
    }

    public double calculateTotalPrice(){
        return getPrice() * getQuantity() - discount;
    }

    public void applyDiscount(double percent){
        discount = (getPrice()*getQuantity()) * percent/100;
    }

    public String getDiscountDetails(){
        return "Veg discount: " + discount;
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;

    NonVegItem(String name, double price, int qty){
        setDetails(name, price, qty);
    }

    public double calculateTotalPrice(){
        double extraCharge = 20;
        return (getPrice()*getQuantity() + extraCharge) - discount;
    }

    public void applyDiscount(double percent){
        discount = (getPrice()*getQuantity()) * percent/100;
    }

    public String getDiscountDetails(){
        return "NonVeg discount: " + discount;
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args){
        FoodItem item1 = new VegItem("Paneer Butter Masala", 150, 1);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 250, 1);

        processOrder(item1, 10);
        processOrder(item2, 5);
    }

    static void processOrder(FoodItem item, double discountPercent){
        item.getItemDetails();
        if(item instanceof Discountable){
            Discountable d = (Discountable)item;
            d.applyDiscount(discountPercent);
            System.out.println(d.getDiscountDetails());
        }
        System.out.println("Total Price: " + item.calculateTotalPrice());
    }
}
