/*5.Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Check if a number is prime number. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself. 
Method to Check if a number is a neon number. A neon number is a number where the sum of digits of the square of the number is equal to the number itself 
Method to Check if a number is a spy number. A number is called a spy number if the sum of its digits is equal to the product of its digits
Method to Check if a number is an automorphic number. An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
Method to Check if a number is a buzz number. A buzz number is a number that is either divisible by 7 or ends with 7
 */
public class NumberChecker4 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        return String.valueOf(square).endsWith(String.valueOf(n));
    }

    public static boolean isBuzz(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 9;
        int num3 = 1124;
        int num4 = 25;
        int num5 = 27;

        System.out.println(num1 + " is Prime? " + isPrime(num1));
        System.out.println(num2 + " is Neon? " + isNeon(num2));
        System.out.println(num3 + " is Spy? " + isSpy(num3));
        System.out.println(num4 + " is Automorphic? " + isAutomorphic(num4));
        System.out.println(num5 + " is Buzz? " + isBuzz(num5));
    }
}
