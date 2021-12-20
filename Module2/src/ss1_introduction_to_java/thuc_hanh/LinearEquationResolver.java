package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args){
        System.out.print("Linear Equation Resolver");
        System.out.println("Give a equation as 'ax + b = c', please enter constants");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a : ");
        double a = scanner.nextDouble();
        System.out.print("Enter number b : ");
        double b = scanner.nextDouble();
        System.out.print("Enter number c : ");
        double c = scanner.nextDouble();
        if(a != 0){
            double answer = (c - b) / a;
            System.out.print("Equation pass width x = " +answer+"!\n");
        }else{
            if(b == c ){
                System.out.print("The solution is all x!");
            }else{
                System.out.print("No solution");
            }
        }

    }
}
