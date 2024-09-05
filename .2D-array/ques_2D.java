
public class ques_2D {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6},
                { 7, 8, 9 } };
        count_7(matrix);
        sum_row(matrix);
        transpose(matrix);
    }

    public static void count_7(int matrix[][]) {
        int key = 7, count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j]) {
                    count++;
                }
            }
        }
        System.out.println("total no of 7's : " + count);
    }

    public static void sum_row(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[1][i];
        }
        System.out.println("sum of 2nd row : " + sum);
    }

    public static void transpose(int matrix[][]) {
        int transpose[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
