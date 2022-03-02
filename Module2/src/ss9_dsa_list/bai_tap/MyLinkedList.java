package ss9_dsa_list.bai_tap;

import java.util.LinkedList;

public class MyLinkedList<E> {
    class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public void addFirst(E element) {
        //khai bao 1 bien temp tham chieu den gia tri cua head
        Node temp = head;
        //biến head sẽ nhận giá trị của 1 node mới
        head = new Node(element);
        //head.next trỏ tới next tiếp
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp = new Node(element);
        numNodes++;
    }

    public void add(E element, int index) {
        //khai bao bien temp tro den head
        Node temp = head;
        Node holder;

        //cho con tro chay tu vi tri index - 1
        for (int i = 0; i < index - 1 || temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.data = new Node(element);
        temp.next = holder;
        numNodes++;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNodes;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error index: " + index);
        }

        Node temp = head;

        Object data;

        //nếu index = 0 thì trả về case_study_new.data hiện tại
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        //remove đối tượng nếu element head
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            //khai bao 1 Node temp tro den head
            Node temp = head;
            while (temp.next != null) {
                //nếu tồn tại một phần tử có case_study_new.data bằng case_study_new.data truyền vào thì node đó sẽ bị r
                if (temp.next.data.equals(element)) {
                    temp = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        //kiểm tra linkedlist có phần tử hay
        if (numNodes == 0) {
            throw new IllegalArgumentException("LinkedList này null");
        }
        //Khai báo linkedlist trả
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        //Khai báo một temp trỏ đến head
        Node temp = head;
        //add temp vào danh sách trả về để nó làm head
        returnLinkedList.addFirst((E) temp);
        temp = temp.next;
        while (temp != null) {
            returnLinkedList.addFirst((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    public boolean constrains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element){
        Node temp = head;
        for(int i = 0 ; i < numNodes ; i++){
            if(temp.data.equals(element)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public E getFirst(){
        Node temp = head;
        if(temp == null){
            throw new IllegalArgumentException("Error head null");
        }
        return (E) temp.data;

    }

    public E getLast(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear(){
        Node temp = head;
        temp.next = null;
        temp.data = null;
        numNodes = 0;
    }
}