package ss3_Array_loop.Bai_tap;

import java.util.Scanner;

public class count_student {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int count = 0;
        System.out.print("Enter a size : ");
        int size = scanner.nextInt();
        array = new int[size];
        for(int i = 0 ;i < array.length;i++){
            System.out.print("Enter a element "+i+" : ");
            array[i]=scanner.nextInt();
        }
        System.out.print("List of mark : ");
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+"\t");
            if(array[i]>=5 && array[i]<=10){
                count++;
            }
        }
        System.out.println();
        System.out.print("The number of students passing the exam is " + count);
    }

}
