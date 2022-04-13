package model.repository.Impl;

import model.bean.CustomerType;
import model.bean.Position;
import model.repository.BaseRepository;
import model.repository.CustomerTypeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepositoryImpl implements CustomerTypeRepository {
    private static final String SELECT_FIND_ALL = "SELECT * FROM customer_type;";
    private static final String SELECT_CUSTOMERTYPE_BY_ID = "SELECT * FROM customer_type WHERE customer_type_id = ?";

    @Override
    public List<CustomerType> selectFindAll() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FIND_ALL);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                int id = rs.getInt("customer_type_id");
                String name = rs.getString("customer_type_name");
                CustomerType customerType = new CustomerType(id,name);
                customerTypeList.add(customerType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerTypeList;
    }

    @Override
    public CustomerType select_customerType_by_id(int id) {
        Connection connection = BaseRepository.getConnection();
        CustomerType customerType = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMERTYPE_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                String name = rs.getString("customer_type_name");
                customerType = new CustomerType(id,name);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerType;
    }
}
