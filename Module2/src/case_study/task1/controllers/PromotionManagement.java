package case_study.task1.controllers;

import java.util.Scanner;

public class PromotionManagement {
    private static Scanner scanner = new Scanner(System.in);

    public void displayPromotionMenu(){
        boolean check = true;
        while(check){
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            boolean checkLoop = true;
            int choice = 0;
            while(checkLoop) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    checkLoop = false;
                } catch (NumberFormatException ex) {
                    System.out.println("Nhap so cho dung");
                }
            }
            switch(choice){
                case 1:{

                    break;
                }
                case 2:{

                    break;
                }
                case 3:{
                    return;
                }
            }
        }
    }
}
