package case_study.task1.controllers;

import case_study.task1.services.Impl.BookingServiceImpl;
import case_study.task1.services.Impl.ContactServiceImpl;

import java.util.Scanner;

public class BookingManagement {
    private static Scanner scanner = new Scanner(System.in);

    public void displayBookingManagementMenu() {
        {
            boolean check = true;
            while (check) {
                System.out.println("1. Add new booking");
                System.out.println("2. Display list booking");
                System.out.println("3. Create new constracts");
                System.out.println("4. Display list contracts");
                System.out.println("5. Edit contracts");
                System.out.println("6. Return main menu");
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
                        new BookingServiceImpl().add();
                        break;
                    }
                    case 2: {
                        new BookingServiceImpl().display();
                        break;
                    }
                    case 3: {
                        new ContactServiceImpl().add();
                        break;
                    }
                    case 4: {
                        new ContactServiceImpl().display();
                        break;
                    }
                    case 5: {

                        break;
                    }
                    case 6: {
                        return;
                    }
                }
            }
        }
    }
}
