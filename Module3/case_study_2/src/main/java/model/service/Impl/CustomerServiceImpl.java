package model.service.Impl;

import common.Validation;
import model.bean.Customer;
import model.repository.CustomerRepository;
import model.repository.Impl.CustomerRepositoryImpl;
import model.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> selectFindAll() {
        return customerRepository.selectFindAll();
    }

    @Override
    public Customer selectCustomer(int id) {
        return customerRepository.selectCustomer(id);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return customerRepository.deleteCustomer(id);
    }

    @Override
    public List<String> insertCustomer(Customer customer) {
        List<String> stringList = new ArrayList<>();
        boolean check = true;
        if(Validation.checkName(customer.getCustomerName())){
            stringList.add("");
        }else{
            check = false;
            stringList.add("Tên sai định dạng");
        }

        if(Validation.checkIdCard(customer.getCustomerIdCard())){
            stringList.add("");
        }else{
            check = false;
            stringList.add("CMND sai định dạng");
        }

//        if(Validation.positiveNumbers(String.valueOf(employee.getEmployeeSalary()))){
//            stringList.add("");
//        }else{
//            check = false;
//            stringList.add("Lương sai định dạng");
//        }

        if(Validation.checkPhone(String.valueOf(customer.getCustomerPhone()))){
            stringList.add("");
        }else{
            check = false;
            stringList.add("Số điện thoại sai định dạng");
        }

        if(Validation.checkEmail(customer.getCustomerEmail())){
            stringList.add("");
        }else{
            check = false;
            stringList.add("Email sai định dạng");
        }
        if(check){
            customerRepository.insertCustomer(customer);
        }

        return stringList;
    }

    @Override
    public List<Customer> search(String search) {
        return customerRepository.search(search);
    }
}
