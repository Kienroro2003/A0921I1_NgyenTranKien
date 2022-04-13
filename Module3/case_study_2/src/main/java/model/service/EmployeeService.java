package model.service;

import model.bean.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> selectFindAll();
    Employee selectEmployee(int id);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(int id);
    List<String> insertEmployee(Employee employee);
    List<Employee> search(String search);
}
