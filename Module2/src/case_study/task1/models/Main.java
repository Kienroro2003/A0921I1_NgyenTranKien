package case_study.task1.models;

import case_study.task1.models.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getManager();
        System.out.println(employee.getPosition());
    }
}
