package ss15_io_text_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while((line = bufferedReader.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();

        }catch (Exception e){

        }

        return numbers;
    }

    public void writeFile(String filePath, int max){
        try {
            FileWriter write = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(write);
            bufferedWriter.write("\n");
            bufferedWriter.write("Gia tri lon nhat: "+max);
            bufferedWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for(int i = 1 ; i < numbers.size() ; i++){
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao duong dan file: ");
        String filePath = scanner.nextLine();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        readAndWriteFile.writeFile(filePath,findMax(readAndWriteFile.readFile(filePath)));
    }


}
