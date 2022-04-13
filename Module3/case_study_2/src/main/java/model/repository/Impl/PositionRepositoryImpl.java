package model.repository.Impl;

import model.bean.Position;
import model.repository.BaseRepository;
import model.repository.PositionRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepositoryImpl implements PositionRepository {
    private static final String SELECT_ALL_POSITION = "select * from position";
    private static final String SELECT_POSITION_BY_ID = "SELECT * FROM POSITION WHERE POSITION_ID = ?";

    @Override
    public List<Position> selectFindAll() {
        List<Position> positionsList = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_POSITION);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("position_id");
                String name = rs.getString("position_name");
                Position position = new Position(id, name);
                positionsList.add(position);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return positionsList;
    }

    @Override
    public Position select_position_by_id(int id) {
        Position position = null;
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_POSITION_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int positionId = rs.getInt("position_id");
                String positionName = rs.getString("position_name");
                position = new Position(positionId, positionName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return position;
    }
}
