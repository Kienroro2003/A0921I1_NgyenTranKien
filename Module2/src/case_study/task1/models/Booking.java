package case_study.task1.models;

public class Booking {
    private int bookingCode;
    private String dayStart;
    private String dayEnd;
    private Customer customerCode;
    private Facility service;

    public Booking() {
    }

    public Booking(int bookingCode,
                   String dayStart,
                   String dayEnd,
                   Customer customerCode,
                   Facility service) {
        this.bookingCode = bookingCode;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.customerCode = customerCode;
        this.service = service;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public Customer getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(Customer customerCode) {
        this.customerCode = customerCode;
    }

    public Facility getService() {
        return service;
    }

    public void setService(Facility service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode=" + bookingCode +
                ", dayStart='" + dayStart + '\'' +
                ", dayEnd='" + dayEnd + '\'' +
                ", customerCode=" + customerCode +
                ", service=" + service +
                '}';
    }
}
