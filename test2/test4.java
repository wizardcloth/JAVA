import java.util.*;
public class test4 {
    public static void main(String[] args) {
        String arr1[] = new String[50];
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string : ");
        System.out.println("enter -1 to exit : ");
        int check =1;
        while (check != -1) {
            
            for (int i = 0; i < 50; i++) {
                arr1[i] = in.next();
                check = in.nextInt();
            }
        }

        in.close();

        substring(arr1);
    }
    public static void substring(String arr1[]) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }
    }
}
