package ss3_array_loop.Bai_tap;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] arr;
        System.out.print("Enter a row : ");
        int row = scanner.nextInt();
        System.out.print("Enter a col : ");
        int col = scanner.nextInt();
        arr = new int[row][col];
        nhap_Mang(arr,row,col);
        xuat_Mang(arr,row,col);
        System.out.print("Enter index col sum : ");
        int index = scanner.nextInt();
        System.out.println("Result col "+index+" : "+sum_col(arr,index,row));
    }
    public static void nhap_Mang(int[][] a,int row,int col){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print("Enter element arr["+i+"]["+j+"] : ");
                a[i][j]=scanner.nextInt();
            }
        }
    }
    public static void xuat_Mang(int[][] a,int row,int col){
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static int sum_col(int[][] a,int indexCol,int row){
        int sum = 0;
        for(int i = 0;i<row;i++){
            sum += a[i][indexCol];
        }
        return sum;
    }
}
