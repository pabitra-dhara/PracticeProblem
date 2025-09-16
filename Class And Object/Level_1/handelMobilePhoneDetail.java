/*5.Program to Handle Mobile Phone Details
Problem Statement: Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics. The method is used to retrieve and display this information for each object. */
class MobilePhone{
    String brand;
    String model;
    int price;
    MobilePhone(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    void displayPhoneDetails(){
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Price:"+price);
    }
}
public class handelMobilePhoneDetail {
    public static void main(String[] args) {
        MobilePhone obj1=new MobilePhone("Samsung","Galaxy",50000);
        MobilePhone obj2=new MobilePhone("Nokia", "K350", 5000);
        MobilePhone obj3=new MobilePhone("OnePlus", "Node 7",25000);
        obj1.displayPhoneDetails();
        obj2.displayPhoneDetails();
        obj3.displayPhoneDetails();
    }
}
