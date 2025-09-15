/*7.Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result */
import java.util.Scanner;

public class trimStringCharAt {
    static int[] findTrimIndexes(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (IndexOutOfBoundsException e) {}

        int start = 0;
        while (start < len && str.charAt(start) == ' ') {
            start++;
        }

        int end = len - 1;
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }
    static String substring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;
        try {
            while (true) {
                s1.charAt(len1); 
                len1++; 
            }
        } catch (IndexOutOfBoundsException e) {}
        try {
            while (true) {
                 s2.charAt(len2); len2++; 
            }
        } catch (IndexOutOfBoundsException e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String trimmedManual = substring(input, indexes[0], indexes[1]);
        String trimmedBuiltIn = input.trim();

        System.out.println("Trimmed using charAt(): \"" + trimmedManual + "\"");
        System.out.println("Trimmed using built-in trim(): \"" + trimmedBuiltIn + "\"");

        boolean same = compareStrings(trimmedManual, trimmedBuiltIn);
        System.out.println("Both strings are equal: " + same);
    }
}
