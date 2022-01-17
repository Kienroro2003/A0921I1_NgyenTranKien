package ss10_dsa_stack_queue.bai_tap;

import java.util.Objects;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        String bietThuc = "s * (s – a) * s – b) * (s – c) ";
        String[] sub = bietThuc.split("");
        System.out.println(check(sub));

    }

    static boolean check(String[] i) {
        Stack<String> stack = new Stack<>();
        for (String y : i) {
            if (Objects.equals(y, "(")) {
                stack.push(y);
            } else if (y.equals(")") && !stack.isEmpty()) {
                stack.pop();
            } else if (y.equals(")") && stack.isEmpty()) {
                return false;
            }
        }
        if(stack.isEmpty()) {
            return true;
        } else{
            return false;
        }
    }
}
