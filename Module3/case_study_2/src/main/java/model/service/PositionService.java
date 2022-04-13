package model.service;

import model.bean.Position;

import java.util.List;

public interface PositionService {
    List<Position> selectFindAll();
    Position selectPositionById(int id);
}
