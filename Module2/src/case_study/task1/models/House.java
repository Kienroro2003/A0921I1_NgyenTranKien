package case_study.task1.models;

public class House extends Facility {
    private int floor;
    private String roomStandard;

    public House() {
    }

    public House(int floor, String roomStandard) {
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
}
