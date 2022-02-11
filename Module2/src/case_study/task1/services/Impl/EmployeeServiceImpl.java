package case_study.task1.services.Impl;

import case_study.task1.models.Employee;
import case_study.task1.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> listEmplouee = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for(Employee employee : listEmplouee){
            System.out.println(employee.toString());
        }
    }

    @Override
    public void add() {
        listEmplouee.add(newEmployee());
    }

    @Override
    public void returnMainMenu() {

    }

    private Employee newEmployee(){
        System.out.println("Nhap ngay sinh:");
        int date = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ho va ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so dien thoai: ");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap dia chi email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap ma nhan vien: ");
        int employeeCode = Integer.parseInt(scanner.nextLine());
        Employee employees = new Employee(date,name,gender,id,numberPhone,email,employeeCode);
        return employees;
    }
}
