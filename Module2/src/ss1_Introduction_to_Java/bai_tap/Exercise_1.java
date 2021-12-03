package ss1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.print("Hello "+name);
    }
}
