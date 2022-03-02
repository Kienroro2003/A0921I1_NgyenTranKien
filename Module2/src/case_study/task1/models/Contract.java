package case_study.task1.models;

public class Contract {
    private int numberContract;
    private Booking bookingCode;
    private int advanceDepositAmount;
    private int totaPayment;
    private Customer customerCode;

    public Contract() {
    }

    public Contract(int numberContract,
                    Booking bookingCode,
                    int advanceDepositAmount,
                    int totaPayment,
                    Customer customerCode) {
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

    public Booking getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(Booking bookingCode) {
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

    public Customer getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(Customer customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContract=" + numberContract +
                ", bookingCode=" + bookingCode +
                ", advanceDepositAmount=" + advanceDepositAmount +
                ", totaPayment=" + totaPayment +
                ", customerCode=" + customerCode +
                '}';
    }
}
