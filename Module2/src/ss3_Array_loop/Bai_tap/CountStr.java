package ss3_Array_loop.Bai_tap;

import java.util.Scanner;

public class CountStr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String myStr = scanner.nextLine();
//        System.out.print("Enter a char : ");
        char x = 'n';
        int count = 0;
        for(int i = 0;i < myStr.length();i++){
            if(x == myStr.charAt(i)){
                count++;
            }
        }
        System.out.println("So lan "+x+" xuat hien :" + count);
//        System.out.println(myStr.charAt(0));
    }
}
