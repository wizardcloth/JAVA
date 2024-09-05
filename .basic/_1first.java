
import java.util.*;
public class _1first
{
       public static void main(String args[]) {
        System.out.println(2  + " ,"+  2 );
        System.out.println(~0);
 
        /* 

        System.out.print("****\n");
        System.out.print("***\n");
        System.out.print("**\n");
        System.out.print("*\n");
    
    int a = 9;
    System.out.println(a);
    
    byte b = 127;
    System.out.println(b);
    
 */   
     Scanner in = new Scanner(System.in);

     int a = in.nextInt();
     int b = in.nextInt();
     if(a>b)
     System.out.println(a+" is greater than "+b);
     else
     System.out.println(b+" is greater than "+a);

    // int input = in.nextInt();
    // System.out.println(input);

    float input = 26.0f;
    System.out.println(input);
    System.out.println(Math.round(input));

    in.close();

    byte x = 98;
    short y = 32;
    char z = 'a';
    int p = (int) z;
    float sum = x + y + z;
    System.out.println(p);
    System.out.println(sum);

    } 
}

