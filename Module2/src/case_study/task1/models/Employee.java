package case_study.task1.models;

import java.util.Objects;

public class Employee extends Person {
    private int employeeCode;
    private String level;
    private String position;
    private int slary;

    public Employee() {
    }

    public Employee(String date, String name, String gender, int ID, int IDPerson, int numberPhone, String email, int employeeCode, String level, String position, int slary) {
        super(date, name, gender, ID, IDPerson, numberPhone, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.slary = slary;
    }

    public Employee(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSlary() {
        return slary;
    }

    public void setSlary(int slary) {
        this.slary = slary;
    }

    public String getIntermediate() {
        return this.level = "Intermediate";
    }

    public String getCollege() {
        return this.level = "College";
    }

    public String getUniversity() {
        return this.level = "University";
    }

    public String getAfterUniversity() {
        return this.level = "After University";
    }

    public String getReceptionist() {
        return this.position = "receptionist";
    }

    public String getServe() {
        return this.position = "serve";
    }

    public String getExpert() {
        return this.position = "expert";
    }

    public String getMonitor(){
        return this.position = "monitor";
    }

    public String getManage(){
        return this.position = "manage";
    }

    public String getManager(){
        return this.position = "manager";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode=" + employeeCode +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", slary=" + slary +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", ID=" + ID +
                ", IDPerson=" + IDPerson +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeCode == employee.employeeCode && slary == employee.slary && Objects.equals(level, employee.level) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeCode, level, position, slary);
    }
}
