/*3.Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
 */
import java.util.Scanner;

public class WordLengthTable {

    static int getLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return c;
    }

    static String[] splitWords(String text) {
        int len = getLength(text);
        int words = 1;
        for (int i = 0; i < len; i++) if (text.charAt(i) == ' ') words++;

        String[] arr = new String[words];
        String w = "";
        int k = 0;
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                w += ch;
            } else {
                arr[k++] = w;
                w = "";
            }
        }
        arr[k] = w;
        return arr;
    }

    static String[][] makeTable(String[] words) {
        String[][] t = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            t[i][0] = words[i];
            t[i][1] = String.valueOf(getLength(words[i]));
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] table = makeTable(splitWords(text));

        System.out.println("Word  Length");
        for (String[] row : table) {
            int len = Integer.parseInt(row[1]);
            System.out.println(row[0] + "  |  " + len);
        }
    }
}
