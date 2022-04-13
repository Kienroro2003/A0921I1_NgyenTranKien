package model.repository;

import model.bean.Position;
import model.bean.Service;

import java.util.List;

public interface ServiceRepository {
    List<Service> selectFindAll();
    Service select_service_by_id(int id);
}
