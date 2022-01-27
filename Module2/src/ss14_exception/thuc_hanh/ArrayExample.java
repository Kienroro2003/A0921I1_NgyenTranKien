package ss14_exception.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nVui long nhap chi so cua mot phan tu bat ki ");
        int x = scanner.nextInt();

        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chi so vuot qua gioi han cua mang");
        }
    }
}
