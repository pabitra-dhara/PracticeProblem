// 7.Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
// Hint => 
// Spring Season is from March 20 to June 20


public class springSeasonCheck {
    public static void main(String[] args) {
        if (args.length!=2) {
            System.out.println("Please provide month and day as command-line arguments.");
            return;
        }
        int month=Integer.parseInt(args[0]);
        int day=Integer.parseInt(args[1]);

        boolean isSpring=false;
        if(month==3 && day>=20 && day<=31) {
            isSpring=true;
        }else if(month==4 && day>=1 && day<=30) {
            isSpring=true;
        }else if(month==5 && day>=1 && day<=31) {
            isSpring=true;
        }else if(month==6 && day>=1 && day<=20) {
            isSpring=true;
        }

        if(isSpring) {
            System.out.println("It's a Spring Season");
        }else{
            System.out.println("Not a Spring Season");
        }
    }
}
