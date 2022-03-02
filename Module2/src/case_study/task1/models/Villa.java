package case_study.task1.models;

public class Villa extends Facility {
    private String roomStandard;
    private int areaSwimmingPool;
    private int floor;

    public Villa() {
    }

    public Villa(int idFacility,
                 String serviceName,
                 int usableArea,
                 int rentalCosts,
                 int maximumPeople,
                 String rentalType,
                 String roomStandard,
                 int areaSwimmingPool,
                 int floor) {
        super(idFacility, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.areaSwimmingPool = areaSwimmingPool;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getAreaSwimmingPool() {
        return areaSwimmingPool;
    }

    public void setAreaSwimmingPool(int areaSwimmingPool) {
        this.areaSwimmingPool = areaSwimmingPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "idFacility=" + idFacility +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumPeople=" + maximumPeople +
                ", rentalType='" + rentalType + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", areaSwimmingPool=" + areaSwimmingPool +
                ", floor=" + floor +
                '}';
    }
}
