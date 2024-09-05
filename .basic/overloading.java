
public class overloading {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;
        sum(a, b);
        sum(a, b, c);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        // System.out.println(Float.MAX_VALUE);
        // System.out.println(Float.MIN_VALUE);
    }

    public static int sum(int a, int b) {
        System.out.println(a + b);
        return 0;
    }

    public static int sum(int a, int b, int c) {
        System.out.println(a + b + c);
        return 0;
    }
}
