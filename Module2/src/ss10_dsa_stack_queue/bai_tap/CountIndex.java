package ss10_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.TreeMap;

public class CountIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        name = scanner.nextLine();
        String[] subName = name.split("");
        int count = 0;
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        for ( int i = 0 ; i < name.length() ; i++){
            if(treeMap.containsKey(subName[i])){
                int value = treeMap.get(subName[i]);
                treeMap.put(subName[i],++value);
            }else{
                treeMap.put(subName[i],1);
            }
        }
        for(String element : treeMap.keySet()){
            System.out.println(treeMap.get(element));
        }

    }


}
