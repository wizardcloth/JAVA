public class trap_rain {
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int trapwater = rainwater(height);
        System.out.println("trapwater is : "+ trapwater );
    }
    public static int rainwater(int height[])
    {
        int n = height.length;
        int leftBound[] = new int[n];
        leftBound[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftBound[i] = Math.max(height[i], leftBound[i-1]);
        }

        int rightBound[] = new int[n];
        rightBound[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightBound[i] = Math.max(height[i], rightBound[i+1]);
        }
        int trapwater = 0;
        for (int i = 0; i < n; i++) {
        int waterlevel = Math.min(leftBound[i],rightBound[i]);
        trapwater = trapwater + waterlevel - height[i];
        }
        System.out.println(trapwater);
        return trapwater;
    }
} 









