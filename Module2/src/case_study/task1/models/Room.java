package case_study.task1.models;

public class Room extends Facility {
    private String serviceFree;

    public Room() {
    }

    public Room(int idFacility,
                String serviceName,
                int usableArea,
                int rentalCosts,
                int maximumPeople,
                String rentalType,
                String serviceFree) {
        super(idFacility, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "idFacility=" + idFacility +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumPeople=" + maximumPeople +
                ", rentalType='" + rentalType + '\'' +
                ", serviceFree='" + serviceFree + '\'' +
                '}';
    }
}
