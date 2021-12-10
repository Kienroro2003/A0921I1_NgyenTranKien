package ss3_Array_loop.Bai_tap;

import java.util.Scanner;

public class delete_element_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        System.out.print("Enter a size : ");
        int size = scanner.nextInt();
        arr = new int[size];
        for(int i = 0 ;i<arr.length;i++){
            System.out.print("Enter element "+i+" : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Array start : ");
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        int[] subArr=new int[100];
        int sub = 0;
        System.out.print("Nhap so muon xoa : ");
        int del = scanner.nextInt();
        int positon = 0;
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == del) {
                check = true;
                positon = i;
                break;
            }
        }
        if (check) {
            for (int i = 0; i < arr.length; i++) {
                if (i != positon) {
                    subArr[sub] = arr[i];
                    sub++;
                }
            }
            for(int i = 0 ; i<sub;i++){
                System.out.print(subArr[i]+"\t");
            }
        }else{
            System.out.println("No");
        }



    }

}
