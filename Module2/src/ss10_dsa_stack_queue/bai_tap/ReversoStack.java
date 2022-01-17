package ss10_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ReversoStack {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//
//        Stack<Integer> stack = new Stack<>();
//        for(int i = 0 ; i < arr.length ; i++ ){
//            stack.push(arr[i]);
//        }
////        int [] subArr = new int[arr.length];
//        for ( int i  = 0 ; i < arr.length ;i++){
//            System.out.println(stack.pop());
//        }
        Scanner scanner = new Scanner(System.in);
        String str ;
        System.out.println("Nhap chuoi : ");
        str = scanner.nextLine();
        String[] subString  = str.split("");
        Stack<String> string = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++){
            string.push(subString[i]);
        }
        for(int  i  = 0 ; i < str.length() ; i++){
            subString[i] = string.pop();
        }
        for(int i = 0 ; i < str.length() ; i++){
            System.out.print(subString);
        }


    }
}
