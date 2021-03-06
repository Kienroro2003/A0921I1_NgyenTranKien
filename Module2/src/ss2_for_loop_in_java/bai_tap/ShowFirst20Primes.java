package ss2_for_loop_in_java.bai_tap;

public class ShowFirst20Primes {
    public static boolean checkPrime(int a) {
        if (a < 2) return false;
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
            for(int i = 0;count<20;i++){
                if(checkPrime(i)){
                    System.out.print(i+"\t");
                    count++;
                }
        }
    }
}
