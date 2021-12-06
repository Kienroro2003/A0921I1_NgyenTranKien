package ss3_Array_loop.Thuc_hanh;

import java.util.Scanner;

public class find_minimum {
    public static int minValue(int[] arr) {
        int index = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[index]>arr[i]){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}
