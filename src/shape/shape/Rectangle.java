package shape.shape;

public class Rectangle extends Shape<Double>{
    private double sideA;
    private double sideB;
    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public Double perimeter() {
        return 2 * this.sideA + 2 * this.sideB;
    }

    @Override
    public Double area() {
        return this.sideA * this.sideB;
    }
}
