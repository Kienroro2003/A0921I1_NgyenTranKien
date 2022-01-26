package ss13_algorithm_sort.thuc_hanh;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + arr.length + " values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        bubbleSortByStep(arr);
    }

    public static void bubbleSortByStep(int[] arr) {
        boolean needNextPass = true;
        for (int i = 0; i < arr.length - 1 && needNextPass; i++) {
            needNextPass = false;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println("Swap " + arr[i] + " with " + arr[j]);
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the "+i+" sort: ");
            for(int j = 0 ; j < arr.length ;j++){
                System.out.print(arr[j]+"\t");
            }
            System.out.println();
        }
//        boolean needNextPass = true;
//        for (int k = 1; k < arr.length && needNextPass; k++) {
//            needNextPass = false;
//            for (int i = 0; i < arr.length - k; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    /* Swap list[i] with list[i + 1] */
//                    System.out.println("Swap " + arr[i] + " with " + arr[i + 1]);
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//
//                    needNextPass = true; /* Next pass still needed */
//                }
//            }
//            /* Array may be sorted and next pass not needed */
//            if (needNextPass == false) {
//                System.out.println("Array may be sorted and next pass not needed");
//                break;
//            }
//            /* Show the list after sort */
//            System.out.print("List after the  " + k + "' sort: ");
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[j] + "\t");
//            }
//            System.out.println();
//        }
    }
}
