package model.bean;

public class Contract {
    private int contractId;
    private String contractStartDate;
    private String contractEndDate;
    private double contractDeposit;
    private int employeeId;
    private int customerId;
    private int serviceId;

    public Contract() {
    }

    public Contract(int contractId, String contractStartDate, String contractEndDate, double contractDeposit, int employeeId, int customerId, int serviceId) {
        this.contractId = contractId;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractDeposit = contractDeposit;
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.serviceId = serviceId;
    }

    public Contract(String contractStartDate, String contractEndDate, double contractDeposit, int employeeId, int customerId, int serviceId) {
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractDeposit = contractDeposit;
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.serviceId = serviceId;
    }

    public int getContractId() {
        return contractId;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public double getContractDeposit() {
        return contractDeposit;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getServiceId() {
        return serviceId;
    }
}
