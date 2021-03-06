package ss7_abstract.bai_tap;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(String color, boolean filled, double side, double v) {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return getWidth() * getLength();
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Length : " + getLength() + ", width : " + getWidth() + ", area : " + getArea();
    }

    @Override
    public void resize(double percent) {
        setLength(getLength() + getLength() * percent / 100);
        setWidth(getWidth() + getWidth() * percent / 100);
    }
}