public class test2 {
    public static void main(String[] args) {
        test2 ll = new test2();
        ll.create(12);
        ll.create(142);
        ll.create(125);
        ll.print();
    }
    // static node 
    public class node {
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static node head = null;
    static node tail = null;

    public void create(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void addfirst() {
        
    }
    public void addlast() {
        
    }
    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
