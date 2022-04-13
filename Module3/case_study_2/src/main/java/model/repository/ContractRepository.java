package model.repository;

import model.bean.Contract;
import model.bean.Customer;

import java.util.List;

public interface ContractRepository {
    List<Contract> selectFindAll();
    Contract selectContract(int id);
    boolean updateContract(Contract contract);
    boolean deleteContract(int id);
    boolean insertContract(Contract contract);
    List<Contract> search(String search);
}
