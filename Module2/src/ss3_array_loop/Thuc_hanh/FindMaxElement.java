package ss3_array_loop.Thuc_hanh;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size : ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20 ");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Property list : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int max = 0;
        int count = 0;
        for(int i = 0 ;i<array.length;i++){
            if(max < array[i]){
                max = array[i];
                count = i;
            }
        }
        System.out.println();
        System.out.println("The largest proprety value in the list is "+max+" , at position : "+count);
    }
}
