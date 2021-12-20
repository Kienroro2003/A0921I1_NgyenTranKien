package ss3_array_loop.Bai_tap;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr;
        int row, col;
        do {
            System.out.print("Enter row : ");
            row = scanner.nextInt();
            System.out.print("Enter col : ");
            col = scanner.nextInt();
        } while (row != col);
        arr = new int[row][col];
        nhap_Mang(arr, row, col);
        xuat_Mang(arr, row, col);
        System.out.println("Sum : " + sum(arr, row, col));
    }

    public static void nhap_Mang(int[][] a, int row, int col) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element arr[" + i + "][" + j + "] : ");
                a[i][j] = scanner.nextInt();
            }
        }
    }

    public static void xuat_Mang(int[][] a, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int sum(int[][] a, int row, int col) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += a[i][i];
        }
        return sum;
    }
}
