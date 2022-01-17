package ss10_dsa_stack_queue.thuc_hanh;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class MyGenericStack <T>{
    private LinkedList<T> stack;

    public MyGenericStack() {
        this.stack = new LinkedList<>();
    }

    public MyGenericStack(int a, String b) {
        this.stack = stack;
    }

    public MyGenericStack(String a , int b){}
    public MyGenericStack(int a , int b){}

    public void push(T element){
        stack.addFirst(element);
    }

    public T pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if(stack.size() == 0)return true;
        return false;
    }

    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }
    public static class MyGenericClient{
        public static void main(String[] args) {
            System.out.println("1. Stack of integers");
            stackOfIntegers();
            System.out.println("\n2. Stack of Strings");
            stackOfIStrings();

        }
    }
}
