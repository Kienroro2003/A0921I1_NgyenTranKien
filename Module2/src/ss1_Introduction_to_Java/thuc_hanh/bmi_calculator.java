package ss1_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class bmi_calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight(kg) : ");
        float weight = scanner.nextFloat();
        System.out.print("Enter height(m) : ");
        float height = scanner.nextFloat();
        float bmi = weight / (height * height);
        if (bmi < 18.5){
            System.out.print(bmi + " - Underweight");
        }else if(bmi <25){
            System.out.print(bmi+" - Normal");
        }else if(bmi < 30){
            System.out.print(bmi+" - Overweight");
        }else{
            System.out.print(bmi+" - Obese");
        }

    }
}