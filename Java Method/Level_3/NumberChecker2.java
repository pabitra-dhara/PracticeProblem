/*3.Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to find the sum of the digits of a number using the digits array
Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
Method to Check if a number is a harshad number using a digits array. A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.
 */
import java.util.*;

class NumberChecker2 {

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] getDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d * d;
        }
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    public static void digitFrequency(int[] digits) {
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int d : digits) {
                if (d == i) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("Digit " + i + " -> " + count + " times");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);

        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares: " + sumOfSquares(digits));
        if (isHarshad(num, digits)) {
            System.out.println("It is a Harshad number");
        } else {
            System.out.println("Not a Harshad number");
        }
        System.out.println("Digit frequencies:");
        digitFrequency(digits);
    }
}
