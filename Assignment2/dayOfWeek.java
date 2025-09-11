import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(args.length!=3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }
        int m=Integer.parseInt(args[0]);
        int d=Integer.parseInt(args[1]);
        int y=Integer.parseInt(args[2]);
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        int d0=(d+x+(31*m0)/12)%7;
        System.out.println("Day of week (0=Sunday): " + d0);
        String[] days={ "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("It is: " + days[d0]);
    }
}
