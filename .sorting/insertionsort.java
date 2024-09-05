public class insertionsort {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 2, 3, 1 };
        inssort(arr);

    }

    public static void inssort(int arr[]) {
        int temp, i, j;
        for (i = 1; i < arr.length ; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >=0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2] + " ");
        }
    }
}
