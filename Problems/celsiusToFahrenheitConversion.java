import java.util.Scanner;

public class celsiusToFahrenheitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius:");
        double c=sc.nextDouble();
        double f=(c*9/5)+32;
        System.out.print("Temperature in Fahrenheit is:"+f);
    }
}
