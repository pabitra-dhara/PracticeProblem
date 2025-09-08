import java.util.Scanner;

public class powerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number:");
        int b = sc.nextInt();
        System.out.print("Enter exponent number:");
        int e = sc.nextInt();
        double p=Math.pow(b,e);
        System.out.print("Power is:"+p);
    }
}
