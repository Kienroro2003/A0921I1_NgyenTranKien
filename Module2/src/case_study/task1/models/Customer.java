package case_study.task1.models;

public class Customer extends Person {
    private int customerCode;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(int customerCode, String customerType, String address) {
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String date, String name, String gender, int ID, int IDPerson, int numberPhone, String email, int customerCode, String customerType, String address) {
        super(date, name, gender, ID, IDPerson, numberPhone, email);
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDiamond(){
        return this.customerType = "Diamond";
    }

    public String getPlatinium(){
        return this.customerType = "Platinium";
    }

    public String getGold(){
        return this.customerType = "Gold";
    }

    public String getSilver(){
        return this.customerType = "Silver";
    }

    public String getMember(){
        return this.customerType = "Member";
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode=" + customerCode +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", ID=" + ID +
                ", IDPerson=" + IDPerson +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
