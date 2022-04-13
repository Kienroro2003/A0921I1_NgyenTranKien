package model.repository.Impl;

import model.bean.Customer;
import model.bean.Employee;
import model.repository.BaseRepository;
import model.repository.CustomerRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private static final String SELECT_ALL_CUSTOMER = "SELECT * FROM customer;";
    private static final String INSERT_CUSTOMER ="INSERT INTO CUSTOMER(customer_name,customer_birthday,custmer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_id) values(?,?,?,?,?,?,?,?);";
    private static final String SELECT_CUSTOMER_BY_ID = "SELECT * FROM CUSTOMER WHERE customer_id = ?";
    private static final String DELETE_EMPLOYEE_BY_ID = "DELETE FROM CUSTOMER WHERE CUSTOMER_ID = ?";
    private static final String UPDATE_EMPLOYEE = "UPDATE CUSTOMER SET customer_name = ?, customer_birthday = ?, custmer_gender = ?, customer_id_card=?,customer_phone=?,customer_email=?,customer_address=?,customer_type_id=? where customer_id = ?;";
    private static final String SEARCH_BY_NAME ="SELECT * FROM CUSTOMER WHERE customer_name like ?";
    @Override
    public List<Customer> selectFindAll() {
        Connection connection = BaseRepository.getConnection();
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("customer_id");
                int typeId = rs.getInt("customer_type_id");
                String name = rs.getString("customer_name");
                String birthday = rs.getString("customer_birthday");
                boolean gender = rs.getBoolean("custmer_gender");
                String id_card = rs.getString("customer_id_card");
                String phone = rs.getString("customer_phone");
                String email = rs.getString("customer_email");
                String address = rs.getString("customer_address");
                Customer customer = new Customer(id,name,birthday,gender,id_card,phone,email,address,typeId);
                customerList.add(customer);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public Customer selectCustomer(int id) {
        Customer customer = null;
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                int typeId = rs.getInt("customer_type_id");
                String name = rs.getString("customer_name");
                String birthday = rs.getString("customer_birthday");
                boolean gender = rs.getBoolean("custmer_gender");
                String id_card = rs.getString("customer_id_card");
                String phone = rs.getString("customer_phone");
                String email = rs.getString("customer_email");
                String address = rs.getString("customer_address");
                customer = new Customer(id,name,birthday,gender,id_card,phone,email,address,typeId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        //private static final String UPDATE_EMPLOYEE = "UPDATE EMPLOYEE SET
        // customer_name = ?,
        // customer_birthday = ?,
        // custmer_gender = ?,
        // customer_id_card=?,
        // customer_phone=?,
        // customer_email=?,
        // customer_address=?,
        // customer_type_id=?
        // where customer_id =?;";
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE);
            preparedStatement.setString(1,customer.getCustomerName());
            preparedStatement.setDate(2, Date.valueOf(customer.getCustomerBirthday()));
            preparedStatement.setBoolean(3,customer.isCustomerGender());
            preparedStatement.setString(4,customer.getCustomerIdCard());
            preparedStatement.setString(5,customer.getCustomerPhone());
            preparedStatement.setString(6,customer.getCustomerEmail());
            preparedStatement.setString(7,customer.getCustomerAddress());
            preparedStatement.setInt(8,customer.getCustomerTypeId());
            preparedStatement.setInt(9,customer.getCustomerId());
            return preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteCustomer(int id) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1,id);
            return preparedStatement.executeUpdate() >0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean insertCustomer(Customer customer) {

        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER);
            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setDate(2, Date.valueOf(customer.getCustomerBirthday()));
            preparedStatement.setBoolean(3, customer.isCustomerGender());
//            preparedStatement.setDouble(4, employee.getEmployeeSalary());
            preparedStatement.setString(4, customer.getCustomerIdCard());
            preparedStatement.setString(5, customer.getCustomerPhone());
            preparedStatement.setString(6, customer.getCustomerEmail());
            preparedStatement.setString(7, customer.getCustomerAddress());
            preparedStatement.setInt(8, customer.getCustomerTypeId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Customer> search(String search) {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BY_NAME);
            preparedStatement.setString(1,"%"+search+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                int id = rs.getInt("customer_id");
                int typeId = rs.getInt("customer_type_id");
                String name = rs.getString("customer_name");
                String birthday = rs.getString("customer_birthday");
                boolean gender = rs.getBoolean("custmer_gender");
                String id_card = rs.getString("customer_id_card");
                String phone = rs.getString("customer_phone");
                String email = rs.getString("customer_email");
                String address = rs.getString("customer_address");
                Customer customer = new Customer(id,name,birthday,gender,id_card,phone,email,address,typeId);
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
