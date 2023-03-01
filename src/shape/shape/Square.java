package shape.shape;

public class Square extends Shape<Double> {
    private double side;
    private double diagonal;

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.diagonal = side * Math.pow(2, 0.5);
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
        this.side = this.diagonal / Math.pow(2, 0.5);
    }

    @Override
    public Double perimeter() {
        if (this.side != 0.0) {
            return this.side * 4.0;
        } else if (this.diagonal != 0.0) {
            return (this.diagonal / Math.pow(2, 0.5)) * 4;
        } else return 0.0;
    }

    @Override
    public Double area() {
        if (this.side != 0.0) {
            return this.side * this.side;
        } else if (this.diagonal != 0.0) {
            return this.diagonal * this.diagonal / 2;
        } else return 0.0;
    }
}