/*2.Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result */
import java.util.Scanner;

public class textSplitterNoBuiltIn {
    public static int findLength(String str) {
        int count=0;
        try {
            while(true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }
    public static String[] customSplit(String text) {
        int len = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }
        String[] words = new String[wordCount];
        int wIndex = 0;
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                currentWord.append(c);
            } else {
                words[wIndex] = currentWord.toString();
                wIndex++;
                currentWord = new StringBuilder();
            }
        }
        words[wIndex] = currentWord.toString();

        return words;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (!manualEquals(arr1[i], arr2[i])) return false;
        }
        return true;
    }
    public static boolean manualEquals(String s1, String s2) {
        int len1 = findLength(s1);
        int len2 = findLength(s2);
        if (len1 != len2) return false;
        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] customWords = customSplit(text);
        String[] builtInWords = text.split(" ");
        System.out.println("Words using customSplit:");
        for (String w : customWords){
            System.out.println(w);
        }
        System.out.println("Words using built-in split:");
        for (String w : builtInWords){
            System.out.println(w);
        }
        boolean same=compareArrays(customWords, builtInWords);
        System.out.println("Both arrays are equal: " + same);
    }
}

