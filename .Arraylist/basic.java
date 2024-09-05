import java.util.ArrayList;
import java.util.Collections;
public class basic {
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>();
        
        // add in list TC = O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        //TC = O(n)
        list.add(1,9);
        System.out.println(list);
        System.out.println("list size is : " + list.size());
        Collections.sort(list);
        System.out.println("acending order : " + list);
        //reveseorder is a comparator : definr func logic 
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("decending order : " + list);

        //get element TC = O(1)
        System.out.println("element is : "+list.get(1));

        //remove
        System.out.println("removed element : "+list.remove(1));
        System.out.println(list);
        
        //set
        System.out.println(list.set(1, 2));
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

    }
}
