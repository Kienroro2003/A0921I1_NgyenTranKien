package ss2_for_loop_in_Java.bai_tap;

public class show_20_pri {
    public static boolean checkPrimte(int a){
        if(a<2)return false;
        for(int i = 2;i<=Math.sqrt(a);i++){
            if(a % i ==0)return false;
        }
        return true;
    }
    public static void main(String[] args){
        for(int i = 2; i<=100;i++){
            if(checkPrimte(i)){
                System.out.print(i + "\t");
            }
        }
    }
}
