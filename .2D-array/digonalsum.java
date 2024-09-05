public class digonalsum {
    public static void main(String arg[]) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        digonal_sum(matrix);
        Digonalsum(matrix);
    }

    public static void Digonalsum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][i];
            if(i != matrix.length-1-i)
            {
                //i + j = n-1
                sum = sum + matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum + " ");
    }

    public static void digonal_sum(int matrix[][]) {
        //time complexity (O(n^2))
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
                if(i != matrix.length-1-i){
                    if (i + j == matrix[0].length - 1) {
                        sum = sum + matrix[i][j];
                    }
                }
            }
        }
        System.out.println(sum + " ");
    }

}
