package ss15_io_text_file.thuc_hanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    private static final String PATH = "/Users/kienroro2003/Documents/CodeGym/A0921I1_NgyenTranKien/Module2/src/ss15_io_text_file/thuc_hanh/text.txt";

    public void readFileExample(String filePath) {
        try {

            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tong: " + sum);
        } catch (Exception e) {
            System.err.println("File khong ton tai or noi dung file loi");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap duong dan: ");
        String path = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileExample(path);
    }
}
