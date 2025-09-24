/*
 Sample Problem 1: Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.
 */
class Order{
    int orderId;
    String orderDate;
    public void orderDetail(int id,String d){
        orderId=id;
        orderDate=d;
    }
}
class ShippedOrder extends Order{
    int trackingNumber;
    public void shippedOrderDetails(int n){
        trackingNumber=n;
    }
}
class DeliveredOrder extends ShippedOrder{
    String deliverydate;
    public void deliveredOrderDetails(String dd){
        deliverydate=dd;
    }
    public void getOrderStatus(){
        System.out.println("Order id number: "+orderId);
        System.out.println("Order Date: "+orderDate);
        System.out.println("Tracking Number is: "+trackingNumber);
        System.out.println("Deliver order date: "+deliverydate);
    }
}
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        DeliveredOrder obj=new DeliveredOrder();
        obj.orderDetail(1,"24-09-2025");
        obj.shippedOrderDetails(9856);
        obj.deliveredOrderDetails("29-09-2025");
        obj.getOrderStatus();
    }
}
