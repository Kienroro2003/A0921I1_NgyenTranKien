package ss10_dsa_stack_queue.bai_tap;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        name = name.toLowerCase();
        String[] arrName = name.split("");
        Stack<String> stackName = new Stack<>();
        Queue<String> queueName = new LinkedList<>();
        for(int i = 0 ; i< arrName.length;i++){
            stackName.push(arrName[i]);
            queueName.offer(arrName[i]);
        }
        boolean result =true;
        while(!stackName.isEmpty()){
            if(!Objects.equals(stackName.pop(), queueName.poll())){
                result = false;
                break;
            }
        }
        if(result){
            System.out.println("chuoi vua nhap la Palindrome");
        }else {
            System.out.println("khong phai la Palindrome");
        }
//        System.out.println(result);
    }
}
