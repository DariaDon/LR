package LR2;

public class Circle {
    private double R;

    public Circle(double R) {
        this.R = R;
    }

    public double getArea() {
        return Math.PI * R * R;
    }

    public double getPerimeter() {
        return Math.PI * R * 2;
    }
}
