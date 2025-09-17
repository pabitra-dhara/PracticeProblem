/*Problem 3: Vehicle Registration
Create a Vehicle class to manage the details of vehicles:
Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).
Methods:
An instance method displayVehicleDetails() to display owner and vehicle details. */
class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee=5000.0;
    Vehicle(String ownerName, String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    void displayVehicleDetails(){
        System.out.println("Owner Name: " +ownerName);
        System.out.println("Vehicle Type: " +vehicleType);
        System.out.println("Registration Fee: Rs." +registrationFee);
    }
    static void updateRegistrationFee(double newFee){
        registrationFee=newFee;
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ram", "Car");
        Vehicle v2 = new Vehicle("Sam", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
