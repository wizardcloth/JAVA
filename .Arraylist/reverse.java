import java.util.*;
public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); 
        list.add(2); 
        list.add(3); 
        list.add(4); 
        list.add(5); 

        Reverse(list);
        Max(list);
        swap(list, 1, 3);
        
    }   
    public static void Reverse(ArrayList<Integer> list) {
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i) + " ");
        }
    }
    public static void Max(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i) > max) {
        //         max = list.get(i);
        //     }
        // }
        //    or
        for (int j = 0; j < list.size(); j++) {
            max = Math.max(max, list.get(j));
        }
        System.out.println("max value : " + max);
    }

    public static void swap(ArrayList<Integer> list,int idx1,int idx2) {
        int temp ;
        temp = list.get(idx1);
        list.set(idx1, list.get(idx2) );
        list.set(idx2,temp);
        System.out.println(list);

    }
}
