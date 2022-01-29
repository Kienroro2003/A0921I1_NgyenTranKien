package ss15_io_text_file.bai_tap;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileOutputStream fileOutputStream = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src/ss15_io_text_file/bai_tap/textin.txt");
            bufferedReader = new BufferedReader(fileReader);
            fileOutputStream = new FileOutputStream("src/ss15_io_text_file/bai_tap/textout.txt");
//            System.out.println(bufferedReader.readLine());
            byte[] i = bufferedReader.readLine().getBytes();
            fileOutputStream.write(i);
            fileOutputStream.flush();
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            fileReader.close();
            fileOutputStream.close();
        }
    }
}
