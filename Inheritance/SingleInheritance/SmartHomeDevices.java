/*Sample Problem 2: Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general. */
class Device{
    int deviceId;
    String status;
    public void setDevice(int id,String s){
        deviceId=id;
        status=s;
    }
}
class Thermostat extends Device {
    double temperatureSetting;
    public void setThermostat(double t){
        temperatureSetting=t;
    }
    public void displayStatus(){
        System.out.println("Device id is: "+deviceId);
        System.out.println("Device status is: "+status);
        System.out.println("Device temperature is: "+temperatureSetting);
    }
    
}
public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat obj=new Thermostat();
        obj.setDevice(1,"ON");
        obj.setThermostat(25.8);
        obj.displayStatus();
    }
}
