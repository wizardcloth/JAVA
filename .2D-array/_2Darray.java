import java.util.*;

public class _2Darray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Matrix(matrix);
        System.out.println("largest element : " + largest(matrix));
        System.out.println("smallest element : " + smallest(matrix));

    }

    public static void Matrix(int matrix[][]) {
        int m = matrix.length, n = matrix[0].length;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        in.close();

    }

    public static int largest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                largest = Math.max(largest, matrix[i][j]);
            }
        }
        return largest;
    }

    public static int smallest(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }
        return smallest;
    }
}
