package ss10_dsa_stack_queue.thuc_hanh;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        System.out.println(queue.dequeue());
        queue.dequeue();
        System.out.println(queue.dequeue());
        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.enqueue(50);
//        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
