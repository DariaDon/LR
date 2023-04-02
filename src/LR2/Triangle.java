package LR2;

public class Triangle {
    private double base_side, second_side, third_side, altitude;

    public Triangle(int side, int height){
        this.altitude = height;
        this.base_side = base_side;
        this.second_side = second_side;
        this.third_side = third_side;
    }

    public double getArea(){
        return base_side * altitude / 2;
    }

    public double getPerimeter(){
        return base_side + second_side + third_side;
    }
}
