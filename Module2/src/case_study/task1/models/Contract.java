package case_study.task1.models;

public class Contract {
    private int numberContract;
    private int bookingCode;
    private int advanceDepositAmount;
    private int totaPayment;
    private int customerCode;

    public Contract() {
    }

    public Contract(int numberContract, int bookingCode, int advanceDepositAmount, int totaPayment, int customerCode) {
        this.numberContract = numberContract;
        this.bookingCode = bookingCode;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totaPayment = totaPayment;
        this.customerCode = customerCode;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(int advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public int getTotaPayment() {
        return totaPayment;
    }

    public void setTotaPayment(int totaPayment) {
        this.totaPayment = totaPayment;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }
}
