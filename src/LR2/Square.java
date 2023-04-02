package LR2;

public class Square {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getArea() {
        return a * a;
    }

    public double getPerimeter() {
        return a * 4;
    }
}
