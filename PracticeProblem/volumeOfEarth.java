// 7.Write a Program to compute the volume of Earth in km^3 and miles^3
// Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
// O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
public class volumeOfEarth {
    public static void main(String[] args) {
        double radiusKm=6378;
        double pi=3.14;
        double volumeKm=(4.0/3)*pi*(radiusKm*radiusKm*radiusKm);
        double kmToMiles=0.621371;
        double radiusMiles=radiusKm*kmToMiles;
        double volumeMiles=(4.0/3)*pi*(radiusMiles*radiusMiles*radiusMiles);
        System.out.println("The volume of earth in cubic kilometers is "+ volumeKm+" and cubic miles is "+ volumeMiles);
    }    
}
