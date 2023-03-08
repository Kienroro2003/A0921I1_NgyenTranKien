package ss9_dsa_list.thuc_hanh;

public class MyList <T>{
    class Node<T>{
        T value;
        Node<T> next;

        public Node() {
        }

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    Node<T> head;
    int size;

    public MyList() {
        size = 0;
    }

    public void add(T val){
        if(size == 0){
            head = new Node<>(val);
        }else{
            Node<T> newNode = new Node<>(val);
            head.next = newNode;
        }
        size++;
    }

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        System.out.println("Head: " + myList.head.value);
        myList.head = myList.head.next;
        System.out.println("next: " + myList.head.value);
        System.out.println("last: " + myList.head.next);
    }
}


