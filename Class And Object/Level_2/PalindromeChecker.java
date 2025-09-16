/*3.Program to Check Palindrome String
Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
Check if the text is a palindrome.
Display the result.
 */
import java.util.Scanner;

class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text=text;
    }

    boolean isPalindrome() {
        int left=0;
        int right=text.length()-1;

        while(left<right){
            char c1=Character.toLowerCase(text.charAt(left));
            char c2=Character.toLowerCase(text.charAt(right));

            if(c1!=c2){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    void displayResult() {
        if(isPalindrome()){
            System.out.println(text +" is a palindrome.");
        }else{
            System.out.println(text +" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String input=sc.nextLine();
        PalindromeChecker checker=new PalindromeChecker(input);
        checker.displayResult();
    }
}
