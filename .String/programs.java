public class programs {
    public static void main(String[] args) {
        String str = "malayalam";
        int n = str.length();
        palindrome(str,n);
    }

    public static void palindrome(String str,int n) {
        //time complexity (O(n))
       int flag =0;
       for (int i = 0; i < n / 2; i++) {
        if (str.charAt(i) != str.charAt(n-1-i)) {
            flag++;
        }
       }
       if (flag == 0) {
        System.out.println("string is  plaindrome");
       }
       else{
        System.out.println("string is not plaindrome");
       }

    }
}
