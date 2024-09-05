import java.util.LinkedList;

public class test {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.addFirst(0);
        ll.addLast(3);
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);
        System.out.println(ll.element());
        System.out.println(ll.size());

        l2.add(1);
        l2.add(2);
        l2.add(3);
        System.out.println(ll.equals(l2));
    }
}