import java.util.Scanner;

public class findTheSumOfNumberUntilEnterZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total=0.0;
        double number;
        System.out.print("Enter a number (0 or negative number to stop): ");
        number=sc.nextDouble();
        while (number!=0) {
            total+=number;
            if(number<=0){
                break;
            }
            System.out.print("Enter a number (0 or negative number to stop): ");
            number=sc.nextDouble();
        }
        System.out.print("The total sum is: " + total);
    }
}
