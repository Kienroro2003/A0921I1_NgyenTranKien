package case_study.task1.models;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu(){
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("------------------------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter choice : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("1. Display list employees");
                    System.out.println("2. Add new employee");
                    System.out.println("3. Edit employee");
                    System.out.println("4. Return main menu");
                    break;
                }
                case 2:{
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customer");
                    System.out.println("3. Edit employee");
                    System.out.println("4. Return main menu");
                    break;
                }
                case 3:{
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customer");
                    System.out.println("3. Edit employee");
                    System.out.println("4. Return main menu");
                    break;
                }
                case 4:{
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customer");
                    System.out.println("3. Edit employee");
                    System.out.println("4. Return main menu");
                    break;
                }
                case 5:{
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customer");
                    System.out.println("3. Edit employee");
                    System.out.println("4. Return main menu");
                    break;
                }
                case 6:{
                    System.exit(0);
                }
            }
        }while(choice != 0);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
