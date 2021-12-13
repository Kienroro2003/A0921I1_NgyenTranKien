package ss4_Class_And_Object_in_Java.Bai_tap.Fan;

public class Fan {
    final byte SLOW = 1;
    final byte MEDIUM = 1;
    final byte FAST = 1;
    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean isOn, double radius, String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    public byte getSLOW() {
        return SLOW;
    }

    public byte getMEDIUM() {
        return MEDIUM;
    }

    public byte getFAST() {
        return FAST;
    }

    public void setMaxSpeed() {
        this.speed = getFAST();
    }

    public void setMediumSpeed() {
        this.speed = getFAST();
    }

    public void setSlowSpeed() {
        this.speed = getFAST();
    }

    public int getSpeed(){
        return speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color ;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Radius : " + getRadius() + "\n";
        result += "Color : " + getColor() + "\n";
        if (isOn()) {
            result += "fan is On \n";
            result += "Speed : " + getSpeed() + "\n";
        } else {
            result += "fan is Off";
        }
        return result;
    }
}
