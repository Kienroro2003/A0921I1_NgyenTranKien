package ss13_algorithm_sort.bai_tap;

public class InsertionSort {
    private static int[] list ={1, 9, 4, 6, 5, 43};

    public static void insertionSort(int[] arr) {
        //int[] arr = {1, 12, 4, 3, 254, 432, 1232, 444};
        int pos;
        int x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && arr[pos - 1] > x) {
                System.out.println("pos = " + pos + " x = " + x + "  arr[pos] = " + arr[pos]);
                display(arr);
                System.out.println();
                arr[pos] = arr[pos - 1];
                pos--;
                display(arr);
                System.out.println();
            }
            System.out.println("pos = "+pos);
            arr[pos] = x;
            display(arr);
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
        }
    }

    public static void display(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
    }
}
