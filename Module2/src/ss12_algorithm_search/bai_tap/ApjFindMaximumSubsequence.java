package ss12_algorithm_search.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class ApjFindMaximumSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String string = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
//        for(int i = 0 ; i < string.length() - 1 ; i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(0));
            for(int j =   1 ; j < string.length() - 1 ; j++){
                if(string.charAt(j) > list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if(list.size() > max.size()){
                max.addAll(list);
//            }
        }
        System.out.print("Ket qua: ");
            for(Character o : max){
                System.out.print(o);
            }
    }

}
