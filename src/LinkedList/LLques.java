package LinkedList;

public class LLques {

    private Node head;
    private Node tail;
    private int size;

    public LLques(){
        this.size = 0;
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
         if(tail==null){
             tail = head;
         }
         size+=1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public Node findNnode( int n){
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n ; i++) {
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LLques li = new LLques();
        li.insertFirst(45);
        li.insertFirst(74);
        li.insertFirst(77);
        li.insertFirst(78);
        li.insertFirst(79);

        li.display();

        Node q = li.findNnode(2);
        System.out.println(q.val);
    }

}
