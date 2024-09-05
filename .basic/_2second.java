
import java.util.*;
public class _2second {
    public static void main(String arg[])
    {
        int x,y,z;
        x = 2;
        y = 4;
        z = x%y;
        System.out.println(x + "," + y + "," + z);

        Scanner in = new Scanner(System.in);
        System.out.print("enter a no : ");
        int input = in.nextInt();
        if (input % 2 == 0) {
            System.out.println("no is even");
        } else {
            System.out.println("no is odd");
        }
        System.out.print("enter the no : ");
        int no = in.nextInt();
        String out  = (no % 2 == 0) ? ("even" ) : ("odd") ;
        System.out.println("the number " + no + " is " + out );
        in.close();

    }
}
