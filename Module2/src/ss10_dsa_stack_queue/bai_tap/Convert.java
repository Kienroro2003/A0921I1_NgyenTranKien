package ss10_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int num = scanner.nextInt();
        Stack<Integer> stackNum = new Stack<>();
        while(num>0){
            int temp = num%2;
            stackNum.push(temp);
            num /= 2;
        }
        while(!stackNum.isEmpty()){
            System.out.print(stackNum.pop());
        }

    }
}
