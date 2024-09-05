public class bits {
    public static void main(String[] args) {
        odd_even(2);
        System.out.println(get_ith_bit(5, 1));
        System.out.println(set_ith_bit(10, 0));
        System.out.println(clear_ith_bit(10, 0));
        System.out.println(update_ith_bit(10, 1, 0));
        System.out.println(update_method2(10, 0, 1));
        System.out.println(clr_last_ithbit(10, 2));
        System.out.println(clr_range(15, 0, 2));
        System.out.println(power_of2(32));
        System.out.println(count_set_bits(16));

    }

    public static void odd_even(int n) {
        int bitmask = 1;
        if ((bitmask & n) == 0) {
            System.out.println("no is even");
        } else {
            System.out.println("no is odd");
        }
    }

    public static int get_ith_bit(int n, int i) {
        int bitmask = (1 << i);
        if ((bitmask & n) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int set_ith_bit(int n, int i) {
        int bitmask = (1 << i);
        return (bitmask | n);
    }

    public static int clear_ith_bit(int n, int i) {
        int bitmask = ~(1 << i);
        return (bitmask & n);

    }

    public static int update_ith_bit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clear_ith_bit(n, i);
        } else {
            return set_ith_bit(n, i);
        }
    }

    public static int update_method2(int n, int i, int newBit) {
        n = clear_ith_bit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }

    public static int clr_last_ithbit(int n, int i) {
        int bitmask = ((~0) << i);
        return (bitmask & n);

    }

    public static int clr_range(int n, int i, int j) {
        int a = ((~0 << j+1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return (bitmask & n);
    }
    public static String power_of2(int n) {
        if ((n & n-1) == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
    public static int count_set_bits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count ++;
            } 

            n = n >> 1; 
        }
        return count;
    }
}



























