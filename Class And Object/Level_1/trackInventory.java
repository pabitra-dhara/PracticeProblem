/*4.Program to Track Inventory of Items
Problem Statement: Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity. */

import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    int price;
    Item(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
    int totalCost(int quantity){
        return quantity*price;
    }
}
public class trackInventory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter item code:");
        int itemCode=sc.nextInt();
        System.out.print("Enter item name:");
        String itemName=sc.nextLine();
        System.out.print("Enter price:");
        int price=sc.nextInt();
        Item obj=new Item(itemCode, itemName, price);
        obj.displayDetails();
        System.out.print("Enter quantity:");
        int quantity=sc.nextInt();
        System.out.println("Total Cost is:"+obj.totalCost(quantity));
    }
}
