package case_study.task1.controllers;

import case_study.task1.services.Impl.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerManagement {
    private static Scanner scanner = new Scanner(System.in);

    public void displayCustomerMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customers");
            System.out.println("3. Edit customers");
            System.out.println("4. Return main menu");
            System.out.println("Enter choice: ");
            int choice = 0;
            boolean checkLoop = true;
            while (checkLoop) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    checkLoop = false;
                } catch (NumberFormatException ex) {
                    System.out.println("Nhap so cho dung");
                }
            }
            switch (choice) {
                case 1: {
                    new CustomerServiceImpl().display();
                    break;
                }
                case 2: {
                    new CustomerServiceImpl().add();
                    break;
                }
                case 3: {

                    break;
                }
                case 4: {
                    return;
                }
            }
        }
    }
}
