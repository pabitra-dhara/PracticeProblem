/*5.Write a program to find the frequency of characters in a string using unique characters and display the result
Hint => 
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies. 
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.
 */
import java.util.Scanner;

public class charFrequencyWithUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("Character   Frequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "   " + result[i][1]);
        }
    }

    static char[] uniqueCharacters(String str) {
        char[] temp = new char[str.length()];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                temp[index] = c;
                index++;
            }
        }
        char[] unique = new char[index];
        for (int i = 0; i < index; i++) {
            unique[i] = temp[i];
        }
        return unique;
    }

    static String[][] findFrequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        char[] unique = uniqueCharacters(str);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = unique[i] + "";
            result[i][1] = freq[unique[i]] + "";
        }
        return result;
    }
}
