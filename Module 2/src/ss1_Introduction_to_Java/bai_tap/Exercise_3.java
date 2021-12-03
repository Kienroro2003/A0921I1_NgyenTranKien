package ss1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args){
        final int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tien USD : ");
        float moneyUSD = scanner.nextInt();
        float moneyVN = rate * moneyUSD;
        System.out.print("Ket qua : "+moneyVN);
    }
}
