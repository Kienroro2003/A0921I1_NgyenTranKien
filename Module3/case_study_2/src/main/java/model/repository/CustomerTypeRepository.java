package model.repository;

import model.bean.CustomerType;
import model.bean.Position;

import java.util.List;

public interface CustomerTypeRepository {
    List<CustomerType> selectFindAll();
    CustomerType select_customerType_by_id(int id);
}
