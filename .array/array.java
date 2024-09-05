
import java.util.*;

public class array{
    public static void main(String arg[]) {
      reverse();
      
    }

    public static void arr() {
        int arr[] = new int[50];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("arr is : ");
        for (int i = 0; i < 5; i++) {
            System.out.print("\t");
            System.out.print(arr[i]);
        }
        sc.close();
    }

    public static void largest() {
        int largest[] = { 1, 2, 4, 9, 17, 5 };
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < largest.length; i++) {
            if (largest[i] > min) {
                min = largest[i];
            }
        }
        System.out.print("largest no is " + min);
    }

    public static void reverse() {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int first = 0, last = arr.length - 1, temp;
        while (first < last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void pairs() {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        for (int i = 1; i <= arr.length; i++) {
            for (int j = i + 1 ; j <= arr.length; j++) {
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
        }
    }

    public static void subarray_method1() {
        int arr[] = { -1,2,-3,4,5 };
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                sum = sum + arr[j2];
                }
                System.out.print(sum + " ");
                if (sum>maxsum) {
                    maxsum = sum;
                }
                if (sum < minsum) {
                    minsum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("max sum is " + maxsum);
        System.out.println("max sum is " + minsum);
    }

    public static void prefixsum() {   //erorrrrr
        int arr[] = {1,2,3,4,5};
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        int sum = 0; 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i != 0) {
                    sum = prefix[j] - prefix[i-1];
                } else {
                    sum = prefix[j];
                }
            }
        }
        System.out.println("sum is " + sum);
    }

    public static void subarray_method2() {
        int arr[] = { -1,2,-3,4,5 };
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                System.out.print(sum + " ");
                if (sum>maxsum) {
                    maxsum = sum;
                }
                if (sum < minsum) {
                    minsum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("max sum is " + maxsum);
        System.out.println("max sum is " + minsum);
    }

    public static void kadanes()
    {
        int arr[] = {1,2,3,4,5};
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = sum  + arr[i];
        }
        maxsum = Math.max(sum, maxsum);
        System.out.println("max sum is " + maxsum);
    }
}

