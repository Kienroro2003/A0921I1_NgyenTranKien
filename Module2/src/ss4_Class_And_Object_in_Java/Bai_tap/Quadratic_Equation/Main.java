package ss4_Class_And_Object_in_Java.Bai_tap.Quadratic_Equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number A : ");
        double a = scanner.nextDouble();
        System.out.print("Enter a number B : ");
        double b = scanner.nextDouble();
        System.out.print("Enter a number C : ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant() > 0 ){
            System.out.println("Nghiem thu nhat : "+quadraticEquation.getRoot1());
            System.out.println("Nghiem thu hai : "+quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("Nghiem : "+quadraticEquation.getRoot1());
        }else{
            System.out.println("The equation has no roots");
        }
    }
}
