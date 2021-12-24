package case_study.task1.models;

public class Employee extends Person {
    private int employeeCode;
    private String level;
    private String position;
    private int slary;

    public Employee() {
    }

    public Employee(int date, String name, String gender, int ID, int numberPhone, String email, int employeeCode) {
        super(date, name, gender, ID, numberPhone, email);
        this.employeeCode = employeeCode;
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


}
