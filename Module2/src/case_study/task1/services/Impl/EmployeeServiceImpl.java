package case_study.task1.services.Impl;

import case_study.task1.models.Employee;
import case_study.task1.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> listEmplouee = new ArrayList<>();

    static {
        listEmplouee.add(new Employee("12/2/2003","Linh","Nu",123,0123123123, 123123,"linh@gmail.com",123,"Dai hoc","giam doc",1230000));
        listEmplouee.add(new Employee("12/2/2003","Linh","Nu",123,0123123123,123123,"linh@gmail.com",123,"Dai hoc","giam doc",1230000));
        listEmplouee.add(new Employee("12/2/2003","Linh","Nu",123,0123123123,123123,"linh@gmail.com",123,"Dai hoc","giam doc",1230000));
    }

    @Override
    public void display() {
        for (Employee employee : listEmplouee) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void add() {
        listEmplouee.add(newEmployee());
        System.out.println("Them moi thanh cong");
    }

    @Override
    public void edit() {
        System.out.println("Nhap id tim kiem: ");
        int checkID = Integer.parseInt(scanner.nextLine());
        for (Employee employee : listEmplouee) {
            if (employee.getID() == checkID) {
                System.out.println("Ban dang sua cho " + employee.getName());
                System.out.println("1. Ngay sinh");
                System.out.println("2. Ten");
                System.out.println("3. Gioi tinh");
                System.out.println("4. ID");
                System.out.println("5. So dien thoai");
                System.out.println("6. Email");
                System.out.println("7. Trinh do");
                System.out.println("8. Vi tri");
                System.out.println("9. Luong");
                System.out.println("10. Ma nhan vien");
                System.out.println("Enter choice: ");
                int choice = 0;
                boolean checkLoop = true;
                while (checkLoop) {
                    try {
                        choice = Integer.parseInt(scanner.nextLine());
                        checkLoop = false;
                    } catch (NumberFormatException ex) {
                        System.out.println("Nhap so cho dung");
                    }
                }
                switch (choice) {
                    case 1: {

                    }
                }
            }
        }
    }

    private Employee newEmployee() {
        System.out.println("Nhap ngay sinh:");
        String date = scanner.nextLine();
        System.out.println("Nhap ho va ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap CMND: ");
        int idPerson = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so dien thoai: ");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap dia chi email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap ma nhan vien: ");
        int employeeCode = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap trinh do: ");
        String level = scanner.nextLine();
        System.out.println("Nhap vi tri: ");
        String position = scanner.nextLine();
        System.out.println("Nhap luong: ");
        int slary = Integer.parseInt(scanner.nextLine());
        Employee employees = new Employee(date, name, gender, id,idPerson, numberPhone, email, employeeCode, level, position, slary);
        return employees;
    }
}
