package model.repository.Impl;

import model.bean.Position;
import model.bean.Service;
import model.repository.BaseRepository;
import model.repository.ServiceRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryImpl implements ServiceRepository {
    private static final String SELECT_FIND_ALL ="SELECT * FROM SERVICE;";
    private static final String SELECT_SERVICE_BY_ID = "SELECT * FROM SERVICE WHERE SERVICE_ID =?;";

    @Override
    public List<Service> selectFindAll() {
        List<Service> serviceList = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FIND_ALL);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                int id = rs.getInt("service_id");
                String name = rs.getString("serive_name");
                int area = rs.getInt("service_area");
                double cost = rs.getDouble("service_cost");
                int maxPeople = rs.getInt("service_max_people");
                String standard_room = rs.getString("standard_room");
                String descriptionOtherConveniece = rs.getString("description_other_conveniece");
                double poolArea = rs.getDouble("pool_area");
                int numberOfFloor = rs.getInt("number_of_floors");
                Service service = new Service(id,name,area,cost,maxPeople,standard_room,descriptionOtherConveniece,poolArea,numberOfFloor);
                serviceList.add(service);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceList;
    }

    @Override
    public Service select_service_by_id(int id) {
        Service service = null;
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SERVICE_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int byId = rs.getInt("service_id");
                String name = rs.getString("serive_name");
                int area = rs.getInt("service_area");
                double cost = rs.getDouble("service_cost");
                int maxPeople = rs.getInt("service_max_people");
                String standard_room = rs.getString("standard_room");
                String descriptionOtherConveniece = rs.getString("description_other_conveniece");
                double poolArea = rs.getDouble("pool_area");
                int numberOfFloor = rs.getInt("number_of_floors");
                service = new Service(byId, name,area,cost,maxPeople,standard_room,descriptionOtherConveniece,poolArea,numberOfFloor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return service;
    }
}
