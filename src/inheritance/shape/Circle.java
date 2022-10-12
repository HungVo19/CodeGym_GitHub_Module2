package src.inheritance.shape;

public class Circle extends Shape{
    private double radius;

    Circle(){
        radius = 1.0d;
    }

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
