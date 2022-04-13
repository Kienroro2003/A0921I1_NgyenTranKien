package model.service.Impl;

import model.bean.Service;
import model.repository.Impl.ServiceRepositoryImpl;
import model.repository.ServiceRepository;
import model.service.ServiceService;

import java.util.List;

public class ServiceServiceImpl implements ServiceService {
    private ServiceRepository serviceRepository = new ServiceRepositoryImpl();
    @Override
    public List<Service> selectFindAll() {
        return serviceRepository.selectFindAll();
    }

    @Override
    public Service select_service_by_id(int id) {
        return serviceRepository.select_service_by_id(id);
    }
}
