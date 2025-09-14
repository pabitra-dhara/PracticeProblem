/*2.Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable. */
import java.util.*;

class NumberChecker {

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

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrong(int num) {
        int count = countDigits(num);
        int[] digits = getDigits(num);
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, count);
        }
        return sum == num;
    }

    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);
    }

    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        System.out.println("Smallest: " + smallest + ", Second Smallest: " + secondSmallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);

        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck Number? " + (isDuckNumber(digits) ? "Yes" : "No"));
        System.out.println("Armstrong Number? " + (isArmstrong(num) ? "Yes" : "No"));

        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }
}
