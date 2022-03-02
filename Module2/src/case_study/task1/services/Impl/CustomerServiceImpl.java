package case_study.task1.services.Impl;

import case_study.task1.models.Customer;
import case_study.task1.services.CustomerService;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    static List<Customer> listCustomer = new LinkedList<>();

    static {
        listCustomer.add(new Customer("06/01/2003", "Kien", "nam", 1,
                0123123123, 1231313, "kienroro281@gmail.com",
                12313, "Vip", "Da Nang"));
        listCustomer.add(new Customer("06/01/2003", "Kien", "nam", 12, 0123123123, 0123123123, "kienroro281@gmail.com", 12313, "Vip", "Da Nang"));
        listCustomer.add(new Customer("06/01/2003", "Kien", "nam", 123, 0123123123, 0123123123, "kienroro281@gmail.com", 12313, "Vip", "Da Nang"));
        listCustomer.add(new Customer("06/01/2003", "Kien", "nam", 1234, 0123123123, 0123123123, "kienroro281@gmail.com", 12313, "Vip", "Da Nang"));
    }

    @Override
    public void display() {
        for (Customer customer : listCustomer) {
            System.out.println(customer.toString());
        }
    }

    //String date, String name, String gender, int ID, int numberPhone, String email, int customerCode, String customerType, String address

    @Override
    public void add() {
        System.out.println("Nhap ngay sinh:");
        String date = scanner.nextLine();
        System.out.println("Nhap ho va ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so dien thoai: ");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap dia chi email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap ma khach hang: ");
        int customerCode = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap CMND: ");
        int idPerson = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap loai khach hang: ");
        String customerType = scanner.nextLine();
        System.out.println("Nhap dia chi khach hang: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(date, name, gender, id, customerCode, numberPhone, email, idPerson, customerType, address);
        listCustomer.add(customer);
        System.out.println("Them moi thanh cong");
    }
}
