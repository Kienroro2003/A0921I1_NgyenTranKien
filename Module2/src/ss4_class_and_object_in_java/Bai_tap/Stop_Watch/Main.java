package ss4_class_and_object_in_java.Bai_tap.Stop_Watch;

public class Main {
    public static void hello(int[] arr){
        for(int i = 0; i<arr.length;i++){
            arr[i] = (int)(Math.random()*1000);
        }
        for(int i = 0; i<arr.length - 1;i++){
            for(int j = 0; j <arr.length;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[10000];
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        hello(arr);
        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime());
    }
}
