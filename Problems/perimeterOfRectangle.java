import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        double l=sc.nextDouble();
        System.out.print("Enter width of rectangle:");
        double w=sc.nextDouble();
        double p=2*(l+w);
        System.out.print("Perimeter of rectangle is:"+p);
    }
}
