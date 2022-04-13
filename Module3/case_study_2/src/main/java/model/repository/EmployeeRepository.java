package model.repository;

import model.bean.Customer;
import model.bean.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> selectFindAll();
    Employee selectEmployee(int id);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(int id);
    boolean insertEmployee(Employee employee);
    List<Employee> search(String search);
}
