package ss3_Array_loop.Bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr1;
        int[] arr2;
        System.out.print("Enter a size of arr1 : ");
        int size1 = scanner.nextInt();
        arr1 = new int[size1];
        System.out.print("Enter a size of arr2 : ");
        int size2 = scanner.nextInt();
        arr2 = new int[size2];
        for(int i = 0;i<size1;i++){
            System.out.print("Enter element "+i+" of arr1 : ");
            arr1[i]=scanner.nextInt();
        }
        for(int i = 0;i<size2;i++){
            System.out.print("Enter element "+i+" of arr2 : ");
            arr2[i]=scanner.nextInt();
        }
        System.out.print("Arr1 : ");
        for(int i =0;i<arr1.length;i++){
            System.out.print(arr1[i]+"\t");
        }
        System.out.print("Arr2 : ");
        for(int i =0;i<arr2.length;i++){
            System.out.print(arr2[i]+"\t");
        }
        int[] arr3 = new int[arr2.length + arr1.length];
        for(int i = 0;i<arr1.length;i++){
            arr3[i] = arr1[i];
        }
        for(int i = arr1.length,j = 0;i<arr3.length;i++,j++){
            arr3[i] = arr2[j];
        }
        for(int i = 0;i<arr3.length;i++){
            System.out.print(arr3[i]+"\t");
        }
    }
}
