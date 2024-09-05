public class shortestpath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
       System.out.println(shortestpath.ShortPath(path)); 

    }

    public static Double ShortPath(String path) {
        System.out.println(path);
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            switch (dir) {
                case ('N'):
                    y = y + 1;
                    break;
                case 'S':
                    y = y - 1;
                    break;
                case 'E':
                    x = x + 1;
                    break;
                case 'W':
                    x = x - 1;
                    break;
                default:
                    break;
            }
        }
        System.out.println("shortest path : " + x + "," + y);
        int x2 = x * x;
        int y2 = y * y;
        double value = Math.sqrt(x2 + y2);
        return value;
    }

}
