package model.bean;

public class Service {
    private int serviceId;
    private String serviceName;
    private int serviceArea;
    private double serviceCost;
    private int serviceMaxPeople;
    private String standardRoom;
    private String descriptionOtherConveniece;
    private double poolArea;
    private int numberOfFloors;
    private String serviceCode;

    public String getServiceCode() {
        return serviceCode;
    }

    public Service(String serviceName, int serviceArea, double serviceCost, int serviceMaxPeople, String standardRoom, String descriptionOtherConveniece, double poolArea, int numberOfFloors, String serviceCode) {
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.standardRoom = standardRoom;
        this.descriptionOtherConveniece = descriptionOtherConveniece;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.serviceCode = serviceCode;
    }

    public Service(int serviceId, String serviceName, int serviceArea, double serviceCost, int serviceMaxPeople, String standardRoom, String descriptionOtherConveniece, double poolArea, int numberOfFloors, String serviceCode) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.standardRoom = standardRoom;
        this.descriptionOtherConveniece = descriptionOtherConveniece;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.serviceCode = serviceCode;
    }

    public Service() {
    }

    public Service(String serviceName, int serviceArea, double serviceCost, int serviceMaxPeople, String standardRoom, String descriptionOtherConveniece, double poolArea, int numberOfFloors) {
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.standardRoom = standardRoom;
        this.descriptionOtherConveniece = descriptionOtherConveniece;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Service(int serviceId, String serviceName, int serviceArea, double serviceCost, int serviceMaxPeople, String standardRoom, String descriptionOtherConveniece, double poolArea, int numberOfFloors) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.standardRoom = standardRoom;
        this.descriptionOtherConveniece = descriptionOtherConveniece;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public int getServiceId() {
        return serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getServiceArea() {
        return serviceArea;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public String getDescriptionOtherConveniece() {
        return descriptionOtherConveniece;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }
}
