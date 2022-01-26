package ss11_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ProductManager {
    ArrayList<Product> products ;

    public ProductManager() {
        this.products = (ArrayList<Product>) ProductDao.getProductList();
    }

    public void addList(Product a){
        products.add(a);
    }

    public void displayList(){
        for(Product product : products){
            System.out.println(product);
        }
    }

    public boolean deleteId(String id){
        Product product = this.products.stream().filter(doc -> doc.getId().equals(id)).findFirst().orElse(null);
        if(product == null)return false;
        this.products.remove(product);
        return true;
    }

    public Product edit(String id){
        Product product = this.products.stream().filter(doc -> doc.getId().equals(id)).findFirst().orElse(null);
        return product;
    }

    public Product searchNameProduct(String name){
        Product product = this.products.stream().filter(doc -> doc.getName().equals(name)).findFirst().orElse(null);
        return product;
    }

    public void sortProductPrice(){
        Collections.sort(products,new SortProductPrice());
    }
}
