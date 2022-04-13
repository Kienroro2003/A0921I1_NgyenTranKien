package model.repository;

import model.bean.Position;

import java.util.List;

public interface PositionRepository {
    List<Position> selectFindAll();
    Position select_position_by_id(int id);
}
