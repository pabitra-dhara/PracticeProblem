import java.util.Scanner;

public class rocketLunchCountDownUsingFoorLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();
        for(int i=counter;i>=1;i--){
            System.out.println(i);
        }
    }
}
