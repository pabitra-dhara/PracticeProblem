/*4.Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
 */
import java.util.Scanner;

public class shortestLongestString {

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

    static int[] findShortestLongest(String[][] table) {
        int shortest = Integer.MAX_VALUE;
        int longest = Integer.MIN_VALUE;
        for (int i = 0; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < shortest) shortest = len;
            if (len > longest) longest = len;
        }
        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = makeTable(words);
        int[] result = findShortestLongest(table);

        System.out.println("Word   Length");
        for (String[] row : table) {
            int len = Integer.parseInt(row[1]);
            System.out.println(row[0] + " " + len);
        }

        System.out.println();
        System.out.println("Shortest word length: " + result[0]);
        System.out.println("Longest word length: " + result[1]);
    }
}

