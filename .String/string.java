import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //arr has length property
        
        int arr[] = {1,2,3,4,5};
        System.out.println(arr.length);
        
        //string has length() function
        String str1 = "hello";
        System.out.println("sub string : " + str1.substring(0,4));
        String str2 = in.nextLine();
        System.out.println(str1.equals(str2));
        System.out.println("string len : " + str2.length());
        System.out.println("string at : " + str2.charAt(0));
        in.close();
    }    
}
