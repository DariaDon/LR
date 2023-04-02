package LR2;

public class Rectangle{
    private double length, width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void setLength (double length) {
        this.length = length;
    }

    public double getLength () {
        return length;
    }

    public void setWidth (double width) {
        this.width = width;
    }

    public double getWidth () {
        return width;
    }
    public double getPerimeter () {
        return 2 * (this.length + this.width);
    }

    public double getArea () {
        return this.length * this.width;
    }
}
