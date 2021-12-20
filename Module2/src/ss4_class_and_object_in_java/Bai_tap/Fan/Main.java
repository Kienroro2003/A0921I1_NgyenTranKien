package ss4_class_and_object_in_java.Bai_tap.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setMaxSpeed();
        fan1.setRadius(10);
        fan1.setColor("Yello");
        fan1.setOn(true);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setMediumSpeed();
        fan2.setRadius(5);
        System.out.println(fan2.toString());
    }
}
