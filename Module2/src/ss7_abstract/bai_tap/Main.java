package ss7_abstract.bai_tap;

public class Main {
    public static void main(String[] args) {
        float i ;
        i = Math.round(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(i);
        shapes[1] = new Rectangle(i,i*2);
        shapes[2] = new Square(i);
        System.out.println("After : ");
        for(Shape x : shapes){
            System.out.println(x);
        }
        System.out.println("Before : ");
        for(Shape x : shapes){
            x.resize(Math.random() * 100);
            System.out.println(x);
        }
    }
}
