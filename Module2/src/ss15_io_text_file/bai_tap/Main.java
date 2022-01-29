package ss15_io_text_file.bai_tap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader("src/ss15_io_text_file/bai_tap/countries.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line ;
            while((line = bufferedReader.readLine())!= null){
                System.out.println(printCountry(parseCsvLine(line)));
            }
        }finally {
            fileReader.close();
            bufferedReader.close();
        }
    }

    public static List<String> parseCsvLine(String line){
        List<String> stringList = new ArrayList<>();
        String[] strings = line.split(",");
        for(int i = 0 ; i < strings.length ;i++){
            stringList.add(strings[i]);
        }

        return stringList;
    }

    public static Country printCountry(List<String> string){
        Country country = new Country((Integer.parseInt(string.get(0))), string.get(1), string.get(2) );
        return country;
    }
}
