package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Exercise2tt {
    public static void main(String[] args) {
        String[] a = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", ""};
        String[] b = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        short num = scanner.nextShort();
        if (num % 100 < 20) {
            System.out.print(a[num]);
        } else {
            String unitStr = "";
            String dozenStr = "";
            unitStr = a[num % 10];
            num /= 10;
            dozenStr = b[num % 10];
            num /= 10;
            if (num == 0) {
                System.out.print(dozenStr + " " + unitStr);
            } else {
                System.out.print(a[num] + " hundred " + dozenStr + " " + unitStr);
            }
        }

    }


}
