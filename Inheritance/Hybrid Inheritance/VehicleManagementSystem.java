/*Sample Problem 2: Vehicle Management System with Hybrid Inheritance
Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:
Define a superclass Vehicle with attributes like maxSpeed and model.
Create an interface Refuelable with a method refuel().
Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors. */

class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model=model;
        this.maxSpeed=maxSpeed;
    }

    void displayInfo(){
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed);
    }
}

interface Refuelable{
    void refuel();
}

class ElectricVehicle extends Vehicle{
    int batteryCapacity;

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity){
        super(model, maxSpeed);
        this.batteryCapacity=batteryCapacity;
    }

    void charge() {
        displayInfo();
        System.out.println("Battery Capacity: " +batteryCapacity);
    }
}

class PetrolVehicle extends Vehicle implements Refuelable{
    int fuelCapacity;

    PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity=fuelCapacity;
    }

    public void refuel() {
        displayInfo();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}
public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev=new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv=new PetrolVehicle("Honda Civic", 180, 50);
        ev.charge();
        pv.refuel();
    }
}
