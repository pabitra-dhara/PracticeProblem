/*13.Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose. Also finding the determinant and inverse of a matrix. The program should take random matrices as input and display the result of the operations.
Hint => 
Write a Method to create a random matrix taking rows and columns as parameters
Write a Method to add two matrices
Write a Method to subtract two matrices
Write a Method to multiply two matrices
Write a Method to find the transpose of a matrix         
Write a Method to find the determinant of a 2x2 matrix
Write a Method to find the determinant of a 3x3 matrix
Write a Method to find the inverse of a 2x2 matrix
Write a Method to find the inverse of a 3x3 matrix
Write a Method to display a matrix
 */
import java.util.Random;

public class MatrixOps {

    static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    static int[][] add(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    static int[][] subtract(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    static int[][] multiply(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, n = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    static int[][] transpose(int[][] A) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }

    static void display(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] A = createMatrix(2, 2);
        int[][] B = createMatrix(2, 2);

        System.out.println("Matrix A:");
        display(A);

        System.out.println("Matrix B:");
        display(B);

        System.out.println("Addition:");
        display(add(A, B));

        System.out.println("Subtraction:");
        display(subtract(A, B));

        System.out.println("Multiplication:");
        display(multiply(A, B));

        System.out.println("Transpose of A:");
        display(transpose(A));
    }
}
