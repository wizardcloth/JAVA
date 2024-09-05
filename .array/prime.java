
public class prime {
    public static void main(String arg[]) {
        range(29);
        System.out.println(prime_no(5));
    }

    public static boolean prime_num(int n) {

        if (n == 1 || n == 0) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 0; i < n; i++) {
                if (n % 2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean prime_no(int n) {
        int counter = 0;
        if (n == 1 || n == 0) {
            counter = 1;
        } else if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                counter = 1;
                break;
            }
        }
        if (counter == 0) {
            // System.out.println("prime");
            return true;
        } else {
            // System.out.println("not prime");
            return false;
        }

    }

    public static void range(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime_no(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
