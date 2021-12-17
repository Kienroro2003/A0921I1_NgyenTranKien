package ss6_Inheritance.Bai_Tap.Exercise3;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] array = {getXSpeed(), getYSpeed()};
        return array;
    }

    @Override
    public String toString() {
        return "( " +
                getX() +
                ", " +
                getY() +
                " ), speed = (" +
                getXSpeed() +
                ", " +
                getYSpeed() +
                " )";
    }

    public MovablePoint move(){
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }
}
