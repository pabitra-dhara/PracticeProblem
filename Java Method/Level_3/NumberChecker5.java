/*6.Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and another for finding the factor and storing in the array
Method to find the greates factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find product of cube of the factors using the factors array. Use Math.pow() 
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
 */
public class NumberChecker5 {

    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] > max) {
                max = factors[i];
            }
        }
        return max;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    public static int productFactors(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    public static double productCubes(int[] factors) {
        double product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum > n;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum < n;
    }

    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 28;

        int[] factors = getFactors(number);
        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productCubes(factors));

        System.out.println(number + " is Perfect? " + isPerfect(number));
        System.out.println(number + " is Abundant? " + isAbundant(number));
        System.out.println(number + " is Deficient? " + isDeficient(number));
        System.out.println(number + " is Strong? " + isStrong(number));
    }
}
