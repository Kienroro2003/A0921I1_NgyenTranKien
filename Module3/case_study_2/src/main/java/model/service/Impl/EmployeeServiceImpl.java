package model.service.Impl;

import common.Validation;
import model.bean.Employee;
import model.repository.EmployeeRepository;
import model.repository.Impl.EmployeeRepositoryImpl;
import model.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    @Override
    public List<Employee> selectFindAll() {
        return employeeRepository.selectFindAll();
    }

    @Override
    public Employee selectEmployee(int id) {
        return employeeRepository.selectEmployee(id);
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return employeeRepository.updateEmployee(employee);
    }

    @Override
    public boolean deleteEmployee(int id) {
        return employeeRepository.deleteEmployee(id);
    }

    @Override
    public List<String> insertEmployee(Employee employee) {
        List<String> stringList = new ArrayList<>();
        boolean check = true;
        if(Validation.checkName(employee.getEmployeeName())){
            stringList.add("");
        }else{
            check = false;
            stringList.add("Tên sai định dạng");
        }

        if(Validation.checkIdCard(employee.getEmployeeIdCard())){
            stringList.add("");
        }else{
            check = false;
            stringList.add("CMND sai định dạng");
        }

        if(Validation.positiveNumbers(String.valueOf(employee.getEmployeeSalary()))){
            stringList.add("");
        }else{
            check = false;
            stringList.add("Lương sai định dạng");
        }

        if(Validation.checkPhone(String.valueOf(employee.getEmployeePhone()))){
            stringList.add("");
        }else{
            check = false;
            stringList.add("Số điện thoại sai định dạng");
        }

        if(Validation.checkEmail(employee.getEmployeeEmail())){
            stringList.add("");
        }else{
            check = false;
            stringList.add("Email sai định dạng");
        }
        if(check){
            employeeRepository.insertEmployee(employee);
        }

        return stringList;
    }

    @Override
    public List<Employee> search(String search) {

        return employeeRepository.search(search);
    }
}
