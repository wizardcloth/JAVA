public class countingsort {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 1, 2, 5, 6, 4, 0 };
        count(arr);
    }

    public static void count(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;

        }
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }
        System.out.println();
        for (int i = count.length-1; i >= 0 ; i--) {
            for (int j = 0; j < count[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}