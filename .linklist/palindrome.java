public class palindrome {
    public static void main(String[] args) {
        palindrome ll = new palindrome();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(5);
        ll.addlast(2);
        ll.addlast(1);
        System.out.println(ll.check_palindrome());

    }

    public static node head = null;
    public static node tail = null;

    public class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // use other data structure like array and string to find palindrom
    // store the value in array an perform palindrome
    // tc = O(n) for space and time
    // method 2
    // 1) find mid node
    // 2) 2nd half reverse
    // 3) check if (first half == second half)
    // tc = O(n) = time and space = O(1)

    public node findmid(node head) {
        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void addlast(int data) {
        node newnode = new node(data);
        if (tail == null) {
            head = tail = newnode;
            return;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public boolean check_palindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 find mid
        node midnode = findmid(head);
        // step 2 find reverse of second half
        
        node prev = null;
        node curr = midnode;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        node right = prev;
        node left = head;

        // step3 check left and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

}
