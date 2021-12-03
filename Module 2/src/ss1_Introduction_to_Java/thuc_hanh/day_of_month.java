package ss1_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class day_of_month {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you to count days?");
        byte month = scanner.nextByte();
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                System.out.print("The month "+month+" has 31 days");
                break;
            }
            case 2:{
                System.out.print("The month '2' has 28 or 29 days");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11:{
                System.out.print("The month "+month+" has 30 days");
            }

        }
    }
}
