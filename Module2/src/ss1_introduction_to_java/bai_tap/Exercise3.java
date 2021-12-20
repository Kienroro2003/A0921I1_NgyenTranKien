package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        final int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tien USD : ");
        float moneyUSD = scanner.nextInt();
        float moneyVN = rate * moneyUSD;
        System.out.print("Ket qua : "+moneyVN);
    }
}
