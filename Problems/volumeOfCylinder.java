import java.util.Scanner;

public class volumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of cylinder:");
        double r=sc.nextDouble();
        System.out.print("Enter height of cylinder:");
        double h=sc.nextDouble();
        double v=3.14*r*r*h;
        System.out.print("Volume of cylinder is:"+v);
    }
}
