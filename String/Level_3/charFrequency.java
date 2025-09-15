/*4.Write a program to find the frequency of characters in a string using the charAt() method and display the result
Hint => 
Create a method to find the frequency of characters in a string using the charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Create an array to store the characters and their frequencies
Loop through the characters in the text and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.  
 */
import java.util.Scanner;

public class charFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("Character  Frequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    static String[][] findFrequency(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int unique = 0;
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > 0) {
                unique++;
            }
        }

        String[][] result = new String[unique][2];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq[c] > 0) {
                result[index][0] = c + "";
                result[index][1] = freq[c] + "";
                index++;
                freq[c] = 0;
            }
        }
        return result;
    }
}
