public class singly {
    public static void main(String[] args) {
        singly ll = new singly();

        //cycle corner case
        // head = new node(1);
        // head.next = new node(2);
        // head.next.next = new node(2);
        // head.next.next.next = new node(3);
        // head.next.next.next.next = head;
        
        //cycle without corner case
        head = new node(1);
        node temp = new node(2);
        head.next = temp;
        head.next.next = new node(3);
        head.next.next.next = temp;


        ll.add(0, 30);
        ll.create(1);
        ll.create(2);
        ll.create(3);
        ll.create(4);
        ll.addfirst(5);
        ll.addfirst(52);
        ll.addfirst(512);
        ll.addlast(12);
        ll.addlast(122);
        ll.addlast(132);
        // ll.remove_front();
        // ll.remove_last();
        // ll.deletefromend(3);
        // ll.itrsearch(1222);
        // ll.print();
        // System.out.println("List size : " + size);
        // ll.reverse();
        // ll.cycle_detect();
        // ll.remove_cycle();
        // ll.cycle_detect();
        // ll.print();

    }

    public static node head;
    public static node tail;
    public static int size = 0;

    public singly() {
        head = null;
        tail = null;
    }

    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void create(int data) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        } else {
            tail.next = newnode;
            tail = newnode;
        }

    }

    public void addfirst(int data) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        } else {

            newnode.next = head;
            head = newnode;
        }
    }

    public void addlast(int data) {
        node newnode = new node(data);
        size++;
        if (tail == null) {
            head = tail = newnode;
            return;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addfirst(data);
            return;
        }
        node newnode = new node(data);
        size++;
        node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    public void remove_front() {
        if (size == 0) {
            System.out.println("empty");
        } else if (size == 1) {
            // int temp = head.data;
            head = tail = null;
            size = 0;
        } else {
            int temp = head.data;
            head = head.next;
            size--;
            System.out.println("Deleted element is : " + temp);
        }
    }

    public void remove_last() {
        node prev = head;
        if (size == 0) {
            System.out.println("empty");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {

            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;

            }

            int taildata = prev.next.data; // tail.data
            prev.next = null;
            tail = prev;
            size--;
            System.out.println("deleted element : " + taildata);
        }
    }

    public void itrsearch(int key) {
        node temp = head;
        int i = 0;
        boolean found = false;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("item found : " + i);
                found = true;
            }
            temp = temp.next;
            i++;
        }
        if (found == false) {
            System.out.println("Not found");
        }

    }

    public void reverse() {
        node prev = null;
        node curr = tail = head;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deletefromend(int n) {
        // if you want to calulate the size of link list
        // int size = 0;
        // node temp = head;
        // while (temp.next != null) {
        // temp = temp.next;
        // size++;
        // }

        if (n == size) {
            head = head.next;
            return;
        }
        int i = 1;
        int index = size - n;
        node prev = head;
        while (i < index) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public void cycle_detect() {
        node fast;
        node slow = fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("cycle detected");
                return;
            }
        }
        System.out.println("cycle not detected");
    }

    public void remove_cycle() {
        // it do not work on corner case 
        // which is when complete cycle is formed connecting last to head
    
        // 1 find cycle
        node fast = head;
        node slow = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }    
        }
        if (cycle == false) {
        return;
        }
        // find meeting point
        slow = head ;
        node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;

        }
        // remove cycle
        prev.next = null;


    }

    public void print() {
        if (head == null) {
            System.out.println("empty");
        }
        node temp = head;
        System.out.print("Linklist is : ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
