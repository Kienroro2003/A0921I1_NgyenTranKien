package model.service;

import model.bean.Contract;

import java.util.List;

public interface ContractService {
    List<Contract> selectFindAll();
    Contract selectContract(int id);
    boolean updateContract(Contract contract);
    boolean deleteContract(int id);
    boolean insertContract(Contract contract);
    List<Contract> search(String search);
}
