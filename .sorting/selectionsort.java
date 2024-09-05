// time complexity = (O n^2)
public class selectionsort {
    public static void main(String arg[]) {
        int arr[] = {9,4,2,8,5};
        selsort(arr);

    }
    public static void selsort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
