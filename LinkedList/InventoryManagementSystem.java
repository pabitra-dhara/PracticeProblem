/*Singly Linked List: Inventory Management System
Problem Statement: Design an inventory management system using a singly linked list where each node stores information about an item such as Item Name, Item ID, Quantity, and Price. Implement the following functionalities:
Add an item at the beginning, end, or at a specific position.
Remove an item based on Item ID.
Update the quantity of an item by Item ID.
Search for an item based on Item ID or Item Name.
Calculate and display the total value of inventory (Sum of Price * Quantity for each item).
Sort the inventory based on Item Name or Price in ascending or descending order.
Hint:
Use a singly linked list where each node represents an item in the inventory.
Implement sorting using an appropriate algorithm (e.g., merge sort) on the linked list.
For total value calculation, traverse through the list and sum up Quantity * Price for each item. */
class itemNode {
    String itemName;
    int itemID;
    int quantity;
    double price;
    itemNode next;
    public itemNode(String itemName, int itemID, int quantity, double price){
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
class InventoryList{
    itemNode head;
    void addItemFirst(String itemName, int itemID, int quantity, double price){
        itemNode newItem = new itemNode(itemName, itemID, quantity, price);
        newItem.next = head;
        head = newItem;
    }
    void addItemLast(String itemName, int itemID, int quantity, double price){
        itemNode newItem = new itemNode(itemName, itemID, quantity, price);
        if(head == null){
            head = newItem;
            return;
        }
        itemNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newItem;
    }
    void removeItem(int itemID){
        if(head == null){
            return;
        }
        if(head.itemID == itemID){
            head = head.next;
            return;
        }
        itemNode current = head;
        while(current.next != null){
            if(current.next.itemID == itemID){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    void displayInventory(){
        itemNode current = head;
        while(current != null){
            System.out.println("Item Name: " + current.itemName + ", Item ID: " + current.itemID + ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }
    
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryList inventory = new InventoryList();
        inventory.addItemLast("Cake", 1, 2, 20);
        inventory.addItemLast("Chips", 2, 5, 50);
        inventory.addItemFirst("Coke", 3, 1, 60);
        inventory.displayInventory();
        inventory.removeItem(1);
        inventory.displayInventory();
    }
}
