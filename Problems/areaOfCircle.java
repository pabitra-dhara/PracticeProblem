import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        double r=sc.nextDouble();
        double area=3.14*r*r;
        System.out.print("Area of circle is:"+area);

    }
}
