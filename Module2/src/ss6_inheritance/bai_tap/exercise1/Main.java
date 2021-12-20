package ss6_inheritance.bai_tap.exercise1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        System.out.println(circle);
        System.out.println(cylinder);
        circle = new Circle(5, "red");
        cylinder = new Cylinder(5,"red",5);
        System.out.println(circle);
        System.out.println(cylinder);
    }
}
