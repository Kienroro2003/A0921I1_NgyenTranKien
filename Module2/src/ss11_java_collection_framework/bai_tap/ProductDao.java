package ss11_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private static List<Product> productList ;

    static {
        productList = new ArrayList<>();
        productList.add(new Product("12","Nuoc rua mat", 120000));
        productList.add(new Product("12a","Nuoc hoa", 100000));
        productList.add(new Product("12b","Nuoc mam", 1020000));
    }

    public static List<Product> getProductList(){
        return productList;
    }
}
