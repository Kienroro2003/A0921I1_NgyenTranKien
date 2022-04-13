package model.service.Impl;

import model.bean.Contract;
import model.repository.ContractRepository;
import model.repository.Impl.ContractRepositoryImpl;
import model.service.ContractService;

import java.util.List;

public class ContractServiceImpl implements ContractService {
    private ContractRepository contractRepository = new ContractRepositoryImpl();
    @Override
    public List<Contract> selectFindAll() {
        return contractRepository.selectFindAll();
    }

    @Override
    public Contract selectContract(int id) {
        return contractRepository.selectContract(id);
    }

    @Override
    public boolean updateContract(Contract contract) {
        return contractRepository.updateContract(contract);
    }

    @Override
    public boolean deleteContract(int id) {
        return contractRepository.deleteContract(id);
    }

    @Override
    public boolean insertContract(Contract contract) {
        return contractRepository.insertContract(contract);
    }

    @Override
    public List<Contract> search(String search) {
        return null;
    }
}
