package ss3_array_loop.Bai_tap;

import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int[] subArr = new int[100];
        int sub =0;
        System.out.print("Enter a size : ");
        int size = scanner.nextInt();
        arr = new int[size];
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter element "+i+" : ");
            arr[i] = scanner.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] +"\t");
        }
        System.out.println();
        System.out.print("Index add : ");
        int index = scanner.nextInt();
        System.out.print("Number add : ");
        int number = scanner.nextInt();
        for(int i = 0;i<arr.length;i++){
            if(i == index){
                sub++;
            }
            subArr[sub]=arr[i];
            sub++;
        }
        subArr[index] = number;
        for(int i = 0;i<sub;i++){
            System.out.print(subArr[i]+"\t");
        }

    }
}
