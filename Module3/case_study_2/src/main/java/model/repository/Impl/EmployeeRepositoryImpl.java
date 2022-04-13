package model.repository.Impl;

import model.bean.Employee;
import model.repository.BaseRepository;
import model.repository.EmployeeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static final String SELECT_ALL_EMPLOYEE = "select * from employee;";
    private static final String SELECT_EMPLOYEE_BY_ID = "SELECT * FROM EMPLOYEE WHERE employee_id = ?";
    private static final String DELETE_EMPLOYEE_BY_ID = "DELETE FROM EMPLOYEE WHERE employee_id = ?";
    private static final String INSERT_EMPLOYEE = "INSERT INTO EMPLOYEE(employee_name,employee_birthdat,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id) VALUES(?,?,?,?,?,?,?,?);";
    private static final String UPDATE_EMPLOYEE = "UPDATE EMPLOYEE SET employee_name = ?, employee_birthdat = ?, employee_id_card = ?, employee_salary=?,employee_phone=?,employee_email=?,employee_address=?,position_id=? where employee_id =?;";
    private static final String SEARCH_BY_NAME ="SELECT * FROM EMPLOYEE WHERE employee_name like ?";


    @Override
    public List<Employee> selectFindAll() {
        Connection connection = BaseRepository.getConnection();
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("employee_id");
                String name = rs.getString("employee_name");
                String birthday = rs.getString("employee_birthdat");
                String id_card = rs.getString("employee_id_card");
                double salary = rs.getDouble("employee_salary");
                String phone = rs.getString("employee_phone");
                String email = rs.getString("employee_email");
                String address = rs.getString("employee_address");
                int position_id = rs.getInt("position_id");
                Employee employee = new Employee(id, name, birthday, id_card, salary, phone, email, address, position_id);
                employeeList.add(employee);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public Employee selectEmployee(int id) {
        Employee employee = null;
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()) {
                String fullname = rs.getString("employee_name");
                String birthday = rs.getString("employee_birthdat");
                String id_card = rs.getString("employee_id_card");
                double salary = rs.getDouble("employee_salary");
                String phone = rs.getString("employee_phone");
                String email = rs.getString("employee_email");
                String address = rs.getString("employee_address");
                int position_id = rs.getInt("position_id");
                employee = new Employee(id, fullname, birthday, id_card, salary, phone, email, address, position_id);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return employee;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE);
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setDate(2, Date.valueOf(employee.getEmployeeBirthday()));
            preparedStatement.setString(3, employee.getEmployeeIdCard());
            preparedStatement.setDouble(4, employee.getEmployeeSalary());
            preparedStatement.setString(5, employee.getEmployeePhone());
            preparedStatement.setString(6, employee.getEmployeeEmail());
            preparedStatement.setString(7, employee.getEmployeeAddress());
            preparedStatement.setInt(8, employee.getPositionId());
            preparedStatement.setInt(9, employee.getEmployeeId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteEmployee(int id) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1, id);
            int check = preparedStatement.executeUpdate();
            if (check != 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean insertEmployee(Employee employee) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE);
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setDate(2, Date.valueOf(employee.getEmployeeBirthday()));
            preparedStatement.setString(3, employee.getEmployeeIdCard());
            preparedStatement.setDouble(4, employee.getEmployeeSalary());
            preparedStatement.setString(5, employee.getEmployeePhone());
            preparedStatement.setString(6, employee.getEmployeeEmail());
            preparedStatement.setString(7, employee.getEmployeeAddress());
            preparedStatement.setInt(8, employee.getPositionId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Employee> search(String search) {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BY_NAME);
            preparedStatement.setString(1,"%"+search+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                int id = rs.getInt("employee_id");
                String name = rs.getString("employee_name");
                String birthday = rs.getString("employee_birthdat");
                String id_card = rs.getString("employee_id_card");
                double salary = rs.getDouble("employee_salary");
                String phone = rs.getString("employee_phone");
                String email = rs.getString("employee_email");
                String address = rs.getString("employee_address");
                int position_id = rs.getInt("position_id");
                Employee employee = new Employee(id, name, birthday, id_card, salary, phone, email, address, position_id);
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}
