// Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
// Hint => 
// Create variables a, b, and c of int data type.
// Take user input for a, b, and c.
// Compute 3 integer operations and assign the result to a variable
// Finally, print the result and try to understand operator precedence.
// I/P => fee, discountPrecent
// O/P => The results of Int Operations are ___, ___, and ___
// Similarly, write the DoubleOpt program by taking double values and doing the same operations.
import java.util.Scanner;

public class intOperationUseDouble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a=sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b=sc.nextDouble();
        System.out.print("Enter value of c: ");
        double c=sc.nextDouble();
        double result1=a+b*c;
        double result2=a*b+c;
        double result3=c+a/b;
        double result4=a%b+c;
        System.out.println("The results of Double Operations are " +result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
