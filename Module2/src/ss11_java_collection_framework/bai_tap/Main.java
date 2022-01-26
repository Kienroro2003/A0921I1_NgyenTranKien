package ss11_java_collection_framework.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choice = -1;
        while(choice != 0){
            System.out.println("--------------Product Management System--------------");
            System.out.println("1.Them san pham");
            System.out.println("2.Sua thong tin theo id");
            System.out.println("3.Xoa san pham theo id");
            System.out.println("4.Hien thi danh sach san pham");
            System.out.println("5.Tim kiem san pham theo ten");
            System.out.println("6.Sap xep san pham tang dan");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1 : {
                    productManager.addList(inputProduct());
                    break;
                }
                case 2: {
                    Product product = productManager.edit(inputId());
                    if(product != null){
                        changeProduct(product);
                    }
                    break;
                }
                case 3:{
                    System.out.println(productManager.deleteId(inputId()) ? "Success" : "Fail");
                    break;
                }
                case 4: {
                    productManager.displayList();
                    break;
                }
                case 5:{
                    Product product = productManager.searchNameProduct(inputName());
                    if(product != null){
                        System.out.println(product);
                    }else{
                        System.out.println("Ten khong ton tai");
                    }
                }
                case 6:{
                    productManager.sortProductPrice();
                }
            }
        }
    }

    public static Product inputProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id san pham: ");
        String id = scanner.nextLine();
        System.out.println("Nhap ten san pham: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhap gia san pham: ");
        int priceProduct = scanner.nextInt();
        Product product = new Product(id,nameProduct,priceProduct);
        return product;
    }

    public static String inputId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id : ");
        String id ;
        id = scanner.nextLine();
        return id;
    }

    public static void changeProduct(Product product){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        String id = scanner.nextLine();
        System.out.println("Nhap ten san pham: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhap gia: ");
        int priceProduct = scanner.nextInt();
        product.setId(id);
        product.setName(nameProduct);
        product.setPrice(priceProduct);
    }

    public static String inputName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten san pham");
        String nameProduct = scanner.nextLine();
        return nameProduct;
    }

}
