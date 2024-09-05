
import java.util.*;

public class program {
    public static void main(String[] arg) {

        // TO CHECK NEGAtIVE AND POSITIVE NO

        // System.out.print("enter the no : ");
        // Scanner in = new Scanner(System.in);
        // int input = in.nextInt();
        // if (input > 0) {
        // System.out.println("positive no");
        // } else {
        // System.out.println("negative no");
        // }
        // in.close();

        // TO PRINT DAY ACC TO CHOICE

        // System.out.println("enter your option");
        // Scanner in = new Scanner(System.in);
        // int input = in.nextInt();
        // switch (input) {
        // case 1:
        // System.out.println("sunday");
        // break;
        // case 2:
        // System.out.println("monday");
        // break;
        // case 3:
        // System.out.println("tuesday");
        // break;
        // case 4:
        // System.out.println("wednesday");
        // break;
        // case 5:
        // System.out.println("thursday");
        // break;
        // case 6:
        // System.out.println("friday");
        // break;
        // case 7:
        // System.out.println("saturday");
        // break;
        // default:
        // System.out.println("invalid choice");
        // break;
        // }
        // in.close();

        // TO CHECK LEAP YEAR

        System.out.println("enter your option");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if (input % 4 == 0 && input % 100 == 0 && input % 400 == 0 ) {
        System.out.println(input + " is leap year");
        } else {
        System.out.println(input + " is not a leap year");
        }
        in.close();

        // TO CHECK LARGEST OF THREE

        int a = 7777;
        int b = 989;
        int c = 889;
        if (a > b) {
            if (a > c) {
                System.out.println("Largest is " + a);
            } else {
                System.out.println("Largest is " + c);
            }
        }
        else if (b > c) {
            System.out.println("Largest is " + b);
        }
        else {
            System.out.println("Largest is " + c);
        }

    }
}
