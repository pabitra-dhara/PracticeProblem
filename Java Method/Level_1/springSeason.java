/*6.Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false */
import java.util.Scanner;

public class springSeason {
    public boolean season(int month,int day){
        if(month==3 && day>=20 && day<=31){
            return true;
        }else if(month ==4 && day>=1 && day<=30){
            return true;
        }else if(month==5 && day>=1 && day<=31){
            return true;
        }else if(month==6 && day>=1 && day<=20){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month number:");
        int month=sc.nextInt();
        System.out.print("Enter day number:");
        int day=sc.nextInt();
        springSeason obj=new springSeason();
        boolean se=obj.season(month,day);
        if(se==true){
            System.out.print("Spring Season");
        }else{
            System.out.print("Not Spring Season");
        }

    }
}
