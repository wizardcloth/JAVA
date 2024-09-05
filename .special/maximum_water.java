import java.util.ArrayList;

public class maximum_water {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        storewater_bruteforce(list);
        Two_pointer_approach(list);
    }
    public static void storewater_bruteforce(ArrayList<Integer> list){
        System.out.println(list);
        int maxwater = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1 ; j < list.size(); j++) {
                System.out.print("("+list.get(i) + ","+ list.get(j)+")");
                int height = Math.min(list.get(i), list.get(j));
                int width = j-i;
                int currentwater = height * width;
                maxwater = Math.max(maxwater,currentwater); 
            }
            System.out.println();
        }
        System.out.println("Maximum water : "+maxwater);
    }
    public static void  Two_pointer_approach(ArrayList<Integer> list) {
        int left = 0 , right = list.size()-1 ,maxarea = 0;
        while (left < right) {
            int height = Math.min(list.get(left), list.get(right));
            int width = right - left;
            int area = height * width;
            if (list.get(left) < list.get(right)) {
                left++;
            } else {
                right--;
            }
            maxarea = Math.max(maxarea, area);
            
        }
        System.out.println("Maximum water : " + maxarea);

    }
}