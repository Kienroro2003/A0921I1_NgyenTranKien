package model.service;

import model.bean.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> selectFindAll();
    CustomerType select_customerType_by_id(int id);
}
