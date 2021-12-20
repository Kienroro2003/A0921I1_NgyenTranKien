package ss2_for_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double money = scanner.nextDouble();
        System.out.print("Enter number of month: ");
        double month = scanner.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for(int i = 0 ; i<month;i++){
            totalInterest += money * (interestRate /100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);

    }
}
