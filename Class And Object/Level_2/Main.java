/*5.Program to Simulate a Shopping Cart
Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items and calculating the total cost. */
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println(itemName + " - Rs" + price + " x " + quantity + " = Rs" + getTotalPrice());
    }
}

class ShoppingCart {
    CartItem[] items;
    int count;

    ShoppingCart(int size) {
        items = new CartItem[size];
        count = 0;
    }

    void addItem(CartItem item) {
        if (count < items.length) {
            items[count] = item;
            count++;
            System.out.println(item.itemName + " added to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    void removeItem(String itemName) {
        boolean removed = false;
        String searchLower = itemName.toLowerCase();
        for (int i = 0; i < count; i++) {
            String itemLower = items[i].itemName.toLowerCase();
            if (itemLower.equals(searchLower)) {
                System.out.println(items[i].itemName + " removed from the cart.");
                for (int j = i; j < count - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[count - 1] = null;
                count--;
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Item not found in the cart.");
        }
    }

    double getTotalCost() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].getTotalPrice();
        }
        return total;
    }

    void displayCart() {
        System.out.println("\nCart Items:");
        if (count == 0) {
            System.out.println("Cart is empty.");
        } else {
            for (int i = 0; i < count; i++) {
                items[i].displayItem();
            }
            System.out.println("Total Cost: Rs" + getTotalCost());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart(10);
        int choice;

        do {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Item Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();
                cart.addItem(new CartItem(name, price, qty));
            } else if (choice == 2) {
                System.out.print("Enter Item Name to Remove: ");
                String removeName = sc.nextLine();
                cart.removeItem(removeName);
            } else if (choice == 3) {
                cart.displayCart();
            } else if (choice == 4) {
                System.out.println("Exiting Shopping Cart");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }
}
