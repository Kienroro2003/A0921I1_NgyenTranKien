package case_study.task1.controllers;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public void displayFuramaMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Managerment");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter choice: ");
            boolean checkLoop = false;
            int choiceSecond = 0;
            while (!checkLoop) {
                try {
                    choiceSecond = Integer.parseInt(scanner.nextLine());
                    checkLoop = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Nhập số cho chính xác");
                }
            }
            switch (choiceSecond) {
                case 1: {
                    new EmployeeManagement().displayEmployeeMenu();
                    break;
                }
                case 2: {
                    new CustomerManagement().displayCustomerMenu();
                    break;
                }
                case 3: {
                    new FacilityManagement().displayFacilityMenu();
                    break;
                }
                case 4: {
                    new BookingManagement().displayBookingManagementMenu();
                    break;
                }
                case 5: {
                    new PromotionManagement().displayPromotionMenu();
                    break;
                }
                case 6: {

                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        new FuramaController().displayFuramaMenu();
    }

}

