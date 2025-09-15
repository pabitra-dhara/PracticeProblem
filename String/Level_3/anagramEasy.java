/*8.Write a program to check if two texts are anagrams and display the result
Hint => 
An anagram is a word or phrase formed by rearranging the same letters to form different words or phrases,
Write a method to check if two texts are anagrams. The logic used here is as follows:
Check if the lengths of the two texts are equal
Create an array to store the frequency of characters in the strings for the two text
Find the frequency of characters in the two texts using the loop
Compare the frequency of characters in the two texts. If the frequencies are not equal, return false
In the main function take user inputs, call user-defined methods, and displays result. 
 */
import java.util.Scanner;

public class anagramEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.println("Enter second text: ");
        String text2 = sc.nextLine();

        if (isAnagram(text1, text2)){
            System.out.println("The texts are Anagrams");
        }else{
            System.out.println("The texts are Not Anagrams");
        }
            
    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) return false;
        }
        return true;
    }
}
