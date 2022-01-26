package ss13_algorithm_sort.thuc_hanh;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void bubbleSort(int[] arr){
        for(int i = 0 ; i < arr.length - 1;i++){
            for(int j = i ; j < arr.length ; j++){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void display(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        bubbleSort(list);
        display(list);
    }
}
