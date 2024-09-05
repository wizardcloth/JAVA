import java.util.ArrayList;

public class multilist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();   
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list2.add(3);
        list2.add(4);
        mainlist.add(list1);
        mainlist.add(list2);
        System.out.println(mainlist);
        list(mainlist);

    }
    public static void list(ArrayList<ArrayList<Integer>> mainlist) {
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currentList = mainlist.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");
            } 
            System.out.println();
        }
    }
}
