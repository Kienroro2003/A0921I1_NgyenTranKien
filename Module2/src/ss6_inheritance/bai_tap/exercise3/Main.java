package ss6_inheritance.bai_tap.exercise3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2,2);
        System.out.println(point);
        point.setX(5);
        System.out.println(point);
        point.setXY(7,7);
        System.out.println(point);
        Point point1 = new MovablePoint();
        point1.setXY(33,33);
        System.out.println(point1);
        System.out.println(point1.getXY()[0] + " || "+ point1.getXY()[1]);
        MovablePoint movablePoint = new MovablePoint(2,2,5,5);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
        movablePoint.setSpeed(10,10);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
        System.out.println(movablePoint.move().getSpeed());


    }
}
