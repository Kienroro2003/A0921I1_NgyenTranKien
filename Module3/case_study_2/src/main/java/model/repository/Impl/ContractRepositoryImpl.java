package model.repository.Impl;

import model.bean.Contract;
import model.bean.Service;
import model.repository.BaseRepository;
import model.repository.ContractRepository;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContractRepositoryImpl implements ContractRepository {
    private static final String SELECT_FIND_ALL = "SELECT * FROM CONTRACT";
    private static final String SELECT_CONTRACT_BY_ID = "SELECT * FROM CONTRACT WHERE CONTRACT_ID = ?";
    private static final String INSERT_CONTRACT ="INSERT INTO CONTRACT(contract_start_date,contract_end_date,contract_deposit,employee_id,customer_id,service_id) values(?,?,?,?,?,?);";
    private static final String DELETE_CONTRACT_BY_ID = "DELETE FROM CONTRACT WHERE CONTRACT_ID = ?";
    private static final String UPDATE_CONTRACT = "UPDATE CONTRACT SET contract_start_date = ?, contract_end_date = ?, contract_deposit = ?, employee_id=?,customer_id=?, service_id=? where CONTRACT_ID = ?;";
//    private static final String SEARCH_BY_ID ="SELECT * FROM CONTRACT WHERE customer_name like ?";

    @Override
    public List<Contract> selectFindAll() {
        List<Contract> contractList = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FIND_ALL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int contractId = rs.getInt("contract_id");
                String contractStartDate = rs.getString("contract_start_date");
                String contractEndDate = rs.getString("contract_end_date");
                double contractDeposit = rs.getDouble("contract_deposit");
                int employeeId = rs.getInt("employee_id");
                int customerId =rs.getInt("customer_id");
                int serviceId = rs.getInt("service_id");
                Contract contract = new Contract(contractId,contractStartDate,contractEndDate,contractDeposit,employeeId,customerId,serviceId);
                contractList.add(contract);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contractList;
    }

    @Override
    public Contract selectContract(int id) {
        Contract contract = null;
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CONTRACT_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                String contractStartDate = rs.getString("contract_start_date");
                String contractEndDate = rs.getString("contract_end_date");
                double contractDeposit = rs.getDouble("contract_deposit");
                int employeeId = rs.getInt("employee_id");
                int customerId = rs.getInt("customer_id");
                int serviceId = rs.getInt("service_id");
                contract = new Contract(id,contractStartDate,contractEndDate,contractDeposit,employeeId,customerId,serviceId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contract;
    }

    @Override
    public boolean updateContract(Contract contract) {
        //private static final String UPDATE_CONTRACT = "UPDATE CONTRACT SET
        // contract_start_date = ?,
        // contract_end_date = ?,
        // contract_deposit = ?,
        // employee_id=?,
        // customer_id=?,
        // service_id=?
        // where CONTRACT_ID = ?;";
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CONTRACT);
            preparedStatement.setDate(1, Date.valueOf(contract.getContractStartDate()));
            preparedStatement.setDate(2, Date.valueOf(contract.getContractEndDate()));
            preparedStatement.setDouble(3,contract.getContractDeposit());
            preparedStatement.setInt(4,contract.getEmployeeId());
            preparedStatement.setInt(5,contract.getCustomerId());
            preparedStatement.setInt(6,contract.getServiceId());
            preparedStatement.setInt(7,contract.getContractId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteContract(int id) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CONTRACT_BY_ID);
            preparedStatement.setInt(1,id);
            return preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean insertContract(Contract contract) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CONTRACT);
            preparedStatement.setDate(1, Date.valueOf(contract.getContractStartDate()));
            preparedStatement.setDate(2, Date.valueOf(contract.getContractEndDate()));
            preparedStatement.setDouble(3,contract.getContractDeposit());
            preparedStatement.setInt(4,contract.getEmployeeId());
            preparedStatement.setInt(5,contract.getCustomerId());
            preparedStatement.setInt(6,contract.getServiceId());
            return preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Contract> search(String search) {
        return null;
    }
}
