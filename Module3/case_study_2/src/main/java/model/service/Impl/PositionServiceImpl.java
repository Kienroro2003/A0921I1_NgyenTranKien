package model.service.Impl;

import model.bean.Position;
import model.repository.Impl.PositionRepositoryImpl;
import model.repository.PositionRepository;
import model.service.PositionService;

import java.util.List;

public class PositionServiceImpl implements PositionService {
    private PositionRepository positionRepository = new PositionRepositoryImpl();
    @Override
    public List<Position> selectFindAll() {
        return positionRepository.selectFindAll();
    }

    @Override
    public Position selectPositionById(int id) {
        return positionRepository.select_position_by_id(id);
    }
}
