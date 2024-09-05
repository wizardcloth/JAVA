public class staircase {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        top(matrix,5);
        bottom(matrix,5);

    }
    public static void bottom(int matrix[][],int key) {
        int row = matrix.length-1,col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("found at : " + row + "," + col);
                break;
            } else if(key < matrix[row][col]) {
                row--;
            }
            else{
                col++;
            }
        }
    }
    public static void top(int matrix[][] ,int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found at : " + row + "," + col);
                break;
            } else if (key < matrix[row][col]) {
                col--;

            } else {
                row++;
            }
        }
    }
}