import java.util.*;

public class binary_search {
    public static void main(String arg[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no : ");
        int no = sc.nextInt();
        int result = binary_srh(arr, no);
        if (result == -1) {
            System.out.println("no is not present");
        } else {
            System.out.println("no is present at index : " + result);
        }
        sc.close();
    }

    public static int binary_srh(int arr[], int no) {
        int mid, start = 0, end = arr.length-1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (no == arr[mid]) {                     //use arr[mid] for index
                return mid;
            } else if (no > mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
