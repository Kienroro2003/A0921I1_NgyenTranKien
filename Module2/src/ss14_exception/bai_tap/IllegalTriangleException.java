package ss14_exception.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void isTriangle(int a , int b, int c){
        try{
            if(a + b < c || a + c < b || b + c < a){
                throw new IllegalArgumentException("It not a triangle");
            }else{
                System.out.println("It a triangle");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap canh b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap canh c: ");
        int c = scanner.nextInt();
        isTriangle(a,b,c);
    }
}
