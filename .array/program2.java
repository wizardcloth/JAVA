
import java.util.*;

public class program2 {
    public static void main(String[] args) {
    //    pali_rev();
       sum();
    }


        // MULTIPLICATION OF NUMBERS //

    public static void MULTIPLICATION() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no : ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
        System.out.println(number + " * " + i + "\t= " + number * i);
        }
        sc.close();
    }

        // **Seperate sum of odd and even number** //

    public static void odd_even() {
        int even_no = 0;
        int odd_no = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter -1 to exit");
        System.out.print("plz enter the no : ");
        int number = sc.nextInt();
        while (number != -1) {
        if (number % 2 == 0) {
        even_no = even_no + number;
        } else {
        odd_no = odd_no + number;
        }
        System.out.print("plz enter the no : ");
        number = sc.nextInt();
        }
        System.out.println("Total sum of even is :" + even_no);
        System.out.println("Total sum is odd  is :" + odd_no);
        sc.close();
    }
        // FACT UPTO N NUMBERS //

    public static void fact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no : ");
        int number = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("total fact is : " + fact);
        sc.close();
    }
        // SUM UPTO N NUMBERS //

    public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no : ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("total sum is : " + sum);
        sc.close();
    }

    //average of numbers //
    public static void average() {
        int b = 5 ;
        float c = 5;
        double d = 5;
        int avg = (int) (b + c + d) / 3;
        System.out.println("avg is " + avg);
    }

    public static void pali_rev() {
        int rev = 0,temp;
        System.out.print("plz enter the no : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        temp = input;
        while (input > 0) {   
            int r = input % 10;
            rev = (rev*10) + r;
            input = input / 10;
        }
        
        System.out.println("reverse of no is : " + rev);
        if (temp == rev) {
            System.out.println("no is palindrome");
        } else {
            System.out.println("no is not palindrome");
        }
        sc.close();

    }
}
