package ss7_abstract.bai_tap;

public class Square extends Rectangle implements Colorable {

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        setWidth(side);
    }

    @Override
    public void setLength(double side) {
        setLength(side);
    }

    @Override
    public String toString() {
        return "Side : " +
                getSide() +
                ", area : " +
                getArea();
    }

    @Override
    public void resize(double percent) {
        this.setSide(getSide() + getSide() * percent / 100);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
