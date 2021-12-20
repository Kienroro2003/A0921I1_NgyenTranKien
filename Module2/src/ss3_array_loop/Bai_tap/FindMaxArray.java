package ss3_array_loop.Bai_tap;

import java.util.Scanner;

public class FindMaxArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] arr;
        System.out.print("Enter row : ");
        int row = scanner.nextInt();
        System.out.print("Enter col : ");
        int col = scanner.nextInt();
        arr = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.print("Enter element arr["+i+"]["+j+"] : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int max = 0;
        int indexRow = 0,indexCol =0;
        for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    indexCol = j;
                    indexRow = i;
                }
            }
        }
        System.out.println("Value max in array : "+max);
        System.out.println("Index row : "+ indexRow);
        System.out.println("Index col : "+ indexCol);

    }
}
