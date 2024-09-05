// time complexity = (O n logn)
// import java.util.*;
import java.util.Collections;
import java.util.Arrays;
public class inbuilt {
    public static void main(String[] args) {
        // int arr[] = {5,4,6,3,9,3,2,7};
        // Arrays.sort(arr,0,4);
        Integer arr[] = {1,2,5,4,6,3};
        Arrays.sort(arr,Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
