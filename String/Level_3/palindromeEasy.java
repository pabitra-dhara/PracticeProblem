/*7.Write a program to to check if a text is palindrome and display the result
Hint => 
A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
Logic 1: Write a method to compare the characters from the start and end of the string to determine whether the text is palindrome. The logic used here is as follows:
Set the start and end indexes of the text
Loop through the text and compare the characters from the start and the end of the string. If the characters are not equal, return false
Logic 2: Write a recursive method to compare the characters from the start and end of the text passed as parameters using recursion. The logic used here is as follows:
First, check if the start index is greater than or equal to the end index, then return true.
If the characters at the start and end indexes are not equal, return false.
Otherwise, call the method recursively with the start index incremented by 1 and the end index
Logic 3: Write a Method to compare the characters from the start and end of the text using character arrays. The logic used here is as follows:
Firstly Write a Method to reverse a string using the charAt() method and return the reversal array.
Create a character array using the String method toCharArray() and also create a reverse array. Compare the characters in the original and reverse arrays to do a Palindrome check 
Finally, in the main method do palindrome check using the three logic and display result
 */
import java.util.Scanner;

public class palindromeEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();

        if (checkIterative(text))
            System.out.println("Logic 1: Palindrome");
        else
            System.out.println("Logic 1: Not Palindrome");

        if (checkArray(text))
            System.out.println("Logic 2: Palindrome");
        else
            System.out.println("Logic 2: Not Palindrome");
    }
    static boolean checkIterative(String s) {
        int i=0, j=s.length()-1;
        while(i<j) {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    static boolean checkArray(String s) {
        char[] a = s.toCharArray();
        char[] r = new char[a.length];
        for(int i=0;i<a.length;i++) {
            r[i] = s.charAt(a.length-1-i);
        }
        for(int i=0;i<a.length;i++) {
            if(a[i]!=r[i]) return false;
        }
        return true;
    }
}

