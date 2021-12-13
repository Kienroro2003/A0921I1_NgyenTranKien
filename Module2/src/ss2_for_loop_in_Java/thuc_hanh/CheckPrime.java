package ss2_for_loop_in_Java.thuc_hanh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();
        boolean checkPrime = true;
        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num % i == 0)checkPrime = false;
        }
        if(checkPrime){
            System.out.println(num + " is prime");
        }else{
            System.out.println(num + " is NOT prime");
        }
    }
}
