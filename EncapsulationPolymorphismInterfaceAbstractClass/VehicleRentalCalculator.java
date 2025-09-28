/*8. Ride-Hailing Application
Description: Develop a ride-hailing application:
Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
Use an interface GPS with methods getCurrentLocation() and updateLocation().
Secure driver and vehicle details using encapsulation.
Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.
 */
abstract class Vehicle {
    private String id, driver;
    private double rate;
    private String location;

    void setDetails(String id,String driver,double rate,String location){
        this.id = id;
        this.driver = driver;
        this.rate = rate;
        this.location = location;
    }

    void showDetails(){
        System.out.println(id + " - " + driver + " | Rate/km: " + rate + " | Location: " + location);
    }

    protected double getRate(){ 
        return rate; 
    }

    public abstract double calculateFare(double distance);

    void setLocation(String loc){ 
        location = loc; 
    }
    String getLocation(){ 
        return location; 
    }
}

class Car extends Vehicle {
    Car(String id,String driver,double rate,String loc){ 
        setDetails(id,driver,rate,loc); 
    }
    public double calculateFare(double distance){ 
        return distance*getRate()*1.2; 
    }
}

class Bike extends Vehicle {
    Bike(String id,String driver,double rate,String loc){ 
        setDetails(id,driver,rate,loc); 
    }
    public double calculateFare(double distance){ 
        return distance*getRate(); 
    }
}

class Auto extends Vehicle {
    Auto(String id,String driver,double rate,String loc){ 
        setDetails(id,driver,rate,loc); 
    }
    public double calculateFare(double distance){ 
        return distance*getRate()*0.9; 
    }
}

public class VehicleRentalCalculator {
    public static void main(String[] args){
        Car car = new Car("C1","Pabitra",15,"Chandigarh");
        Bike bike = new Bike("B1","Ram",10,"Airport");
        Auto auto = new Auto("A1","Laxma",12,"Station");

        System.out.println(car.getLocation() + " Fare for 10 km: " + car.calculateFare(10));
        System.out.println(bike.getLocation() + " Fare for 5 km: " + bike.calculateFare(5));
        System.out.println(auto.getLocation() + " Fare for 8 km: " + auto.calculateFare(8));
    }
}
