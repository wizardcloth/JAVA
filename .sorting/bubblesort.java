// time complexity = (O n^2)
public class bubblesort {

    public static void main(String arg[]) {
        int arr[] = {1,2,3,4,5};
        System.out.println("arr len " + arr.length);
        sort(arr);

    }
    public static void sort(int arr[]) {
        boolean swap = false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}