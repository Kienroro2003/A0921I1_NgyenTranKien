package case_study.task1.models;

public class House extends Facility {
    private int floor;
    private String roomStandard;

    public House() {
    }

    public House(int idFacility,
                 String serviceName,
                 int usableArea,
                 int rentalCosts,
                 int maximumPeople,
                 String rentalType,
                 int floor,
                 String roomStandard) {
        super(idFacility, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.floor = floor;
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    @Override
    public String toString() {
        return "House{" +
                "idFacility=" + idFacility +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumPeople=" + maximumPeople +
                ", rentalType='" + rentalType + '\'' +
                ", floor=" + floor +
                ", roomStandard='" + roomStandard + '\'' +
                '}';
    }
}
