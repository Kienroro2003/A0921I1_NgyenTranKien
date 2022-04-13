package model.service;

import model.bean.Customer;
import model.bean.Employee;

import java.util.List;

public interface CustomerService {
    List<Customer> selectFindAll();
    Customer selectCustomer(int id);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(int id);
    List<String> insertCustomer(Customer customer);
    List<Customer> search(String search);
}
