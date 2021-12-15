package ss3_Array_loop.Bai_tap;

import java.util.Scanner;

public class FindMinArray {
    public static void main(String[] args){
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size : ");
        int size = scanner.nextInt();
        array = new int[size];
        for(int i = 0 ;i<size;i++){
            System.out.print("Enter element "+i+" : ");
            array[i] = scanner.nextInt();
        }
        for(int i = 0 ;i<size;i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        int min = array[0];
        for (int i = 1;i<array.length;i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Element min in array : "+min);

    }
}
