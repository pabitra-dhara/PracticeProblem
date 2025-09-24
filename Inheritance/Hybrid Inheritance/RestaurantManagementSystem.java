/*Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects. */
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

interface Worker {
    void performDuties();
}
class Chef extends Person implements Worker{
    String specialty;

    Chef(String name,int id,String specialty){
        super(name, id);
        this.specialty=specialty;
    }
    @Override
    public void performDuties(){
        displayInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Cooking and managing kitchen tasks.");
    }
}

class Waiter extends Person implements Worker {
    int tableCount;

    Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        displayInfo();
        System.out.println("Role: Waiter");
        System.out.println("Serving " + tableCount + " tables.");
        System.out.println("Duties: Taking orders and serving food.");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef c1 = new Chef("John", 101, "Italian Cuisine");
        Waiter w1 = new Waiter("Alice", 202, 5);
        c1.performDuties();
        w1.performDuties();
    }
}
