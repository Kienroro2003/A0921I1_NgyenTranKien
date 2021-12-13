package ss3_Array_loop.Thuc_hanh;

import java.util.Scanner;

public class FindElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input_name = {"Tran Phuoc Thinh", "Nguyen Tran Kien", "Tran Phuoc Thang", "Tran Phuoc Tien", "Tran Thi Dung", "Nguyen Van tien"};
        System.out.print("Enter a name's student : ");
        String name = scanner.nextLine();
        boolean isExist = false;
        for(int i = 0;i<input_name.length;i++){
            if(name.equals(input_name[i])){
                System.out.println("Position of the students in the list "+name+" is : "+i);
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Not found "+name+" in the list.");
        }

    }
}
