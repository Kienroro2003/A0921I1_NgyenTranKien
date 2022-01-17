package ss10_dsa_stack_queue.thuc_hanh;

import groovy.json.JsonOutput;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0 ;
    private int tail = -1;
    private int currentSize = 0;
    private boolean status = false;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        this.queueArr = new int[this.capacity];
    }

    public boolean isQueueFull(){
        if(capacity == currentSize)status = false;
        return status;
    }

    public boolean isQueueEmpty(){
        if(currentSize == 0)status = false;
        return status;
    }

    public void enqueue(int item){
        if(isQueueFull()){
            System.out.println("Overflow ! Unable to add element: " + item);
        }else{
            tail++;
            if(tail == capacity - 1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    public void dequeue(){
        if(isQueueEmpty()){
            System.out.println("Underflow ! Unable to remove element from Queue");
        }else{
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }
}
