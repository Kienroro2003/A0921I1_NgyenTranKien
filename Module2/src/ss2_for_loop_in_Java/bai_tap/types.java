package ss2_for_loop_in_Java.bai_tap;

import java.util.Scanner;

public class types {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte choice = -1;
        while(choice !=0){
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.print("Enter choice : ");
            choice = scanner.nextByte();
            switch(choice){
                case 1: {
                    System.out.print("Enter width : ");
                    int width = scanner.nextInt();
                    System.out.print("Enter height : ");
                    int height = scanner.nextInt();
                    for(int i = 0;i<height;i++){
                        for(int j = 0;j<width;j++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                }
                case 2:{
                    System.out.print("Enter height : ");
                    int height = scanner.nextInt();
                    System.out.println("botton-left");
                    for(int i = 0 ;i<height;i++){
                        for(int j = 0;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("top-left");
                    for(int i = 0 ;i<height;i++){
                        for(int j = i;j<height;j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("top-right");
                    for(int i = 0 ;i<height;i++){
                        for(int j = height - i;j<height;j++){
                            System.out.print(" ");
                        }
                        for(int j = i;j<height;j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("top-left");
                    for(int i = 0 ;i<height;i++){
                        for(int j = i;j<height;j++){
                            System.out.print(" ");
                        }
                        for(int j = height - i;j<=height;j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                }
                case 3:{
                    System.out.print("Enter height : ");
                    int height = scanner.nextInt();
                    for(int i = 1;i<=height;i++){
                        for(int j = i;j<height;j++){
                            System.out.print(" ");
                        }
                        for(int j = 0;j<i*2-1;j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                }
                case 4:{
                    System.exit(0);
                }
            }
        }
    }
}
