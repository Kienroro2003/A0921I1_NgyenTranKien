package ss7_abstract.bai_tap;

public class SquareTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Square(3);
        shapes[1] = new Square(2);
        shapes[2] = new Circle(3.4);
        shapes[3] = new Rectangle(3,5);
        for(Shape i : shapes){
            if(i instanceof Colorable){
                Colorable y = (Colorable) i;
                (y).howToColor();
            }
        }

    }
}
