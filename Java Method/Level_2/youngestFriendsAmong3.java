/*8.Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Write a Method to find the youngest of the 3 friends
Write a Method to find the tallest of the 3 friends
 */
import java.util.Scanner;

public class youngestFriendsAmong3{

    public static int youngest(int[] a) {
        int y = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[y]) y = i;
        }
        return y;
    }

    public static int tallest(double[] h) {
        int t = 0;
        for (int i = 1; i < h.length; i++) {
            if (h[i] > h[t]) t = i;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] ht = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + n[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + n[i] + ": ");
            ht[i] = sc.nextDouble();
        }
        int y = youngest(age);
        int t = tallest(ht);
        System.out.println("Youngest: " + n[y]);
        System.out.println("Tallest: " + n[t]);
    }
}
