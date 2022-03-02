package case_study.task1.controllers;

import case_study.task1.services.Impl.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityManagement {
    private static Scanner scanner = new Scanner(System.in);

    public void displayFacilityMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            System.out.println("Enter choice: ");
            boolean checkLoop = true;
            int choice = 0;
            while (checkLoop) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    checkLoop = false;
                } catch (NumberFormatException ex) {
                    System.out.println("Nhap lai cho dung");
                }
            }
            switch (choice) {
                case 1: {
                    new FacilityServiceImpl().display();
                    break;
                }
                case 2: {
                    new FacilityServiceImpl().add();
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
