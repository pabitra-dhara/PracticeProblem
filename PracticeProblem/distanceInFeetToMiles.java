import java.util.Scanner;

// Write a program to find the distance in yards and miles for the distance provided by the user in feet
// Hint => 1 mile = 1760 yards and 1 yard is 3 feet
// I/P => distanceInFeet
// O/P => The distance in yards is ___ while the distance in miles is ___
public class distanceInFeetToMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the distance in feet:");
        double distanceInFeet=sc.nextDouble();
        double distanceInYards=distanceInFeet / 3;
        double distanceInMiles=distanceInYards / 1760;
        System.out.println("The distance in yards is " + distanceInYards +" while the distance in miles is " + distanceInMiles);
    }
}
