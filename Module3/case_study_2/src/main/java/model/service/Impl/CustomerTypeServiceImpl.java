package model.service.Impl;

import model.bean.CustomerType;
import model.repository.CustomerTypeRepository;
import model.repository.Impl.CustomerTypeRepositoryImpl;
import model.service.CustomerTypeService;

import java.util.List;

public class CustomerTypeServiceImpl implements CustomerTypeService {
    private CustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl();
    @Override
    public List<CustomerType> selectFindAll() {
        return customerTypeRepository.selectFindAll();
    }

    @Override
    public CustomerType select_customerType_by_id(int id) {
        return customerTypeRepository.select_customerType_by_id(id);
    }
}
