package ss2_for_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class GreateCommonFactor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a : ");
        int a = scanner.nextInt();
        System.out.print("Enter number b : ");
        int b = scanner.nextInt();
        int result = 0;
        for(int i = 1;i<=a;i++){
            if(a % i == 0 && b % i ==0){
                result = i;
            }
        }
        if ( a == 0 || b == 0){
            System.out.println("No greatest common factor");
        }else{
            System.out.println("Greatest common factor: " + result);
        }
    }
}
