package case_study.task1.models;

public class Villa extends Facility {
    private String roomStandard;
    private int areaSwimmingPool;
    private int floor;

    public Villa() {
    }

    public Villa(String roomStandard, int areaSwimmingPool, int floor) {
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
}
