package ss16_io_binary_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void write(String path, List<Product> products){
        File file = new File(path);
        FileOutputStream fileInputStream = null;
        ObjectOutputStream objectInputStream = null;
        try{
            fileInputStream = new FileOutputStream(file);
            objectInputStream = new ObjectOutputStream(fileInputStream);
            objectInputStream.writeObject(products);
            fileInputStream.close();
            objectInputStream.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public static List<Product> read(String path){
        List<Product> list = new ArrayList<>();
        File file = new File(path);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try{
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();
        }catch(IOException e){
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<Product> listProducts = new ArrayList<>();
        listProducts.add(new Product(1,"Quan","LVT",10000));
        listProducts.add(new Product(1,"Quan","LVT",10000));
        listProducts.add(new Product(1,"Quan","LVT",10000));
        listProducts.add(new Product(1,"Quan","LVT",10000));
        write("src/ss16_io_binary_file/bai_tap/product.txt",listProducts);
        List<Product> subListProduct = read("src/ss16_io_binary_file/bai_tap/product.txt");
        for(Product product : subListProduct){
            System.out.println(product);
        }
    }
}
