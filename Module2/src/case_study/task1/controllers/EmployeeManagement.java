package case_study.task1.controllers;

import case_study.task1.services.Impl.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeManagement {
    private static Scanner scanner = new Scanner(System.in);

    public void displayEmployeeMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display all employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Return menu");
            System.out.println("Enter choice: ");
            boolean checkLoop = true;
            int choice = 0;
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
                    new EmployeeServiceImpl().display();
                    break;
                }
                case 2: {
                    new EmployeeServiceImpl().add();
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
