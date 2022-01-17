package ss10_dsa_stack_queue.thuc_hanh;

public class MyLinkedListQueue {
    class Node{
        public int key;
        public Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key){
//        System.out.println(this.head);
//        System.out.println(this.tail);
        Node temp = new Node(key);
        System.out.println("id cua temp------------"+temp);
        if(this.tail == null){
            this.head = this.tail = temp;
            System.out.println(this.head);
            System.out.println(this.tail);
//            System.out.println(head.key);
//            System.out.println(head.next);
//            System.out.println(tail.key);
//            System.out.println(tail.next);
            return;
        }
        this.tail.next = temp;
//        System.out.println("------"+this.head);
//        System.out.println("++++++"+this.tail);
//        System.out.println("------"+this.head.next);
//        System.out.println("++++++"+this.tail.next);
        this.tail = temp;
//        System.out.println(this.tail);
//        System.out.println("------"+this.head);
//        System.out.println(this.head.key);
//        System.out.println(head.key);
//        System.out.println(head.next);
//        System.out.println(tail.key);
//        System.out.println(tail.next);
    }

    public Node dequeue(){
        if(this.head == null)return null;
        Node temp = this.head;
        this.head = this.head.next;
        if(this.head == null)this.tail = null;
        return temp;
    }
}
