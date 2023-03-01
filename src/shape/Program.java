package shape;

import shape.shape.Rectangle;
import shape.shape.Shape;
import shape.shape.Square;

public class Program {
    public static void main(String[] args) {
        Square newSquare = new Square();
        newSquare.setSide(5);
        System.out.println(newSquare.area());
        System.out.println(newSquare.perimeter());
        newSquare.setSide(0.0);
        newSquare.setDiagonal(10.0);
        System.out.println(newSquare.area());
        System.out.println(newSquare.perimeter());
        Shape newRectangle = new Rectangle(5.0, 4.0);
        System.out.println(newRectangle.area());
        System.out.println(newRectangle.perimeter());
    }
}
